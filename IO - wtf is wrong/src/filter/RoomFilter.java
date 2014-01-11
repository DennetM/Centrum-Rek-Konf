package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import POJO.Room;
import conteners.RoomEquipment;

/**
 * 
 * Generyczny filtr obiektow na liscie wedlug zadanych parametrow wejsciowych
 * 
 */
public class RoomFilter implements Filter<RoomEquipment> {

	@Override
	public List<RoomEquipment> filter(List<RoomEquipment> inputList, Properties var) {
		List<RoomEquipment> result = new ArrayList<>();

		for (RoomEquipment roomEquip : inputList) {
			Room room = roomEquip.getRoom();
			if (var.containsKey("ROOM_TYPE")) {
				String value = (String) var.get("ROOM_TYPE");
				if (!room.getType().startsWith(value)) {
					continue;
				}
			}

			if (var.containsKey("AVAIBLE")) {
				Boolean value = (Boolean) var.get("AVAIBLE");
				if (room.getAvailability() != value) {
					continue;
				}
			}

			if (var.containsKey("MAX_PEOPLE")) {
				Integer value = (Integer) var.get("MAX_PEOPLE");
				if (room.getPeopleLimit() > value) {
					continue;
				}
			}

			if (var.containsKey("MIN_PEOPLE")) {
				Integer value = (Integer) var.get("MIN_PEOPLE");
				if (room.getPeopleLimit() < value) {
					continue;
				}
			}

			if (var.containsKey("MAX_PRICE")) {
				Integer value = (Integer) var.get("MAX_PRICE");
				if (room.getPrice() > value) {
					continue;
				}
			}

			if (var.containsKey("MIN_PRICE")) {
				Integer value = (Integer) var.get("MIN_PRICE");
				if (room.getPrice() < value) {
					continue;
				}
			}

			if (var.containsKey("MAX_SURFACE")) {
				Integer value = (Integer) var.get("MAX_SURFACE");
				if (room.getSurface() > value) {
					continue;
				}
			}

			if (var.containsKey("MIN_SURFACE")) {
				Integer value = (Integer) var.get("MIN_SURFACE");
				if (room.getSurface() < value) {
					continue;
				}
			}

			if (var.containsKey("ROOM_NUMBER")) {
				Integer value = (Integer) var.get("ROOM_NUMBER");
				if (room.getRoomNumber() != value) {
					continue;
				}
			}

			result.add(roomEquip);
		}

		return result;
	}

}
