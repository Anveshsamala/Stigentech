package constructorDemo;

public class Bank 
{
	public static void main(String[] args)
	{
		Loan L=new Loan();
		System.out.println(L.type);
		System.out.println(L.amount);

		Loan l=new Loan("vehicle loan", 1500000.0, "Innova Cresta");
		l.show();
	}

}
