package practicingProgramsDemo;

public class DislayNumbersUsingForWhile {

	public static void main(String[] args) {
		int n=1;
		
		//using while
		while(n<=100)
		{
			System.out.print(n+" ");
			n++;
		}
		System.out.println();
		//using for 
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
	}

}
