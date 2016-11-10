public class Railroad extends Space
{
	private int owner;
	private int initRent;
	private int cost;

	Railroad(String name, int cost, int rent)
	{
		super(name, rent);
		initRent = rent; //generally begins at 50
		this.canBuy = true;
		this.cost = cost;
	}

	void setOwner(int owner)
	{
		this.canBuy = false;
		this.owner = owner;				//sets owner index
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
	void upgradeProperty()
	{
		rent *= 2;
	}
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