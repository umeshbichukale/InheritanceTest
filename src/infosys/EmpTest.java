package infosys;

import infosys.developer.SWDeveloper;
import infosys.tester.Tester;

public class EmpTest {
	
	public static void main(String[] args) {
		
		SWDeveloper dev = new SWDeveloper();
		dev.setEmpId(10);
		dev.setMobNo("45787956454");
		dev.setName("Umesh");
		dev.setSalary(10000);
		dev.setBonus(2000);		
		
		System.out.println("SW Developer Id is " + dev.getEmpId());
		System.out.println("SW Developer Salary is " +dev.getSWSalary());
		
		Tester test = new Tester();
		test.setEmpId(50);
		test.setMobNo("564879855");
		test.setName("Suyog");
		test.setSalary(10000);
		test.setShiftAllownce(5000);
		
		System.out.println("SW Tester Id is " + test.getEmpId());
		System.out.println("SW Tester Salary is " +test.getTesterSalary());
			
	}
}
