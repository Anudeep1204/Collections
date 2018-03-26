package HashSetMethods;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClient {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet();
		
		System.out.println("********HashSet Methods*****");
		
		hs.add(22);
		hs.add(32);
		hs.add(42);
		hs.add(52);
		hs.add(62);
		hs.add(11);
		System.out.println("After Adding elements to hs : "+hs);
		
		
		hs1=(HashSet) hs.clone();
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
