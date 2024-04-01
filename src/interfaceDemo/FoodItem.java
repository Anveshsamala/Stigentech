package interfaceDemo;

public class FoodItem extends ShopItem implements Taxable
{
	public FoodItem(String itemname, double price) {
		super(itemname, price);

	}

	public double getTax()
	{

		System.out.println("Food Item has No Tax and total amount is= "+price);
		return price;
	}

}
