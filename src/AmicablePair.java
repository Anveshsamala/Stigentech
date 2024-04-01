
public class AmicablePair 
{

	public static void main(String[] args) 
	{

		int n1=220;
		int n2=284;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				System.out.println(i);
				sum1+=i;

			}
		}
		System.out.println(sum1);
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
			{
				System.out.println(i);
				sum2+=i;
			}
		}

		System.out.println(sum2);
		if(sum1==n2 && sum2==n1)
		{
			System.out.println("its AMICABLE pair");
		}
		else
		{
			System.out.println("its not a AMICABLE pair");
		}

	}

}
