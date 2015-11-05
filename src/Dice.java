
public class Dice {
	
	private int limit;

	public int GetaNumber()
	{
		int classRandom = 1 + (int) ( Math.random() * (6) );
		return classRandom;
	}
	
	public int Limit()
	{
		return limit;
		
	}
	
	public Dice (int num)
	{
		limit = num * 6;
	}
}
