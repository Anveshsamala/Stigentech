package customExcetionDemo;

public class InvalidAccountNumberException extends Exception
{

	public InvalidAccountNumberException() 
	{

	}
	public InvalidAccountNumberException(String err) 
	{
		super(err);	
	}

}
