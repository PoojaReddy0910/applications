package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	int eid;
	 private String ename;
	 private List skillset;
	 private Set phneno;
	 private Department department;
	 private Map eMail;
	 private Properties app_props;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List getSkillset() {
		return skillset;
	}
	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}
	public Set getPhneno() {
		return phneno;
	}
	public void setPhneno(Set phneno) {
		this.phneno = phneno;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Map geteMail() {
		return eMail;
	}
	public void seteMail(Map eMail) {
		this.eMail = eMail;
	}
	public Properties getApp_props() {
		return app_props;
	}
	public void setApp_props(Properties app_props) {
		this.app_props = app_props;
	}
	
	public Employee(int eid, String ename, List skillset, Set phneno, Department department, Map eMail,
			Properties app_props) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.skillset = skillset;
		this.phneno = phneno;
		this.department = department;
		this.eMail = eMail;
		this.app_props = app_props;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", skillset=" + skillset + ", phneno=" + phneno
				+ ", department=" + department + ", eMail=" + eMail + ", app_props=" + app_props + "]";
	}
	
}
