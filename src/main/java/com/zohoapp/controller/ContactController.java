package com.zohoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoapp.entity.Billing;
import com.zohoapp.entity.Contact;
import com.zohoapp.service.BillingServcie;
import com.zohoapp.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingServcie billingService;
	
	@RequestMapping("/listcontacts")
	public String ListContact(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts"; 
	}
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id")long id,Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill,Model model) {
		billingService.generateBill(bill);
		return "list_bill";
	}
}
