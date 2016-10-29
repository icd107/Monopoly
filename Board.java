//Array of properties, movement of players based off of die roll, handles passing go

public class Board
{
	Space[] properties = new Space[];

	Board()
	{
		properties[] = new Space("Go", -200);										//Jail
		properties[] = new Property("Number 18", 0, 50, 5);							//Annoys Stella
		properties[] = new Property("A Steetcar Named Stella", 0, 50, 5);
		properties[] = new Space("Income Tax", 200)
		properties[] = new Property("AMC 10", 0, 100, 10);							//Too easy according to Stella
		properties[] = new Property("AMC 12", 0, 100, 10);
		properties[] = new Property("Mandarin", 0, 100, 10);
		properties[] = new Property("Move, Witch", 0, 175, 20);						//
		properties[] = new Property("", 0, 175, 20);
		properties[] = new Property("Microwavable Popcorn", 0, 300, 30);			//Food
		properties[] = new Property("Cup-of-Noodle", 0, 300, 30);
		properties[] = new Property("50 Pirate Booties", 0, 300, 30);
		properties[] = new Space("Go to Jail", 500);								//Jail
		properties[] = new Property("", 0, 425, 45);								//Cats
		properties[] = new Property("Toonces in a King Costume", 0, 425, 45);
		properties[] = new Property("Kaw Cu Lis", 0, 550, 50);						//Calculus
		properties[] = new Property("C is All Powereful", 0, 550, 50);
		properties[] = new Property("Snap, Crackle, Pop", 0, 550, 50);
		properties[] = new Property("Use of \"detrimental\"", 0, 675, 65);			//English
		properties[] = new Property("Testing on the Females", 0, 675, 65);
		properties[] = new Property("\"Exercise reduces stress.\"", 0, 675, 65);
		properties[] = new Space("Luxury Tax", 100);
		properties[] = new Property("AIME", 0, 800, 80);							//Math
		properties[] = new Property("Stella: Combinatorics", 0, 800, 80);
	}
}
