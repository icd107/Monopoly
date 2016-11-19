public class Railroad extends Space
{
	private int owner;
	private int initRent;

	Railroad(String name, int cost, int rent)
	{
		super(name, rent);
		initRent = rent; //generally begins at 50
		this.canBuy = true;
		this.cost = cost;
		this.isSpace = false;
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
	@Override
	int mortgageProperty()
	{
		resetProperty();
		isMortgaged = true;
		return cost / 2;
	}
	@Override
	void unMortgageProperty()
	{
		isMortgaged = false;
	}
	void resetProperty()
	{
		rent = initRent;
	}
	@Override
	boolean isOwned()
	{
		if(canBuy)
			return false;
		else
			return true;
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