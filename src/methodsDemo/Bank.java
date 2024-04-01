package methodsDemo;

public class Bank 
{
	public static void main(String[] args) {
		Loan L=new Loan();
		L.accept("Agriculture loan", 50000.0);
		L.show();

		Loan Lo=new Loan();
		Lo.accept("personal loan", 100000.0);
		Lo.show();

	}
}
