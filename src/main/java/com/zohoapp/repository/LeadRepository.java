package com.zohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoapp.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
