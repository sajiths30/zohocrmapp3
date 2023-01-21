package com.zohoapp.service;

import java.util.List;

import com.zohoapp.entity.Lead;

public interface LeadService {
 public void saveLead(Lead lead);

public Lead getLeadById(long id);

public void deletLeadById(long id);

public List<Lead> getAllLeads();
}
