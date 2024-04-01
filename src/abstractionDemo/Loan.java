package abstractionDemo;

public abstract class Loan 
{
	double amount;


	abstract void verify();
	abstract double getAmount();
	void print()
	{
		System.out.println(amount);
	}
}
