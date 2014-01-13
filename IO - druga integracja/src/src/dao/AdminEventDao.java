package dao;

import java.util.ArrayList;
import java.util.List;

import model.EventModel;
import model.PersonelModel;

/**
 * 
 * DAO do administrowania eventami
 * 
 */
public class AdminEventDao extends BaseDao {


	public List<EventModel> getListEvent() {
		List<EventModel> result = new ArrayList<>();
		result = fasade.getListEvent();
		return result;
	}

	public EventModel getEvent(int eventID) {
		EventModel result = null;
		result = fasade.getEvent(eventID);
		return result;
	}
	
	public List<EventModel> getListEventWhereRoomID(int roomID) {
		List<EventModel> result = new ArrayList<>();		
		result = fasade.ListEventWhereRoomID(roomID);		
		return result;
	}
	
	public List<EventModel> getListEventWhereGuestID(int guestID) {
		List<EventModel> result = new ArrayList<>();
		result = fasade.ListEventWhereGuestID(guestID);
		return result;
	}

	public void setEventApprove(int eventID, boolean aprove) {
		fasade.setEventApprove(eventID, aprove);
	}

	public void setEventApprove(EventModel event, boolean aprove) {
		fasade.setEventApprove(event.getIdEvent(), aprove);
	}

	public void setEventPersonel(int eventID, int personelID) {
		fasade.setEventPersonel(eventID, personelID);
	}

	public void setEventPersonel(EventModel event, PersonelModel personel) {
		fasade.setEventPersonel(event.getIdEvent(), personel.getIdPersonel());
	}

}
