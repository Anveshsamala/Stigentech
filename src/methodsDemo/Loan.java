package methodsDemo;

public class Loan 
{
	String loan_type;
	double loan_amount;
	void accept(String loan, double amount)
	{
		loan_type=loan;
		loan_amount=amount;
	}
	void show()
	{
		System.out.println(loan_type+ " " +loan_amount);
	}
}
