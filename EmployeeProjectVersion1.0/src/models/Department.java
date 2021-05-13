package models;

public class Department {
	int deptid;
	String dname;
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

}
