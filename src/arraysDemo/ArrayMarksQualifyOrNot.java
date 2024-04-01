package arraysDemo;

public class ArrayMarksQualifyOrNot 
{
	public static void main(String[] args)
	{
		double [] marks= {67.0,52.0,40.5,36.0,90,87.5};
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]>45)
			{
				System.out.print(marks[i]);
				System.out.println(" Pass");
			}
			else
			{
				System.out.print(marks[i]);
				System.out.println(" Fail");
			}
		}

	}
}
