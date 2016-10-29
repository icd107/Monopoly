//purchase value, mortgage value, rent, name

public class Property extends Space
{
	private int owner;
	private double cost;
	private double initRent;
	private int houses;
	private boolean hotel;

	Property(String name, int owner, double cost, double rent)
	{
		super(name, rent);
		this.owner = owner;
		this.cost = cost;
		this.initRent = rent;
	}

	void assignProperty(int owner)
	{
		this.owner = owner;				//sets owner index
	}
	double mortgageProperty()
	{
		resetProperty();
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
		isMortgaged = true;
	}
	boolean isBought()
	{
		if(owner == 0)
			return false;
		else
			return true;
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
	double getCostOfUpgrade()
	{
		if(houses < 4)
		{
			return cost / 2;
		}
		else if(!hotel)
		{
			return cost * 1.5;
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		if(owner != 0) //if property is owned print rent, houses, hotels, upgrade cost
		{
			return name + "\n\tRent: $" + rent + "\n\tNumber of Houses: " + houses + "\n\tHotel: " + hotel + "\n\tCost of upgrade: $" + getCostOfUpgrade();
		}
		else //if property isn't owned print cost, rent
		{
			return name + "\n\tCost: $" + cost + "\n\tInitial rent: $" + rent;
		}
	}
}