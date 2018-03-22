package ArrayListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClient {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		ArrayList al2=new ArrayList();
		
		System.out.println("***********ArrayList Methods**************");
		al.add(20);
		al.add(24);
		al.add(26);
		al.add(28);
		al.add(30);
		al.add(32);
		al.add(28);
		System.out.println("After Adding : "+al);
		
		al.add(2, 25);
		System.out.println("After Adding at 2 index: "+al);
		
		al1.addAll(al);
		al1.add(34);
		al1.add(36);
		System.out.println("After AddAll : "+al1);
		
		al2.addAll(al1);
		al2.addAll(0, al);
		System.out.println("After AddAll at 0 index"+al2);
		
		al2.clear();
		System.out.println("After Clear : "+al2);
		
		System.out.println("After Clone : "+al.clone());
		
		if(al1.contains(34)) {
			System.out.println("Contains 34");
		}
		else {
			System.out.println("Doesnot Contain 34");
		}
		
		al1.ensureCapacity(15);
		System.out.println("After Increasing Capacity : "+al1);
		
		System.out.println("Getting Element : "+al1.get(0));
		
		System.out.println("IndexOF : "+al2.indexOf(20));//returns -1 because al2 doesnot contains any element
		System.out.println("IndexOF : "+al.indexOf(28));//first occurance of 28 in al is at 4th index position
		
		if(al2.isEmpty()) {
			System.out.println("Al2 is Empty : True");
		}
		else {
			System.out.println("Al2 is Empty : False");
		}
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator : "+itr.next());
		}
		
		System.out.println("LastIndexOF : "+al.lastIndexOf(28));
		//last occurance of 28 in al is 7th index postion first occurance is 4th position
		
		ListIterator litr=al.listIterator(5);
		while(litr.hasNext()) {
			System.out.println("List Iterator Forward : "+litr.next());
		}
		while(litr.hasPrevious()) {
			System.out.println("List Iterator Backward : "+litr.previous());
		}
		
		al.remove(2);
		System.out.println("After removing 2 index 25 in al : "+al);
		
		//al2.removeRange(2,5);
		//protected void
		
	/*	System.out.println("After  Retain All elements in al1 : "+al1.retainAll(al));
		System.out.println(al1);
		
		System.out.println("After Removing all elements from al1 : "+al1.removeAll(al));
		System.out.println(al1);*/
		
		al.set(6, 34);
		System.out.println("After Replacing at 6th index : "+al);
		
		System.out.println("Size : "+al.size());
		
	}

}
