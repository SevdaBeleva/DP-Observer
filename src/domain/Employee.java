package domain;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private int salary;
	private LocalDate hireDate;
	private int employeeId;
	private boolean working = false;
	
	private static int COUNTER;
	
	public Employee(String name, int salary, LocalDate hireDate, boolean working) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.working = working;
		
		employeeId = ++COUNTER;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + ", employeeId=" + employeeId
				+ ", working=" + working + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	

}
