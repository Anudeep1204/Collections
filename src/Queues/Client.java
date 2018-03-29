package Queues;

import java.util.PriorityQueue;

public class Client {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue(new ComparatorX());
	
		pq.add(new Employee(1,21,"Zaheer"));
		pq.add(new Employee(5,20,"Anudeep"));
		pq.add(new Employee(2,26,"Mohammed"));
		pq.add(new Employee(3,25,"Yakub"));
		pq.add(new Employee(4,22,"Imran"));
			
			for(Object x:pq) {
				System.out.println(x);
			}
		
		/*while (!pq.isEmpty()) {
		    System.out.println(pq.poll());
		}*/ //for rerieving the elements in sorted order


		
	}

}
