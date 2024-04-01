package practicingProgramsDemo;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=100;
		int temp=num;
		double result=0;
		while(num>0)
		{
			double rem=num%10;
			num=num/10;
			result=result+rem*rem*rem;
		}
		if(temp==result)
		{
			System.out.println("its Amstrong Number");
		}
		else
		{
			System.out.println("Its NOT a Amstong Number");
		}

	}

}
