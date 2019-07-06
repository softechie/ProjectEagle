package com.pel2.dao.impl.hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "employee")
public class Candidate {
    @Id
    @GeneratedValue
    @Column(name = "empid")
    private Integer empId;
    @Column(length = 100)
    private String name;
    @Column(nullable = false)
    private String status;
    private Integer tenure;
    @Column(length = 15)
    private String phone;
    @Column(length = 52)
    private String email;
    @Basic
    @Column(name = "joining_date")
    private Date doj;
    @Column(name = "workloc")
    private String wl;		/* Work Location */
    @Column(name = "homeloc")
    private String hl;		/* Home Location */
    @Column(name = "currentloc")
    private String cl;		/* Current Location */
    @Column(name = "isrelocate",nullable = false)
    private String rmid;     /* willing to relocate YES/NO/NA */
    private Integer roleid;
    @Column(name = "verticalid")
    private Integer vertid;
    @Column(name = "accountid")
    private Integer acctid;

    public Candidate(){}

    public Candidate(Integer empId, String name, String status, Integer tenure, String phone, String email, Date doj,
                    String wl, String hl, String cl, String rmid, Integer roleid, Integer vertid, Integer acctid) {
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


    public Integer getEmpId() {
        return empId;
    }


    public void setEmpId(Integer empId) {
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


    public Integer getTenure() {
        return tenure;
    }


    public void setTenure(Integer tenure) {
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


    public Date getDoj() {
        return doj;
    }


    public void setDoj(Date doj) {
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


    public Integer getRoleid() {
        return roleid;
    }


    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }


    public Integer getVertid() {
        return vertid;
    }


    public void setVertid(Integer vertid) {
        this.vertid = vertid;
    }


    public Integer getAcctid() {
        return acctid;
    }


    public void setAcctid(Integer acctid) {
        this.acctid = acctid;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", name=" + name + ", status=" + status + ", tenure=" + tenure + ", phone=" + phone + ", email=" + email + ", doj=" + doj + ", wl=" + wl + ", hl=" + hl + ", cl=" + cl + ", rmid=" + rmid + ", roleid=" + roleid + ", vertid=" + vertid + ", acctid=" + acctid + '}';
    }

}
