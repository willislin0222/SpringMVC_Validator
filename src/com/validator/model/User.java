package com.validator.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	private String name;
	private String address;
	private String email;
	
	@NotEmpty(message="名字: 請勿空白")
	@Size(min=2,max=6,message="名字: 長度必需在{min}到{max}之間")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@NotEmpty(message="地址: 請勿空白")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@NotEmpty(message="信箱: 請勿空白")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
