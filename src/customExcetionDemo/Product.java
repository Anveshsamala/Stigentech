package customExcetionDemo;

public class Product 
{
	public static void main(String[] args) 
	{
		int fromAccountNo=123456;
		int toAccountNo=123456;
		int amount=2222;
		try
		{
			transfer(fromAccountNo,toAccountNo,amount);
		}catch(InValidAmountException e)
		{
			System.out.println("In valid Price Exception");
		}
		catch(InvalidAccountNumberException e)
		{
			System.out.println("Account numbers are same then its a Invalid AccountNumber Exception");
		}
	}
	public static void transfer(int fromAccountNo,int toAccountNo,int amount) throws InValidAmountException,InvalidAccountNumberException
	{


		if(fromAccountNo==toAccountNo)
		{
			throw new InvalidAccountNumberException();
		}
		if(fromAccountNo!=toAccountNo)
		{
			System.out.println("Account number is not matched");
			if(amount<=0)
			{

				throw new InValidAmountException();

			}
			if(amount>0)
			{
				System.out.println("amount transferred successfully");
			}
		}
	}
}
