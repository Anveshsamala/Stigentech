package practicingProgramsDemo;

public class EvenOddNumberInArray {
	public static void main(String[] args) {
		int a[]= {4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.println("Even numver is= "+a[i]);
			}
			else
			{
				System.out.println("odd number is= "+a[i]);
			}
		}

	}

}
