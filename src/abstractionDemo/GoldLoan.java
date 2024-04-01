package abstractionDemo;

public class GoldLoan extends Loan
{
	void verify()
	{
		System.out.println("ornament verification");

	}

	double getAmount()
	{
		amount=52500;
		System.out.println("Gold loan amount and interest(5%) for one year= " +amount);
		return amount;
	}
}
