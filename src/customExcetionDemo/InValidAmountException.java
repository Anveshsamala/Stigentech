package customExcetionDemo;

public class InValidAmountException extends Exception
{

	public InValidAmountException() 
	{

	}
	public InValidAmountException(String error) {
		super(error);
	}

}
