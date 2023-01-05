package infosys.tester;

import infosys.Employee;

public class Tester extends Employee{
	
	float shiftAllownce;
	
	
	public float getTesterSalary() {
		
		return getSalary() + getShiftAllownce();
	}
	
	public float getShiftAllownce() {
		return shiftAllownce;
	}

	public void setShiftAllownce(float shiftAllownce) {
		this.shiftAllownce = shiftAllownce;
	}
	
	

}
