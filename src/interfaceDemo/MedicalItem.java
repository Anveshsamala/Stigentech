package interfaceDemo;

public class MedicalItem extends ShopItem implements Taxable 
{
	public MedicalItem(String itemname, double price) {
		super(itemname, price);
	}

	public double getTax()
	{

		double tax=5.0/100.0*price;
		System.out.println("Medical Item tax= "+tax);
		return tax;

	}
}
