package constructorDemo;

public class Shop 
{
	public static void main(String[] args) 
	{
		MedicalItem MI=new MedicalItem();
		System.out.println(MI.name);
		System.out.println(MI.price);
		System.out.println(MI.expyear);

		MedicalItem item1=new MedicalItem("Dolo-650", 25.0, "January", 2023);
		item1.show();

	}
}
