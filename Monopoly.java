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

		for(int i = 0; i < playerNumber; i++)
		{
			System.out.println("What is the name of player " + (i + 1) + "?");
			String playerName = in.next();
			players[i] = new Player(playerName, (i + 1), 750);
		}

		while(game)
		{
			for(int i = 0; i < playerNumber; i++)
			{
				System.out.println(players[i]);
				while(true)
				{
					Space playerSpace = board.properties[players[i].getLocationIndex()].getRent();
					int roll = die.rollDie();
					System.out.println("You rolled a " + roll);
					players[i].move(roll);
					
					if(die.isDouble())
					{
						System.out.println("Roll again!");
						continue;
					}
					if(die.hasRolledThreeDoubles())
					{
						System.out.println("You have rolled three doubles!\nYou're going to be fined $300!");
						players[i].subtractMoney(playerSpace);
						break;
					}
					System.out.println(players[i]);

					if(playerSpace.canBuy() && !playerSpace.isBought())
					{
						System.out.println("Do you want to buy " + playSpace.getName() + "?");
						int tries  0;
						while(tries < 2)
						{
							String answer = in.nextLine();
							if(answer.equalsIgnoreCase("yes"))
							{
								players[i].subtractMoney(playerSpace.getCost());
								playerSpace.setOwner(i);
								System.out.println("You are now the owner!");
								break;
							}
							else
							{
								System.out.println("Are you sure? Do you want to buy " + playSpace.getName() + "?");
								tries++;
							}
						}
					}
					if(playerSpace.getOwner() == i)
					{
						System.out.println("Do you want to buy a house or hotel?")
					}

					break;
				}
			}
			game = false;
		}
	}
}