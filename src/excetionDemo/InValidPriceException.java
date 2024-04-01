package excetionDemo;

public class InValidPriceException extends Exception
{
	public InValidPriceException() 
	{

	}
	public InValidPriceException(String error) {
		super(error);
	}
}
