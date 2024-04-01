package usingMethodsDemo;

public class SumOfSquare 
{
	public static int square(int a)
	{
		return a*a;
	}
	public static int sum(int a, int b)
	{
		return a+b;
	}

	public static int sumofsquare(int n1, int n2)
	{
		int result=0;
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==1)
			{
				if(i%5==0)
				{
					result=sum(result,square(i));
				}
			}


		}
		return result;
	}


	public static void main(String[] args) 
	{
		System.out.println(sumofsquare(1,100));

	}
}
