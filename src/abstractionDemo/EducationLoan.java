package abstractionDemo;

public class EducationLoan extends Loan
{
	void verify()
	{
		System.out.println("vehicle loan verification");
	}

	double getAmount()
	{
		amount=200000;
		System.out.println("education loan amount and interest(0%) for one year= " +amount);
		return amount;
	}
}
