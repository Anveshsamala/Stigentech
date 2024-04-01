package interfaceDemo;

public class ShopItem 
{
	String itemname;
	double price;
	public ShopItem(String itemname, double price)
	{
		this.itemname=itemname;
		this.price=price;
	}

	void show()
	{
		System.out.println(itemname);
		System.out.println(price);
	}
}
