package com.mahendra.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private Integer custId;
	private String name;
	private String email;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
