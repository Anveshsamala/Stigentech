package practicingProgramsDemo;

import java.util.HashMap;

public class FrequencyOfArray {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[]= {2,2,3,4,4,4,5,6,7,9,9,0};
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i]+1));
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
}
