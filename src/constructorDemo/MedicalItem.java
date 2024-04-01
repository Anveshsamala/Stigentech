package constructorDemo;

public class MedicalItem 
{
	String name;
	double price;
	String expmonth;
	int expyear;
	MedicalItem()
	{
		name="Limce";
		price=35.05;
		expyear=2024;
	}
	MedicalItem(String name, double price, String expmonth, int expyear)
	{
		this.name=name;
		this.price=price;
		this.expmonth=expmonth;
		this.expyear=expyear;
	}

	void show()
	{
		System.out.println(name+ " "+ price +" "+ expmonth+ " " + expyear);
	}
}
