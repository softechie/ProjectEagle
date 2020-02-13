package com.pel2.dto;


/**
 * @author mbaransln
 * Data transfer object being used by API to transfer the Employee data over network.
 *
 */
public class Employee {


	private String empId;
	private String name;
	private String status;
	private String tenure;
	private String phone;
	private String email;
	private String doj;
	private String wl;		/* Work Location */
	private String hl;		/* Home Location */
	private String cl;		/* Current Location */
	private String rmid;     /* willing to relocate YES/NO/NA */
	private String roleid;
	private String vertid;
	private String acctid;

	public Employee(){}

	public Employee(String empId, String name, String status, String tenure, String phone, String email, String doj,
					String wl, String hl, String cl, String rmid, String roleid, String vertid, String acctid) {
		super();
		this.empId = empId;
		this.name = name;
		this.status = status;
		this.tenure = tenure;
		this.phone = phone;
		this.email = email;
		this.doj = doj;
		this.wl = wl;
		this.hl = hl;
		this.cl = cl;
		this.rmid = rmid;
		this.roleid = roleid;
		this.vertid = vertid;
		this.acctid = acctid;
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


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public String getWl() {
		return wl;
	}


	public void setWl(String wl) {
		this.wl = wl;
	}


	public String getHl() {
		return hl;
	}


	public void setHl(String hl) {
		this.hl = hl;
	}


	public String getCl() {
		return cl;
	}


	public void setCl(String cl) {
		this.cl = cl;
	}


	public String getRmid() {
		return rmid;
	}


	public void setRmid(String rmid) {
		this.rmid = rmid;
	}


	public String getRoleid() {
		return roleid;
	}


	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}


	public String getVertid() {
		return vertid;
	}


	public void setVertid(String vertid) {
		this.vertid = vertid;
	}


	public String getAcctid() {
		return acctid;
	}


	public void setAcctid(String acctid) {
		this.acctid = acctid;
	}

	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", name=" + name + ", status=" + status + ", tenure=" + tenure + ", phone=" + phone + ", email=" + email + ", doj=" + doj + ", wl=" + wl + ", hl=" + hl + ", cl=" + cl + ", rmid=" + rmid + ", roleid=" + roleid + ", vertid=" + vertid + ", acctid=" + acctid + '}';
	}
        
}

