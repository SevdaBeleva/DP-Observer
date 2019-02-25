package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;

public class EmployeeDao {
	
	private Employee empOne = new Employee("John", 5000, LocalDate.now(), true);
	private Employee empTwo = new Employee("Sarah", 4000, LocalDate.now(), false);
	private Employee empThree = new Employee("Michel", 3500, LocalDate.now(), true);
	private Employee empFour = new Employee("Ivan", 5500, LocalDate.now(), true);
	private Employee empFive = new Employee("Todor", 4800, LocalDate.now(), false);
	
	private List<Employee> empList;
	
	public EmployeeDao() {
		empList = new ArrayList<>();
		
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);
		empList.add(empFour);
		empList.add(empFive);
	}
	
	public void addEmployees(Employee emp) {
		empList.add(emp);
	}
	
	public List<Employee> generateEmployees() {
		return empList;
	}
		
}
