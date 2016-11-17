//position, owner, money

public class Player
{
	private int money;
	private String name;
	private int locationIndex;
	private boolean isBankrupt;

	Player(String name, int initMoney)
	{
		this.name = name;
		this.money = initMoney;
		locationIndex = 0;
		isBankrupt = false;
	}

	void addMoney(int money)
	{
		this.money += money;
	}
	String getName()
	{
		return name;
	}
	boolean isBankrupt()
	{
		return isBankrupt;
	}
	void goBankrupt()
	{
		isBankrupt = true;
	}
	void subtractMoney(int money)
	{
		this.money -= money;
	}
	int getLocationIndex()
	{
		return locationIndex;
	}
	public String toString()
	{
		return name + "\n\tMoney: $" + money + "\n\tYou are on " + Board.properties[locationIndex].getName();
	}
	void move(int spaces)
	{
		locationIndex += spaces;
		if(locationIndex > 29) //30 properties index 0 - 29 so greater than 29
		{
			locationIndex -= 29;
			addMoney(200);
		}
	}
	int getMoney()
	{
		return money;
	}
}