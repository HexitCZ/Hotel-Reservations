package Objects;

public class Room
{
	public int bedCount;

	public int price;

	public boolean isAvailable;

	public Room(int bC, int pr)
	{
		if (bC > 0)
		{
			bedCount = bC;

		}

		if (pr > 0)
		{
			price = pr;
		}
	}

	public String toString()
	{
		if (isAvailable)
			return "Beds: " + bedCount + "\n" + "Price: " + price + "\n" + "Availability: Free";
		else
			return "Beds: " + bedCount + "\n" + "Price: " + price + "\n" + "Availability: Full";
	}

}
