//default space on board

public class Space
{
	String name;
	int rent;
	boolean isMortgaged;

	Space(String name, int rent)
	{
		this.name = name;
		this.rent = rent;
		this.isMortgaged = false;
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
}