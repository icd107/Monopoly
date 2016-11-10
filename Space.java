//default space on board

public class Space
{
	String name;
	int rent;
	boolean isMortgaged;
	boolean canBuy;

	Space(String name, int rent)
	{
		this.name = name;
		this.rent = rent;
		this.isMortgaged = false;
		this.canBuy = false;
	}

	int getRent()
	{
		if(isMortgaged)
			return 0;
		else
			return rent;
	}
	String getName()
	{
		return name;
	}
	boolean canBuy()
	{
		return canBuy;
	}
}