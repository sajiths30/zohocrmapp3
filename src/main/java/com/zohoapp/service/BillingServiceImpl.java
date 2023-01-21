package com.zohoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoapp.entity.Billing;
import com.zohoapp.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingServcie {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);

	}

}
