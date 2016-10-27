public class Property
{
	private:
		String name;
		int owner;
		float cost;
		float rent;
		int houses;
		boolean hotel;

	public:
		Property(String name, int owner, float cost, float rent)
		{
			this.name = name;
			this.owner = owner;
			this.cost = cost;
			this.rent = rent;
		}

		void assignProperty(int owner)
		{
			this.owner = owner;
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
			if(owner != 0) //if property is owned
			{
				return name + "\n\tRent: $" + rent + "\n\tNumber of Houses: " + houses + "\n\tHotel: " + hotel + "\n\tCost of upgrade: $" + getCostOfUpgrade();
			}
			else //if property isn't owned
			{
				return name + "\n\tCost: $" + cost + "\n\tInitial rent: $" + rent;
			}
		}
}