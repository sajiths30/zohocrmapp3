package com.zohoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact extends AbstractClass{
 
	@Column(name="sim",nullable=false)
	private String sim;
	@Column(name="mobile",nullable=false)
	private long mobile;
	@Column(name="email",nullable=false)
	private String email;
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
