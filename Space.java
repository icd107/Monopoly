//default space on board

public class Space
{
	String name;
	int rent;
	boolean isMortgaged;
	boolean canBuy;
	int cost;

	Space(String name, int rent)
	{
		this.name = name;
		this.rent = rent;
		this.isMortgaged = false;
		this.cost = 0;
		this.canBuy = false;
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
	public String toString()
	{
		return name + "\n\tMoney from landing on space: " + rent;
	}

	//Placeholders to prevent me from getting errors
	//Don't judge me this was my quick fix
	void setOwner(int owner) {}
	int getOwner() { return -1; }
	int getCostOfUpgrade() { return 0; }
	void upgradeProperty() {}
	int mortgageProperty() { return 0; }
	boolean isMortgaged() { return false; }
	void unMortgageProperty() {}
}