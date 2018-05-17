package com.springboot.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {
	
	@Id
	public String id;

	private String empId;
	private String name;
	private String status;
	private String tenure;
	private String phone;
	private String email;
	
	public Employee(){}
	public Employee(String empId, String name, String status, String tenure, String phone, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.status = status;
		this.tenure = tenure;
		this.phone = phone;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", name=" + name + ", status=" + status + ", tenure="
				+ tenure + ", phone=" + phone + ", email=" + email + "]";
	}
}

