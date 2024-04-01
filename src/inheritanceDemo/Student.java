package inheritanceDemo;

public class Student extends Person
{
	int marks;
	Student()
	{
		marks=85;
	}

	public static void main(String[] args) 
	{
		Student S =new Student();

		System.out.println(S.id);
		System.out.println(S.name);
		System.out.println(S.marks);

	}
}
