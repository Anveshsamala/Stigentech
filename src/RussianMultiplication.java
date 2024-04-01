
public class RussianMultiplication 
{

	public static void main(String[] args) 
	{
		int num1=4;
		int num2=6;
		int sum=0;

		while(num1>0)
		{

			num2=2*num2;
			num1=num1/2;

			if(num1%2==1)
			{
				
				sum=sum+num2;
			}
		}
		System.out.println(sum);
	}

}
