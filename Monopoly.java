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
		System.out.println("\n");

		while(game)
		{
			for(int i = 0; i < playerNumber; i++)
			{
				System.out.println(players[i]);
				while(true)
				{
					Space playerSpace = board.properties[players[i].getLocationIndex()];
					int roll = die.rollDie();
					System.out.println("You rolled a " + roll);
					players[i].move(roll);
					
					System.out.println(players[i]);

					if(playerSpace.canBuy())
					{
						System.out.println("Do you want to buy " + playerSpace.getName() + "?");
						if(board.checkIfYes(in))
						{
							players[i].subtractMoney(playerSpace.getCost());
							playerSpace.setOwner(i);
						}
					}
					if(playerSpace.getOwner() == players[i].getID())
					{
						System.out.println("Do you want to buy a house or hotel?");
						if(board.checkIfYes(in))
						{
							players[i].subtractMoney(playerSpace.getCostOfUpgrade());
							playerSpace.upgradeProperty();
						}
					}

					if(die.isDouble())
					{
						System.out.println("Roll again!");
						continue;
					}
					if(die.hasRolledThreeDoubles())
					{
						System.out.println("You have rolled three doubles!\nYou're going to be fined $300!");
						players[i].subtractMoney(playerSpace.getRent());
						break;
					}

					break;
				}
			}
			game = false;
		}
	}
}