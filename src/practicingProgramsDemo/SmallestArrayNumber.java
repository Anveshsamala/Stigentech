package practicingProgramsDemo;

public class SmallestArrayNumber {

	public static void main(String[] args) {
		int arr[]= {58,88,21,99,12,77,645};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
