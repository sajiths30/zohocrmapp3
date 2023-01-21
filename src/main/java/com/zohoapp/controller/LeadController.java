package com.zohoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoapp.entity.Contact;
import com.zohoapp.entity.Lead;
import com.zohoapp.service.ContactService;
import com.zohoapp.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactServcie;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
  private String viewCreateForm() {
	  return "create_lead";
  }
	@RequestMapping("/saveLead")
	private String saveLead(@ModelAttribute("lead")Lead lead,  Model model ) {
		leadService.saveLead(lead);
		return"lead_info";
	}
	@RequestMapping("/convertLead")
	private String ConvertLead(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		
		Contact contact=new Contact();
		contact.setSim(lead.getSim());
		contact.setMobile(lead.getMobile());
		contact.setEmail(lead.getEmail());
		 
		leadService.deletLeadById(id);
		
		List<Contact> contacts = contactServcie.getAllContacts();
		model.addAttribute("contacts", contacts);
		contactServcie.saveContact(contact);
		return "list_contatcs";
	}
	//http://localhost:8080/listleads
	@RequestMapping("/listleads")
	private String ListLead(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id")long id, Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
