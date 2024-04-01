package arraysDemo;

public class ArrayMarksPromotedForNextClassOrNot 
{
	public static void main(String[] args) {
		double [] marks= {67.0,52.0,40.5,36.0,90.0,87.5};
		int count=0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]>45)
			{
				System.out.print(marks[i]);
				System.out.println(" Pass");
				count++;
			}
			else
			{
				System.out.print(marks[i]);
				System.out.println(" Fail");
			}

		}
		if(count>=4)
		{
			System.out.println("Promoted for Next Class");
		}
		else
		{
			System.out.println("Not Promoted for Next Class");
		}
	}
}
