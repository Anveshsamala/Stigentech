package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MergeArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList AL=new ArrayList();
		AL.add("a");
		AL.add("v");
		AL.add("c");
		AL.add("k");
		System.out.println(AL);

		ArrayList BL=new ArrayList();
		BL.add("a");
		BL.add("r");
		BL.add("v");
		BL.add("l");
		System.out.println(BL);

		//AL.removeAll(BL);
		AL.addAll(BL);

		System.out.println(AL);

		Collections.sort(AL);
		System.out.println(AL);
	}




}
