package excetionDemo;

public class Transaction 
{
	public static void main(String[] args) 
	{

		int accountBalance=10000;
		int withDrawAmount=1000;
		try
		{
			System.out.println("Loggin to account");	
			withdraw(accountBalance,withDrawAmount);

		}
		catch(InSufficientBalanceException e)
		{
			System.out.println("can not withdraw amount because less current balance");
		}
		finally
		{
			System.out.println("logout the account");
		}
	}
	public static void withdraw(int accountBalance, int withDrawAmount) throws InSufficientBalanceException 
	{
		if(accountBalance-withDrawAmount<0)
		{
			throw new InSufficientBalanceException();

		}

		if(accountBalance-withDrawAmount>0)
		{
			System.out.println(accountBalance-withDrawAmount);
			System.out.println("amount withdrawn successfully");
		}
	}
}
