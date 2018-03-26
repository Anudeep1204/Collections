package LinkedHashSetMethods;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClient {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		LinkedHashSet hs1=new LinkedHashSet();
		
		System.out.println("********LinkedHashSet Methods*****");
		
		hs.add(22);
		hs.add(32);
		hs.add(42);
		hs.add(52);
		hs.add(62);
		hs.add(11);
		System.out.println("After Adding elements to hs : "+hs);
		
		
		hs1=(LinkedHashSet) hs.clone();
		System.out.println("After Clone : "+hs1);
		
		
		System.out.println("Size : "+hs.size());
		
		
		hs.remove(11);
		System.out.println("After Removing 11 from hs : "+hs);
		
		
		System.out.println("If Contains 11 in hs : "+hs.contains(11));
		
		hs1.clear();
		System.out.println("After Clear hs1 : "+hs1);
		
		
		System.out.println("Is Empty : "+hs1.isEmpty());
		
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterating the Elements : "+itr.next());
		}
		
	}

}
