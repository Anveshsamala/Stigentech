package constructorDemo;

public class Bike 
{
	String brand;
	double cost;
	String colour;
	int model_year;
	void accept(String brand, double cost, String  colour, int model_year) 
	{
		this.brand=brand;
		this.cost=cost;
		this.colour=colour;
		this.model_year=model_year;
	}
	void show()
	{
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(colour);
		System.out.println(model_year);
	}
}
