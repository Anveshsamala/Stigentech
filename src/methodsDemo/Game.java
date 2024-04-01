package methodsDemo;

public class Game 
{
	public static void main(String[] args) 
	{
		Player P =new Player();
		P.accept("Sachin Tendulkar", 99);
		P.show();

		Player Pl =new Player();
		Pl.accept("Kohli", 80);
		Pl.show();

		if(P.score>Pl.score)

		{
			System.out.println("Sachin Tendulkar is the winner");
		}
		else
		{
			System.out.println("Kohli is the winner");
		}

	}
}
