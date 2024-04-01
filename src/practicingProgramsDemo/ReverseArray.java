package practicingProgramsDemo;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {4,8,6,7,2,1,0,12};
		for (int i = 0; i < arr.length/2; i++) {
			int tem=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=tem;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}


	}

}
