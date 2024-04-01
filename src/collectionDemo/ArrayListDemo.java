package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListDemo {

	public static void main(String[] args) 
	{

		ArrayList ref=new ArrayList();
		ref.add(10);
		ref.add("Kohli");
		ref.add('A');
		ref.add(null);
		ref.add(10);
		ref.add("Kohli");
		ref.add(null);
		ref.add("Dravid");
		ref.add('B');
		ref.add(null);

		System.out.println(ref);

		ref.remove(4);
		System.out.println(ref);

		System.out.println(ref.contains("Kohli"));

		HashSet HS=new HashSet(ref);
		System.out.println(HS);

	}

}
