package Core;

import java.util.ArrayList;

import GUI.MyPanel;
import Objects.Floor;
import Objects.Room;

public class Generator
{
	public static ArrayList<Floor> floors = new ArrayList<Floor>();
	public static ArrayList<Integer> lastRoom = new ArrayList<Integer>();
	public static int lastFloor = 0;

	public static void GenerateSomething()
	{

		floors.add(new Floor(2));
		lastFloor += 1;
		lastRoom.add(2);
		floors.get(0).rooms[0] = new Room(2, 20);
		floors.get(0).rooms[1] = new Room(4, 60);
		floors.get(0).rooms[0].isAvailable = false;
		floors.get(0).rooms[1].isAvailable = true;

		MyPanel.jcomp4.setText(floors.get(0).Read());
	}

	public static void GenerateFloor(int rooms)
	{
		floors.add(new Floor(rooms));
		lastFloor += 1;
	}

	public static void GenerateRoom(int beds, int price)
	{
		if (lastRoom.get(lastFloor) < floors.get(lastFloor).rooms.length)
		{
			floors.get(lastFloor).rooms[lastRoom.get(lastFloor)] = new Room(beds, price);
			lastRoom.set(lastFloor, 1);

		}

	}

	public static void GenerateRoom(int floor, int beds, int price)
	{
		if (lastRoom.get(floor) < floors.get(floor).rooms.length)
		{
			floors.get(floor).rooms[lastRoom.get(floor)] = new Room(beds, price);
			lastRoom.set(floor, 1);

		}
	}
}
