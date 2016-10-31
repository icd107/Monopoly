//Array of properties, movement of players based off of die roll, handles passing go

public class Board
{
	Space[] properties = new Space[30];

	Board()
	{
		properties[0] = new Space("Go", -200);							//Go
		properties[1] = new Property("Number 18", 0, 50, 5);					//Annoys Stella Properties
		properties[2] = new Property("A Steetcar Named Stella", 0, 50, 5);
		properties[3] = new Space("Income Tax", 200)						//Income Tax
		properties[4] = new Railroad("The Underground Railroad", 100, 25);			//Railroad
		properties[5] = new Property("AMC 10", 0, 100, 10);					//Too easy for Stella Properties
		properties[6] = new Property("AMC 12", 0, 100, 10);
		properties[7] = new Property("Mandarin", 0, 100, 10);
		properties[8] = new Space("Free Space", 0);						//Free Space
		properties[9] = new Property("Move, Witch", 0, 175, 20);				//
		properties[10] = new Property("The Hilton", 0, 175, 20);
		properties[11] = new Railroad("New Jersey Transit", 100, 25);				//Railroad
		properties[12] = new Property("Microwavable Popcorn", 0, 300, 30);			//Food Properties
		properties[13] = new Property("Cup-of-Noodle", 0, 300, 30);
		properties[14] = new Property("50 Pirate Booties", 0, 300, 30);
		properties[15] = new Space("Free Parking", -100);					//Free Parking
		properties[16] = new Property("Catnip Farm", 0, 425, 45);				//Cats Properties
		properties[17] = new Property("Toonces in a King Costume", 0, 425, 45);
		properties[18] = new Railroad("Fart Bart", 100, 25);					//Railroad
		properties[19] = new Property("Kaw Cu Lis", 0, 550, 50);				//Calculus Properties
		properties[20] = new Property("C is All Powereful", 0, 550, 50);
		properties[21] = new Property("Snap, Crackle, Pop", 0, 550, 50);
		properties[22] = new Space("The Dungeon", 300);						//Jail
		properties[23] = new Property("Use of \"detrimental\"", 0, 675, 65);			//English Properties
		properties[24] = new Property("Testing on the Females", 0, 675, 65);
		properties[25] = new Property("\"Exercise reduces stress.\"", 0, 675, 65);
		properties[26] = new Railroad("End of the Line", 100, 25);				//Railroad
		properties[27] = new Space("Luxury Tax", 100);						//Luxury Tax
		properties[28] = new Property("AIME", 0, 800, 80);					//Math Properties
		properties[29] = new Property("Stella: Combinatorics", 0, 800, 80);
	}
}
