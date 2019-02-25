package observer;

import domain.Employee;

public interface IObserver {

	void notifyMe(Employee e, String msg);
}
