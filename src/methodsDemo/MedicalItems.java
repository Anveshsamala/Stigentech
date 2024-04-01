package methodsDemo;

public class MedicalItems 
{
	String name;
	double price;
	String expiremonth;
	int expireyear;

	void accept(String item_name, double item_price, String item_expiremonth, int item_expireyear)
	{
		name=item_name;
		price=item_price;
		expiremonth=item_expiremonth;
		expireyear=item_expireyear;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(expiremonth);
		System.out.println(expireyear);
	}
}
