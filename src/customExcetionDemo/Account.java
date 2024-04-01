package customExcetionDemo;

public class Account 
{
	int accountNo;
	 String name;
	double balance;
	Account()
	{

	}
	Account(int accountNo, String name, double balance)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}

	

	public double getBalance()
	{
		return balance;
	}

	

	public void setBalance(double balance)
	{
		this.balance=balance;
	}

}
