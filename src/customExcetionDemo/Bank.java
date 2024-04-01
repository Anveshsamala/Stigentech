package customExcetionDemo;

public class Bank {

	public static void main(String[] args) 
	{
		Account A=new Account();
		A.accountNo=123456;
		A.name="Rohith";
		
		A.setBalance(50000);


		Account AC=new Account(654321,"Sachin",48000);
		
		Transaction T=new Transaction();
		
	}

}
