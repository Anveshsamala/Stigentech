package constructorDemo;

public class Game 
{
	public static void main(String[] args) 
	{
		Player play=new Player();
		System.out.println(play.name);
		System.out.println(play.score);

		Player P=new Player("Rohith Sharma", 100, 33);
		P.show();


		Player Pl=new Player("KL Rahul", 120, 30);
		Pl.show();

		if(P.score>Pl.score)
		{
			System.out.println("Rohith sharma is winner");
		}
		else
		{
			System.out.println("KL Rahul is winner");
		}
	}

}
