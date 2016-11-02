//creates board, players, handles turns and victoy conditions
import java.util.Scanner;

public class Monopoly
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int playerNumber = 0;

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
	}
}