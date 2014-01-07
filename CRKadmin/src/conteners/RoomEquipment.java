package conteners;

import POJO.Equipment;
import POJO.Room;

/**
 * 
 * Klasa ³¹czaca obiekty po³aczoneodpowiednimi kluczami obcymi
 * 
 */
public class RoomEquipment {

	private Room room;
	private Equipment equipment;

	public RoomEquipment() {
		room = new Room();
		equipment = new Equipment();
	}

	public RoomEquipment(Room room, Equipment equipment) {
		this.room = room;
		this.equipment = equipment;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

}
