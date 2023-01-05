package infosys.developer;

import infosys.Employee;

public class SWDeveloper extends Employee{
	
	private float bonus;
	
	public float getSWSalary() {
		
		return getSalary()+ getBonus();
	}
	
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

}
