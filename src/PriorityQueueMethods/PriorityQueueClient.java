package PriorityQueueMethods;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClient {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		PriorityQueue pq1=new PriorityQueue();
		
		System.out.println("*********Priority Queue Methods************");
		
		pq.add(1);
		pq.add(100);
		pq.add(21);
		pq.add(2011);
		pq.add(1108);
		pq.add(108);
		
		pq1.add(1);
		pq1.add(100);
		pq1.add(21);
		pq1.add(2011);
		pq1.add(1108);
		pq1.add(108);
		
		
		Comparator com=pq.comparator();//returns null if the order is in natural ordering
		System.out.println(com);

		
		System.out.println("Contains : "+pq.contains(100)); //returns true because if 100 is present in queue
		
		
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator : "+itr.next());
		}
		
		
		pq.offer(200);
		System.out.println(pq);
		
		
		System.out.println("Peek : "+pq.peek());//it does not removes the element but it just retrieves the element
		
		
		System.out.println("Poll : "+pq.poll());//it retrieves and removes the element
		System.out.println("Again Poll : "+pq.poll());
		
	
		System.out.println("Remove : "+pq.remove(200));//removes specified element
		System.out.println(pq);
		
		
		System.out.println("Size : "+pq.size());
		
		//converts elements to array but using object rather than int
		Object a[]=pq.toArray();
		for(int i=0; i<a.length;i++) {
		System.out.println("To Array : "+a[i]);
		}
		
		System.out.println(pq1);
		pq1.clear();
		System.out.println(pq1);
		
	 	//toArray(T[] a)
	}

}
