package usingMethodsDemo;

public class RussianUsingMethod 
{
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int russianMultiplication(int num1, int num2) {
		int result = 0;
		if(num1%2 == 1)
		{
			result = sum(result, num2);
		}
		while(num1 != 1){
			num1 = num1/2;
			num2 = num2*2;
			if(num1%2 == 1)
			{
				result = sum(result, num2);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(russianMultiplication(6,15));
	}
}
