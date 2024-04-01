package customExcetionDemo;

public class Transaction extends Account
{
	
	void transfer(Account fromAccountNo,Account toAccountNo, double balance)
	{
		try
		{
			if(fromAccountNo==toAccountNo)
			{
				throw new InvalidAccountNumberException();
			}
			if(fromAccountNo!=toAccountNo)
			{
				System.out.println("Account number is not matched");
				if(getBalance()<=0)
				{

					throw new InValidAmountException();

				}
				if(getBalance()>0)
				{
					System.out.println("amount transferred successfully");
				}
			}
		}catch(InValidAmountException e)
		{
			System.out.println("In valid Amount Exception");
		}
		catch(InvalidAccountNumberException e)
		{
			System.out.println("Account numbers are same then its a Invalid AccountNumber Exception");
		}
	}
}
