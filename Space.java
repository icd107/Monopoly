//default space on board

public class Space
{
	String name;
	int rent;
	boolean isMortgaged;
	boolean canBuy;
	int cost;

	Space(String name, int rent, int cost)
	{
		this.name = name;
		this.rent = rent;
		this.isMortgaged = false;
		this.canBuy = false;
		this.cost = cost;
	}

	int getRent()
	{
		if(isMortgaged)
			return 0;
		else
			return rent;
	}
	int getCost()
	{
		return cost;
	}
	String getName()
	{
		return name;
	}
	boolean canBuy()
	{
		return canBuy;
	}
	int getOwner()
	{
		return 0;
	}
	void setOwner(int owner)
	{
		
	}
}