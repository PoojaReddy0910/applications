package constructormode;

public class Department2 {
	private int DepId;
	private String DepName;
	public Department2() {
		super();
	}
	@Override
	public String toString() {
		return "Department2 [DepId=" + DepId + ", DepName=" + DepName + "]";
	}
	public int getDepId() {
		return DepId;
	}
	public void setDepId(int depId) {
		DepId = depId;
	}
	public String getDepName() {
		return DepName;
	}
	public void setDepName(String depName) {
		DepName = depName;
	}

}
