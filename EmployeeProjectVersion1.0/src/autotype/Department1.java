package autotype;

public class Department1 {
	private int deptid1;
	private String dname1;
	public int getDeptid1() {
		return deptid1;
	}
	public void setDeptid1(int deptid1) {
		this.deptid1 = deptid1;
	}
	public String getDname1() {
		return dname1;
	}
	public void setDname1(String dname1) {
		this.dname1 = dname1;
	}
	@Override
	public String toString() {
		return "Department1 [deptid1=" + deptid1 + ", dname1=" + dname1 + "]";
	}
	public Department1() {
		super();
	}

}
