package constructorDemo;

public class Player 
{
	String name;
	int score;
	double age;
	Player()
	{
		name="Yuvaraj Singh";
		score=98;
	}
	Player(String name, int score, double age)
	{
		this.name=name;
		this.score=score;
		this.age=age;
	}

	void show()
	{
		System.out.println(name+" " + score + " " + age);
	}
}
