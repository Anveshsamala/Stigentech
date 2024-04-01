package practicingProgramsDemo;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int count=0;
		int num=8;
		for (int i = 2; i < num/2; i++) {
			if(num%i==0)
			{
				count++;
			}
		}		
		if(count==0)
		{
			System.out.println("it is a Prime Number");
		}
		else
		{
			System.out.println("its not a Prime Number");
		}

	}

}
