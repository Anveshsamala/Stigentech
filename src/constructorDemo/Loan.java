package constructorDemo;

public class Loan 
{
	String type;
	double amount;
	String name;

	Loan()
	{
		type="Vehicle Loan";
		amount=150000;
	}
	Loan(String type, double amount, String name)
	{
		this.type=type;
		this.amount=amount;
		this.name=name;
	}
	void show()
	{
		System.out.println(type+" "+amount+" "+name);
	}
}
