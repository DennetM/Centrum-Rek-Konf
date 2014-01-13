package controler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import POJO.Equipment;
import POJO.Room;
import conteners.RoomEquipment;

/**
 * 
 * Kontroler do administrowania pokojami
 * 
 * 
 */
public class AdminRoomControler extends BaseControler {

	public AdminRoomControler() {
		super();
	}

	/**
	 * Pobranie listy pokojow bez wyposarzenia
	 * 
	 * @return
	 */
	public List<Room> getListRoomData() {
		List<Room> result = new ArrayList<>();
		try {
			result = dbManager.roomDao.queryForAll();
		} catch (SQLException e) {

			e.printStackTrace();

		}
		return result;
	}

	/**
	 * Pobranie listy pokojów z wyposarzeniem
	 * 
	 * @param equipmentID
	 * @return
	 */
	public List<RoomEquipment> getListRoomEquipmentData() {
		List<RoomEquipment> result = new ArrayList<>();
		List<Room> rooms = new ArrayList<>();

		try {
			rooms = dbManager.roomDao.queryForAll();

		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}

		for (Room room : rooms) {
			result.add(new RoomEquipment(room, getEquipment(room.getEquipmentId())));
		}

		return result;
	}

	public List<RoomEquipment> getListRoomEquipmentDataTest() {
		
		List<RoomEquipment> result = new ArrayList<>();
		RoomEquipment temp = new RoomEquipment();
		temp.getRoom().setRoomId(2);
		temp.getRoom().setRoomNumber(2);
		temp.getEquipment().setEquipmentId(2);
		result.add(temp);
		temp = new RoomEquipment();
		temp.getRoom().setRoomId(3);
		temp.getRoom().setRoomNumber(5);
		temp.getEquipment().setEquipmentId(3);
		result.add(temp);
		temp = new RoomEquipment();
		temp.getRoom().setRoomId(4);
		temp.getRoom().setRoomNumber(6);
		temp.getEquipment().setEquipmentId(4);
		result.add(temp);
		temp = new RoomEquipment();
		temp.getRoom().setRoomId(5);
		temp.getRoom().setRoomNumber(29);
		temp.getEquipment().setEquipmentId(5);
		result.add(temp);
		return result;
	}

	/**
	 * Pobranie pokoju o konkretnym id
	 * 
	 * @param equipmentID
	 * @return
	 */
	public Room getRoomData(int roomID) {
		Room result = null;
		try {
			if (dbManager.roomDao.idExists(roomID)) {
				dbManager.roomDao.queryForId(roomID);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return result;
	}

	/**
	 * Pobranie wyposarzenia o konkretnym id
	 * 
	 * @param equipmentID
	 * @return
	 */
	public Equipment getEquipment(int equipmentID) {
		Equipment result = null;
		try {
			if (dbManager.equipmentDao.idExists(equipmentID)) {
				dbManager.equipmentDao.queryForId(equipmentID);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return result;
	}

	/**
	 * Pobranie danych konkretnego domu i wyposarzenia
	 * 
	 * @param roomID
	 * @return
	 */
	public RoomEquipment getFullRoomData(int roomID) {
		Room room = getRoomData(roomID);
		Equipment equipment = getEquipment(room.getEquipmentId());
		RoomEquipment roomEquipment = new RoomEquipment(room, equipment);
		return roomEquipment;
	}

}
