package subject;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import domain.Employee;
import observer.IObserver;

public class EmployeeManagement implements ISubject {
	
	private String message;
	
	private Employee employee;
	
	private EmployeeDao empDao;
	
	private List<IObserver> listOfObservers;
	
	private List<Employee> listOfEmployees;
	
	public EmployeeManagement() {
		listOfObservers = new ArrayList();
		empDao = new EmployeeDao();
		listOfEmployees = empDao.generateEmployees();
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		listOfObservers.add(observer);		
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer : listOfObservers) {
			observer.notifyMe(employee, message);
		}		
	}

	@Override
	public void removeObserver(IObserver observer) {
		listOfObservers.remove(observer);
		
	}
	
	public void hireEmployee(Employee emp) {
		employee = emp;
		message = "Employee hired";
		listOfEmployees.add(emp);
		notifyObservers();
	}
	
	public void modifyEMployee(int id, String newName) {
		boolean notify = false;
		
		for (Employee emp : listOfEmployees) {
			if(id == emp.getEmployeeId()) {
				emp.setName(newName);
				this.message = "Employee modified";
				this.employee = emp;
				notify = true;
			}
		}
		
		if(notify) {
			notifyObservers();
		}
	}
	
}
