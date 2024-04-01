package arraysDemo;

public class ArraySumAndAverage 
{
	public static void main(String[] args) 
	{
		double [] marks= {67.0,52.0,40.5,36.0,90,87.5};
		double sum=0;
		double avg=0;
		for (int i = 0; i < marks.length; i++)
		{
			sum=sum+marks[i];
			avg=sum/marks.length;
		}
		System.out.println("Sum of Marks= " +sum);
		System.out.println("Length of Marks= " +marks.length);
		System.out.println("Average of Marks= " +avg);
	}
}
