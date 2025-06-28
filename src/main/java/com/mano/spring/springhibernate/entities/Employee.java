package com.mano.spring.springhibernate.entities;

import org.springframework.beans.factory.annotation.Autowired;




@javax.persistence.Entity

public class Employee {
	
	@javax.persistence.Id
	private int id;
	
	
	private String ename;
	private String address;
	private String contact;
	private int exp;
	
	public Employee(){}
	
	
	public Employee(int id, String ename, String address, String contact, int exp) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.contact = contact;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
