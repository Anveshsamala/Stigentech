package inheritanceDemo;

public class Employee extends Person
{
	double salary;
	Employee()
	{
		salary=22000;
	}

	public static void main(String[] args) 
	{
		Employee E = new Employee();

		System.out.println(E.id);
		System.out.println(E.name);
		System.out.println(E.salary);

	}
}
