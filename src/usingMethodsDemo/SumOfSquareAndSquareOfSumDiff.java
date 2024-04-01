package usingMethodsDemo;

public class SumOfSquareAndSquareOfSumDiff 
{
	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static int square(int a)
	{
		return a*a;	
	}
	public static int sumofsquare(int n1, int n2)
	{
		int sum=0;
		int sumofsq=0;

		for(int i=n1;i<=n2;i++)
		{
			sum=sum(sum,i);	
			sumofsq=sumofsq+square(i);
		}

		System.out.println(square(sum));
		System.out.println(sumofsq);

		return square(sum)-sumofsq;
		//System.out.println("diff b/w sum of squares and squares of sum is= " +(square(sum)-sumofsq));
	}


	public static void main(String[] args) 
	{

		System.out.println(sumofsquare(1,10));
	}

}
