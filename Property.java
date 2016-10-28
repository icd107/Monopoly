//purchase value, mortgage value, rent, name

public class Property
{
	private:
		String name;
		int owner;
		float cost;
		float rent;
		float initRent;
		int houses;
		boolean hotel;
		boolean isMortgaged;

	public:
		Property(String name, int owner, float cost, float rent)
		{
			this.name = name;
			this.owner = owner;
			this.cost = cost;
			this.rent = rent;
			this.initRent = rent;
		}

		void assignProperty(int owner)
		{
			this.owner = owner;				//sets owner index
		}
		float mortgageProperty()
		{
			houses = 0;			
			hotel = false;
			rent = initRent;
			return initRent / 2;
		}
		void unMortgageProperty()
		{
			isMortgaged = true;
		}
		float getRent()
		{
			if(isMortgaged)
			{
				return 0;
			}
			else
			{
				return rent;
			}
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
		float getCostOfUpgrade()
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
		String toString()
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