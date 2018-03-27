package LinkedListMethods;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListClient{

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		LinkedList ll1=new LinkedList();
		LinkedList ll2=new LinkedList();
		LinkedList ll3=new LinkedList();
		LinkedList ll4=new LinkedList();
		
		System.out.println("***********LinkedList Methods**************");
		ll.add(20);
		ll.add(24);
		ll.add(26);
		ll.add(28);
		ll.add(30);
		ll.add(32);
		ll.add(28);
		System.out.println("After Adding : "+ll);
		
		ll.add(2, 25);
		System.out.println("After Adding at 2 index: "+ll);
		
		ll1.addAll(ll);
		ll1.add(34);
		ll1.add(36);
		System.out.println("After AddAll : "+ll1);
		
		ll2.addAll(ll1);
		ll2.addAll(0, ll);
		System.out.println("After AddAll at 0 index"+ll2);
		
		ll2.clear();
		System.out.println("After Clear : "+ll2);
		
		ll4=(LinkedList) ll.clone();
		System.out.println("After Clone : "+ll4);
		
		if(ll1.contains(34)) {
			System.out.println("Contains 34");
		}
		else {
			System.out.println("Doesnot Contain 34");
		}
		
		
		Iterator it=ll.descendingIterator();
		while(it.hasNext()) {
			System.out.println("Descending Iterator of ll : "+it.next());			
		}
		
		
		System.out.println("Element(returns the first element(Head Element) but doesnot remove) : "+ll.element());
		
		
		System.out.println("Getting Element : "+ll1.get(0));
		
		
		System.out.println("Get First : "+ll.getFirst());
		
		
		System.out.println("Get Last : "+ll.getLast());
		
		
		System.out.println("IndexOF : "+ll2.indexOf(20));//returns -1 because al2 doesnot contains any element
		System.out.println("IndexOF : "+ll.indexOf(28));//first occurance of 28 in ll is at 4th index position
		
		
		System.out.println("Last IndexOF : "+ll.lastIndexOf(28));//last occurance of 28 in ll is at 7th index position

		
		ListIterator litr1=ll.listIterator();
		ListIterator litr=ll.listIterator(5);
		while(litr1.hasNext()) {
			System.out.println("List Iterator total : "+litr1.next());
		}
		while(litr.hasNext()) {
			System.out.println("List Iterator Forward : "+litr.next());
		}
		while(litr.hasPrevious()) {
			System.out.println("List Iterator Backward : "+litr.previous());
		}
		
		ll.offer(32);
		System.out.println("After Offer in ll : "+ll);//32 is added in ll in the last
		
		ll.offerFirst(18);
		System.out.println("After OfferFirst in ll : "+ll);//18 is added in ll in the first
		
		
		ll.offerLast(34);
		System.out.println("After OfferLast in ll : "+ll);//34 is added in ll in the last
		
		
		System.out.println("Peek(Head Element) of ll : "+ll.peek());
		
		
		System.out.println("PeekFirst(Head Element) of ll : "+ll.peekFirst());
		

		System.out.println("PeekLast(Tail Element) of ll : "+ll.peekLast());
		
		ll.remove(2);
		System.out.println("After removing 2 index 25 in ll : "+ll);
		
		//for integer elements you have to mention new Integer as object
		ll.remove(new Integer(28));
		System.out.println("After removing 28 al : "+ll);
		//for characters no need of object
		ll.add("E");
		ll.add(54);
		ll.add(120);
		ll.add("E");
		System.out.println("After adding E in al: "+ll);
		ll.remove("E");
		System.out.println("After removing E in al : "+ll);
		
		ll3.addAll(ll);
		System.out.println("After Adding ll Elements to ll3"+ll3);
		ll3.removeAll(ll);
		System.out.println("After Removing Elements of ll in ll3"+ll3);
		
		
		System.out.println("ll elements : "+ll);
		System.out.println("ll1 elements : "+ll1);
		ll1.retainAll(ll);
		System.out.println("After Retaining All  : "+ll1);

		
		ll.set(8, 122);
		System.out.println("After Replacing at 6th index in ll: "+ll);
		
		
		System.out.println("Size : "+ll.size());
		
		
		System.out.println("Sublist From index 2 to index 6 in ll : "+ll.subList(2, 6));//including 2 index but excluding 8 index
		
		
		ll.toArray();
		System.out.println("LinkedList to Array : "+ll);
		
		//toArray(T[] a)
		
		
	}

}
