package interfaceDemo;

public class ElectronicItem extends ShopItem implements Taxable
{
	public ElectronicItem(String itemname, double price) {
		super(itemname, price);

	}

	public double getTax()
	{
		double tax=3.0/100.0*price;
		System.out.println("Electronic Item tax= "+tax);
		return tax;
	}
}
