package abstractionDemo;

public class Main 
{
	public static void main(String[] args) 
	{

		GoldLoan GL=new GoldLoan();
		GL.verify();
		GL.getAmount();
		GL.print();

		System.out.println();

		VehicleLoan VL=new VehicleLoan();
		VL.verify();
		VL.getAmount();
		VL.print();

		System.out.println();

		EducationLoan EL=new EducationLoan();
		EL.verify();
		EL.getAmount();
		EL.print();

	}
}
