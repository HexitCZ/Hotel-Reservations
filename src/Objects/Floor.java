package Objects;

public class Floor
{
	public int roomCount;

	public static int count;

	public Room[] rooms;

	public Floor(int room)
	{
		if (room > 0)
		{
			roomCount = room;
			rooms = new Room[roomCount];
		}
		count += 1;
	}

	public String Read()
	{
		String t = "Floor " + count + "\n";

		for (int i = 0; i < rooms.length; i++)
		{
			t += "Room " + Integer.toString(i + 1) + ": " + rooms[i].toString() + "\n\n";

		}
		return t;
	}

}
