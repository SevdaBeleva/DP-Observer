package observer;

import domain.Employee;

public class PayrollDepartment implements IObserver {

	@Override
	public void notifyMe(Employee e, String msg) {
		System.out.println("HR department notified....");
		System.out.println(e.getName() + " " + msg);			
	}

}
