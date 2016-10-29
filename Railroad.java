public class Railroad extends Space
{
	private int owner;
	private int cost;

	Railroad(String name, double rent, int owner)
	{
		super(name, rent);
		this.owner = owner;
	}

	void assignProperty(int owner)
	{
		this.owner = owner;				//sets owner index
	}
	double mortgageProperty()
	{
		isMortgaged = true;
		return cost / 2;
	}
	void 
}