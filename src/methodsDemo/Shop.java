package methodsDemo;

public class Shop 
{
	public static void main(String[] args) 
	{

		MedicalItems MI=new MedicalItems();
		MI.accept("ORS", 35.0, "Sep", 2023);
		MI.show();

		System.out.println();

		MedicalItems MIt=new MedicalItems();
		MIt.accept("DOLO-650", 50.0, "Jan", 2024);
		MIt.show();

	}
}
