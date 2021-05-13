package autotype;

public class Employee1 {
	private int eid1;
	private String ename1;
	private Department1 dep1;
	@Override
	public String toString() {
		return "Employee1 [eid1=" + eid1 + ", ename1=" + ename1 + ", dep1=" + dep1 + "]";
	}
	public Employee1() {
		super();
	}
	public int getEid1() {
		return eid1;
	}
	public void setEid1(int eid1) {
		this.eid1 = eid1;
	}
	public String getEname1() {
		return ename1;
	}
	public void setEname1(String ename1) {
		this.ename1 = ename1;
	}
	public Department1 getDep1() {
		return dep1;
	}
	public void setDep1(Department1 dep1) {
		this.dep1 = dep1;
	}

}
