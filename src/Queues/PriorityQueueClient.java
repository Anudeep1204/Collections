package Queues;

import java.util.PriorityQueue;

public class PriorityQueueClient {

	public static void main(String[] args) {
		
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(1);
		pq.add(3);
		pq.add(4);
		pq.add(2);
		pq.add(5);
		
			System.out.println(pq);
		
		
		/*while (!pq.isEmpty()) {
		    System.out.println(pq.poll());
		}*/ //for rerieving the elements in sorted order


		
	}

}
