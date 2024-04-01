package excetionDemo;

public class PersonAge 
{

	public static void main(String[] args) 
	{
		int age=22;
		try {

			validateAge(age);
		}
		catch(Exception e)
		{
			System.out.println(age);
			System.out.println("Age is  invalid");
		}

	}

	public static void validateAge(int age) throws Exception 
	{
		if(age==0 || age<0 || age>=100 )
		{
			throw new Exception();
		}

		if(age>0)
		{
			System.out.println(age);
			System.out.println("Age is valid");
		}
	}

}
