package HashMapMethods;

import java.util.HashMap;

public class HashMapClient {

	public static void main(String[] args) {
    
		HashMap hm=new HashMap();
		HashMap hm1=new HashMap();
		HashMap hm2=new HashMap();
		
		System.out.println("*********HashMap Methods*********");
		hm.put(7, "Anudeep");
		hm.put(1, "Raghavendra");
		hm.put(5, "Kranthi");
		hm.put(2, "Sarath");
		hm.put(4, "Lahari");
		hm.put(6, "Satish");
		
		hm1.putAll(hm);
		System.out.println("After Put : "+hm);
		System.out.println("After PutAll : "+hm1);
		
		hm2=(HashMap) hm1.clone();
		System.out.println("After Clone from hm1 : "+hm2);
		
		
		System.out.println("If ContainsKey: "+hm.containsKey(4));
		
		
		System.out.println("If ContainsValue: "+hm.containsValue("Anudeep"));
		
		
		System.out.println("EntrySet of hm : "+hm.entrySet());
		
		
		System.out.println("KeySet of hm : "+hm.keySet());
		
		
		System.out.println("After get : "+hm.get(2));
		
		
		hm2.clear();
		System.out.println("After clear : "+hm2);
		
		
		System.out.println("Is Empty hm2 : "+hm2.isEmpty());
		
		hm.remove(4);
		System.out.println("After Remove 4 key in hm : "+hm);
		
		
		System.out.println("Size of hm : "+hm.size());
		
		
		System.out.println("Values of hm : "+hm.values());
	}

}
