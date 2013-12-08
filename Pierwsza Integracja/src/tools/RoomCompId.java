package tools;

import java.util.Comparator;

import POJO.Room;

/*
 * Komperator pokoji po id
 */
public class RoomCompId implements Comparator<Room> {

	@Override
	public int compare(Room o1, Room o2) {
		if (o1.getRoomId() < o2.getRoomId()) {
			return -1;
		} else if (o1.getRoomId() > o2.getRoomId()) {
			return 1;
		}
		return 0;
	}

}
