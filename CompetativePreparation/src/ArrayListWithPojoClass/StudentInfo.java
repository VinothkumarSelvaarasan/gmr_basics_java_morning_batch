package ArrayListWithPojoClass;

public class StudentInfo {

	private int registerationNumber;
	private String name;
	private String department;
	public int getRegisterationNumber() {
		return registerationNumber;
	}
	public void setRegisterationNumber(int registerationNumber) {
		this.registerationNumber = registerationNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "StudentInfo [registerationNumber=" + registerationNumber + ", name=" + name + ", department="
				+ department + "]";
	}
	

	
	
	
	
}
