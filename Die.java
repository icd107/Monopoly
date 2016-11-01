//handles random rolling of die, doubles

public class Die
{
	private int dice1;
	private int dice2;

	Die()
	{
		dice1 = (int)(Math.random() * 6 + 1);
		dice2 = (int)(Math.random() * 6 + 1);
	}
	
}