package interfaceDemo;

public class Shop {

	public static void main(String[] args) 
	{

		MedicalItem mi=new MedicalItem("DOLO 650", 30.0);
		mi.show();
		mi.getTax();

		System.out.println();

		ElectronicItem ei=new ElectronicItem("AC", 15000.0);
		ei.show();
		ei.getTax();

		System.out.println();

		FoodItem fi=new FoodItem("Biryani", 350.0);
		fi.show();
		fi.getTax();

	}

}
