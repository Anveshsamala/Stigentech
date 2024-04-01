package excetionDemo;

public class Product {

	public static void main(String[] args) 
	{
		String productname="Bag";
		double price=0;
		try
		{
			productDetails(price, productname);
		}
		catch(Exception e)
		{
			System.out.println("invalid price");
		}

	}

	public static void productDetails(double price, String productname) throws Exception
	{
		if(price<=0)
		{
			throw new Exception();
		}

		if(price>0)
		{
			System.out.println("product name  is= " +productname);
			System.out.println("price of product is= "+price);
		}
	}

}


