//creates board, players, handles turns and victoy conditions
import java.util.Scanner;

public class Monopoly
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Die die = new Die();
		Board board = new Board();
		int playerNumber = 0;
		boolean game = true;
		int bankruptcies = 0;

		//Number of players
		while(playerNumber > 8 || playerNumber < 2)
		{
			System.out.println("How many players do you want?");
			playerNumber = in.nextInt();
			if(playerNumber > 8 || playerNumber < 2)
			{
				System.out.println("You need to have 2-8 players.");
			}
		}

		Player[] players = new Player[playerNumber];

		//Assigning names to all of the players
		for(int i = 0; i < playerNumber; i++)
		{
			System.out.println("What is the name of player " + (i + 1) + "?");
			String playerName = in.next();
			players[i] = new Player(playerName, 750);
		}
		System.out.println("\n");

		while(game)
		{
			for(int i = 0; i < playerNumber; i++)
			{
				if(players[i].isBankrupt())
				{
					continue;
				}
				System.out.println(players[i]);
				while(true)
				{
					Space playerSpace = board.properties[players[i].getLocationIndex()];
					int roll = die.rollDie();
					System.out.println("You rolled a " + roll);
					players[i].move(roll);
					
					playerSpace = board.properties[players[i].getLocationIndex()];
					System.out.println(players[i]);

					//Buy properties
					if(playerSpace.canBuy())
					{
						if(players[i].getMoney() > (players[i].getMoney() - playerSpace.getCost()))
						{
							System.out.println("Do you want to buy " + playerSpace.getName() + "?");
							System.out.println("It costs $" + playerSpace.getCost());
							if(board.checkIfYes(in))
							{
								players[i].subtractMoney(playerSpace.getCost());
								playerSpace.setOwner(i);
								System.out.println("Now you own " + playerSpace.getName() + "!");
								System.out.println("Your new balance is $" + players[i].getMoney());
							}
						}
						else
						{
							System.out.println("You cannot afford this property.");
						}
					}

					//Upgrade property player is on if they own
					else if(playerSpace.getOwner() == i)
					{
						if(playerSpace.isMortgaged())
						{
							System.out.print("Do you want to unmortgage this property?");
							System.out.println(" It costs $" + (int)(playerSpace.getCost() * .6));
							if(board.checkIfYes(in))
							{
								players[i].subtractMoney((int)(playerSpace.getCost() * .6)); //pay 60% of what you did to buy it
								playerSpace.unMortgageProperty();
								System.out.println("Your property is now unmortgaged!");
								System.out.println("Your new balance is $" + players[i].getMoney());
							}
						}
						if(players[i].getMoney() > (players[i].getMoney() - playerSpace.getCostOfUpgrade()))
						{
							System.out.print("Do you want to buy a house or hotel?");
							System.out.println(" It costs $" + playerSpace.getCostOfUpgrade());
							if(board.checkIfYes(in))
							{
								players[i].subtractMoney(playerSpace.getCostOfUpgrade());
								playerSpace.upgradeProperty();
								System.out.println("Your new balance is $" + players[i].getMoney());
							}
						}
						else
						{
							System.out.println("You can't afford an upgrade.");
						}
					}

					//if property is owned by someone else pay rent
					else if(playerSpace.getOwner() != 0 && playerSpace.getOwner() != i)
					{
						if(playerSpace.getOwner() < 0)
						{
							System.out.println("You are fined $" + playerSpace.getRent());
							System.out.println("Your new balance is $" + players[i].getMoney());
						}
						else if(playerSpace.isMortgaged())
						{
							System.out.println("This property is mortgaged, you don't have to pay anything.");
						}
						else
						{
							System.out.println("You have to pay $" + playerSpace.getRent() + " to " + playerSpace.getOwner() + " because they own " + playerSpace.getName());
							players[i].subtractMoney(playerSpace.getRent());
							players[playerSpace.getOwner()].addMoney(playerSpace.getRent());
							System.out.println("Your new balance is $" + players[i].getMoney());
						}
					}

					//double and triple dice handling
					if(die.isDouble())
					{
						System.out.println("\nRoll again! You had doubles!\n");
						continue;
					}
					if(die.hasRolledThreeDoubles())
					{
						System.out.println("\nYou have rolled three doubles!\nYou're going to be fined $300!\n");
						players[i].subtractMoney(playerSpace.getRent());
						break;
					}

					//Mortgaging properties
					if(players[i].getMoney() < 0)
					{
						System.out.println("You are bankrupt, do you want to mortgage your properties? If you don't you will lose.");
						System.out.println("Your properties will be mortgaged from cheapest to most expensive until your balance is over 0.");
						if(board.checkIfYes(in))
						{
							for(Space e : board.properties)
							{
								if(e.getOwner() == i)
								{
									players[i].addMoney(e.mortgageProperty());
								}
								if(players[i].getMoney() > 0)
								{
									break;
								}
							}
							if(players[i].getMoney() < 0)
							{
								System.out.println("You weren't able to pay off your debt with mortgaging.");
							}
						}
					}

					//If you can't return from bankruptcy
					if(players[i].getMoney() < 0)
					{
						players[i].goBankrupt();
						System.out.println(players[i].getName() + " has lost!");
						System.out.println("Every one else wins. Make fun of " + players[i].getName());
						bankruptcies++;
					}

					break;
				}
				die.resetDoubles();
				System.out.println("Enter any letter to end your turn");
				in.next();
				System.out.println();

				//check who has won and if everyone else is bankrupt
				if(bankruptcies == players.length - 1)
				{
					for(Player e : players)
					{
						if(!e.isBankrupt())
						{
							System.out.println("\n" + e.getName() + " has won!");
						}
					}
				}
			}
		}
	}
}