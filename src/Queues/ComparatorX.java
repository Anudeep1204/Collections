package Queues;

import java.util.Comparator;

public class ComparatorX implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		int idCompare=e1.getId().compareTo(e2.getId());
		return idCompare;
		
	}

}
