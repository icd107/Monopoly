//position, owner, money

public class Player
{
	private int id;
	private int money;
	private String name;
	private int locationIndex;

	Player(String name, int id, int initMoney)
	{
		this.name = name;
		this.id = id;
		this.money = initMoney;
		locationIndex = 0;
	}

	void addMoney(int money)
	{
		this.money += money;
	}
	int getID()
	{
		return id;
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
}