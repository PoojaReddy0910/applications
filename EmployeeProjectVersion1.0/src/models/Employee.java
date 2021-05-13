package models;

public class Employee {
	private int id;
	private String sname;
	private Department dep;
	private double salary;
	private   double pfamount;
	private double pfpercentage;
	private double commission;
	private double netsalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPfamount() {
		return pfamount;
	}
	public void setPfamount(double pfamount) {
		this.pfamount = pfamount;
	}
	public double getPfpercentage() {
		return pfpercentage;
	}
	public void setPfpercentage(double pfpercentage) {
		this.pfpercentage = pfpercentage;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	 public double calculateNetSalary() {
	        pfamount = salary * pfpercentage;
	        return netsalary = salary - pfamount;
	    }

	 

	    @Override
	    public String toString() {
	        return "Employee [empId=" + id + ", eName=" + sname + ", commission=" + commission + ", salary=" + salary
	                + ", pfamount=" + pfamount + ", pfpercentage=" + pfpercentage + ", netSalary=" + calculateNetSalary() + ", dept="
	                + dep + "]";
	    }
	public Employee(int id, String sname, Department dep, double salary, double pfamount, double pfpercentage,
			double commission) {
		super();
		this.id = id;
		this.sname = sname;
		this.dep = dep;
		this.salary = salary;
		this.pfamount = pfamount;
		this.pfpercentage = pfpercentage;
		this.commission = commission;
	}
	public Employee() {
		super();
	}
	
	}
	


