package collectionDemo;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) 
	{
		HashMap<Long, String> contacts=new HashMap<Long, String>();
		contacts.put(8499099085L, "Anvesh");
		contacts.put(9133443211L, "Rahul");
		contacts.put(9949875829L, "Srinivas");
		contacts.put(9440040686L, "Srinivas");
		contacts.put(9949710234L, "Janardhan");
		
		
//		System.out.println(contacts.entrySet());
//		
//		System.out.println(contacts.replace(8499099085L, "mahesh"));
//		
//		System.out.println(contacts.replace(8499099085L, "14255"));
//		
		System.out.println(contacts);
		
		System.out.println(contacts.containsKey("8499099085L"));
		System.out.println(contacts.remove("8499099085L"));
		System.out.println(contacts.get("9133443211L").length());
//		
//		System.out.println(contacts.);
//		
//		contacts.remove("Anvesh");
		
	
//		System.out.println(contacts.containsKey(9949875829L));
//		
//		System.out.println(contacts.containsKey(8686861775L));
//		
//		System.out.println(contacts.containsValue("Janardhan"));
//		
//		
//		System.out.println(contacts.keySet());
//		
//		System.err.println(contacts.values());
//		
		

	}

}
