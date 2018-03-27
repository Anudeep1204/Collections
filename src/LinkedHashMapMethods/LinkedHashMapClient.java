package LinkedHashMapMethods;

import java.util.LinkedHashMap;

public class LinkedHashMapClient {

	public static void main(String[] args) {
    
		LinkedHashMap lhm=new LinkedHashMap();
		
		System.out.println("********Linked HashMap Methods*********");
		lhm.put(7, "Anudeep");
		lhm.put(1, "Raghavendra");
		lhm.put(5, "Kranthi");
		lhm.put(2, "Sarath");
		lhm.put(4, "Lahari");
		lhm.put(6, "Satish");
		
		System.out.println(lhm);
		
		
		System.out.println("If ContainsValue: "+lhm.containsValue("Anudeep"));
		
		
		System.out.println("After get : "+lhm.get(2));
		
		lhm.clear();
		System.out.println("After clear : "+lhm);
	}

}
