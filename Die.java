//handles random rolling of die, doubles

public class Die
{
	private int dice1;
	private int dice2;
	private int doublesRolled;

	int rollDie()
	{
		dice1 = (int)(Math.random() * 6 + 1);
		dice2 = (int)(Math.random() * 6 + 1);
		return dice1 + dice2;
	}
	boolean isDouble()
	{
		doublesRolled++;
		if(dice1 == dice2)
			return true;
		else
			return false;
	}
	boolean hasRolledThreeDoubles()
	{
		if(doublesRolled == 3)
			return true;
		else
			return false;
	}
	void resetDoubles()
	{
		doublesRolled = 0;
	}
}