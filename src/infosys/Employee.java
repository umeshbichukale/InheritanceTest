package infosys;

public class Employee {
	
	 private  int empId;
	 private String Name;
	 private float salary;
	 private String mobNo;
	 
	public int getEmpId() {
		System.out.println("Parent Class id");
		return empId;
	}
	public void setEmpId(int empId) { this.empId = empId; }
	public String getName() {
		return Name;
	}
	public void setName(String name) { Name = name;}
	
	public float getSalary() {
		System.out.println("Parent Class Salary");
		return salary;
	}
	public void setSalary(float salary) { this.salary = salary; }
	public String getMobNo() { return mobNo; }
	public void setMobNo(String mobNo) { this.mobNo = mobNo; }
}
