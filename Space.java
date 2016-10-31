//default space on board

public class Space
{
	String name;
	double rent;
	boolean isMortgaged;

	Space(String name, double rent)
	{
		this.name = name;
		this.rent = rent;
		this.isMortgaged = false;
	}

	double getRent()
	{
		if(isMortgaged)
		{
			return 0.0;
		}
		else
		{
			return rent;
		}
	}
	String getName()
	{
		return name;
	}
}