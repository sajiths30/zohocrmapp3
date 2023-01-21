package com.zohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoapp.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
