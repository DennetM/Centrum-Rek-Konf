package database;

import java.util.ArrayList;
import java.util.List;

import model.EquipmentModel;
import model.EventModel;
import model.RoomModel;

/**
 * 
 * Fasada bêdaca po³aczeniem miedzy wszytkimi DAO a wywo³aniami bazy
 * 
 */
public class DataBaseFasade {

	/**
	 * Zwraca liste wszytkich aktualnych eventów
	 * 
	 * @return
	 */
	public List<EventModel> getListEvent() {
		List<EventModel> res = new ArrayList<>();

		return res;
	}

	public List<EventModel> getListEventWhere(String query) {
		List<EventModel> result = new ArrayList<>();

		return result;
	}

	public List<EventModel> ListEventWhereRoomID(int roomID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EventModel> ListEventWhereGuestID(int guestID) {
		// TODO Auto-generated method stub
		return null;
	}

	public EventModel getEvent(int eventID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEventApprove(int eventID, boolean approve) {
		// TODO Auto-generated method stub

	}

	public void setEventPersonel(int eventID, int personelID) {
		// TODO Auto-generated method stub

	}

	public List<RoomModel> getListRoomData() {
		// TODO Auto-generated method stub
		return null;
	}

	public EquipmentModel getEquipment(int equipmentID) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoomModel getRoom(int roomID) {
		// TODO Auto-generated method stub
		return null;
	}

}
