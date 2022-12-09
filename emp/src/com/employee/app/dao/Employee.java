package com.employee.app.dao;

import java.util.Date;

public class Employee {
	private int id;
	private String name,domain,doj;
	
	public Employee(int id,String name,String domain,String doj) {
		this.name=name;
		this.domain=domain;
		this.doj=doj;
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

}
