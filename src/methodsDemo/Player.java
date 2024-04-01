package methodsDemo;

public class Player 
{
	String name;
	int score;
	void accept(String player_name, int player_score)
	{
		name=player_name;
		score=player_score;
	}

	void show()
	{
		System.out.println(name);
		System.out.println(score);
	}
}
