package arraysDemo;

public class ArrayAverage 
{
	public static void main(String[] args) {
		int [] a= {1,5,9,13,17,21,25,29};
		int sum=0;
		double avg=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];

		}
		avg=avg+sum/a.length;
		System.out.println("sum of arrays= " +sum);
		System.out.println("length of array= " +a.length);
		System.out.println("average of array= " +avg);
	}
}
