package arraysDemo;

public class ArraySum 
{
	public static void main(String[] args) {
		int [] a= {1,5,9,13,17,21,25,29};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];

		}
		System.out.println("sum of array= " +sum);
	}
}
