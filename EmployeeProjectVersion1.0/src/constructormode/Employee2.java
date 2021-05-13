package constructormode;

public class Employee2 {
	private int empId;
	private String empName;
    private Department2 dept;
    public Employee2(Department2 dept) {
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}
//	public Employee2() {
//	super();
//}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department2 getDept() {
		return dept;
	}
	public void setDept(Department2 dept) {
		this.dept = dept;
	}
}
