package excetionDemo;

public class InSufficientBalanceException extends Exception
{

	public InSufficientBalanceException() 
	{

	}
	public InSufficientBalanceException(String err) 
	{
		super(err);
	}

}
