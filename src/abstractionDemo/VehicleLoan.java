package abstractionDemo;

public class VehicleLoan extends Loan
{
	void verify()
	{
		System.out.println("vehicle loan verification");
	}

	double getAmount()
	{
		amount=103000;
		System.out.println("vehicle loan amount and interest(3%) for one year= " +amount);
		return amount;
	}
}
