package practicingProgramsDemo;

import java.util.Arrays;

public class BiggestArray {
	public static void main(String[] args) {
		int arr[]= {1,4,9,5,7,6,8,0};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
