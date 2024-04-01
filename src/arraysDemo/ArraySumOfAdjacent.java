package arraysDemo;

public class ArraySumOfAdjacent 
{
	public static void main(String[] args) {
		int [] a= {1,5,9,13,17,21,25,29};
		int sumofadjacent=0;
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			System.out.println(" ");
		}
		for (int i = 0; i < a.length; i++) {
			sumofadjacent=(a[i]+a[i+1]);
			System.out.println(sumofadjacent);
		}
	}
}
