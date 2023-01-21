package com.zohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoapp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
