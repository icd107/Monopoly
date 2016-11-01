public class Railroad extends Space
{
	private int owner;
	private int cost;
	private int initRent;

	Railroad(String name, double rent, int owner)
	{
		super(name, rent);
		this.owner = owner;
		initRent = rent; //generally begins at 50
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