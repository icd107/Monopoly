public class Board
{
	Property[] properties = new Property[20];

	Board()
	{
		properties[00] = new Property("Number 18", 0, 50, 5);						//Annoys Stella
		properties[01] = new Property("A Steetcar Named Stella", 0, 50, 5);
		properties[02] = new Property("AMC 12", 0, 100, 10);						//Too easy according to Stella
		properties[03] = new Property("", 0, 100, 10);
		properties[04] = new Property("", 0, 100, 10);
		properties[05] = new Property("", 0, 175, 20);
		properties[06] = new Property("", 0, 175, 20);
		properties[07] = new Property("", 0, 300, 30);
		properties[08] = new Property("", 0, 300, 30);
		properties[09] = new Property("", 0, 300, 30);
		properties[10] = new Property("", 0, 425, 45);								//Cats
		properties[11] = new Property("Toonces in a King Costume", 0, 425, 45);
		properties[12] = new Property("Kaw Cu Lis", 0, 550, 50);					//Calculus
		properties[13] = new Property("C is All Powereful", 0, 550, 50);
		properties[14] = new Property("Snap, Crackle, Pop", 0, 550, 50);
		properties[15] = new Property("Use of \"detrimental\"", 0, 675, 65);		//English
		properties[16] = new Property("Testing on the Females", 0, 675, 65);
		properties[17] = new Property("\"Exercise reduces stress.\"", 0, 675, 65);
		properties[18] = new Property("AIME", 0, 800, 80);							//Math
		properties[19] = new Property("Stella: Combinatorics", 0, 800, 80);
	}
}
