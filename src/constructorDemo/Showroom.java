package constructorDemo;

public class Showroom 
{
	public static void main(String[] args) 
	{

		Bike B=new Bike();
		B.accept("Pulsar", 200000.0, "Blue", 2021);
		B.show();

		System.out.println();

		Bike Bi=new Bike();
		Bi.accept("Duke", 250000.0, "Red", 2020);
		Bi.show();

		System.out.println();

		Bike B1=new Bike();
		B1.accept("R15", 220000.0, "Red and White", 2021);
		B1.show();
	}
}
