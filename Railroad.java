public class Railroad extends Space
{
	private int owner;
	private int initRent;

	Railroad(String name, int cost, int rent)
	{
		this.name = name;
		this.rent = rent;
		initRent = rent; //generally begins at 50
		this.canBuy = true;
		this.cost = cost;
	}

	@Override
	void setOwner(int owner)
	{
		this.canBuy = false;
		this.owner = owner;				//sets owner index
	}
	@Override
	int getOwner()
	{
		return owner;
	}
	int mortgageProperty()
	{
		resetProperty();
		isMortgaged = true;
		return cost / 2;
	}
	void unMortgageProperty()
	{
		isMortgaged = false;
	}
	void resetProperty()
	{
		rent = initRent;
	}
	@Override
	void upgradeProperty()
	{
		rent *= 2;
	}
	@Override
	int getCostOfUpgrade()
	{
		return 100;
	}
	@Override
	public String toString()
	{
		if(owner == 0)
		{
			return name + "\n\tCost: $" + cost + "\n\tInitial rent: $" + initRent;
		}
		else
		{
			return name + "\n\tRent: $" + rent;
		}
	}
}