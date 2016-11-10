//purchase value, mortgage value, rent, name

public class Property extends Space
{
	private int owner;
	private int initRent;
	private int houses;
	private boolean hotel;
	private int cost;

	Property(String name, int cost, int rent)
	{
		super(name, rent);
		this.initRent = rent;
		this.canBuy = true;
		this.cost = cost;
	}

	void setOwner(int owner)
	{
		this.canBuy = false;
		this.owner = owner;				//sets owner id
	}
	int getOwner()
	{
		return owner;					//returns owner id
	}
	int mortgageProperty()
	{
		resetProperty();				//mortage property; return amount gained
		isMortgaged = true;
		return cost / 2;
	}
	void resetProperty()
	{
		houses = 0;
		hotel = false;
		rent = initRent;
	}
	void unMortgageProperty()
	{
		isMortgaged = false;
	}
	void upgradeProperty()
	{
		if(houses < 4)
		{
			houses++;
			rent *= 1.25; //increase rent
		}
		else if(!hotel)
		{
			hotel = true;
			rent *= 2;
		}
	}
	int getCostOfUpgrade()
	{
		if(houses < 4)
		{
			return cost / 2;
		}
		else if(!hotel)
		{
			return (int)(cost * 1.5);
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		if(owner == 0) //if property isn't owned print cost, rent
		{
			return name + "\n\tCost: $" + cost + "\n\tInitial rent: $" + initRent;
		}
		else //if property is owned print rent, houses, hotels, upgrade cost
		{
			return name + "\n\tRent: $" + rent + "\n\tNumber of Houses: " + houses + "\n\tHotel: " + hotel + "\n\tCost of upgrade: $" + getCostOfUpgrade();
		}
	}
}