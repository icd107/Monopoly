//creates board, players, handles turns and victoy conditions

public class Monopoly
{
	public static void main(String[] args)
	{
		Board board = new Board();
		Player player = new Player("Player", 0, 50);
		System.out.println(player);
	}
}