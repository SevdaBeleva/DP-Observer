package test;

import java.time.LocalDate;

import domain.Employee;
import observer.HRDepartment;
import observer.IObserver;
import observer.PayrollDepartment;
import subject.EmployeeManagement;

public class App {

	public static void main(String[] args) {
		IObserver hrDep = new HRDepartment();
		IObserver payrollDep = new PayrollDepartment();		
		EmployeeManagement empMan = new EmployeeManagement();
		
		empMan.registerObserver(hrDep);
		empMan.registerObserver(payrollDep);
		
		Employee newEmp = new Employee("Angel", 4600, LocalDate.now(), true);
		
		empMan.hireEmployee(newEmp);
		empMan.modifyEMployee(6, "Alexandra");
	}

}
