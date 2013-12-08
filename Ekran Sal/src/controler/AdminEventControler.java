package controler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import POJO.Event;

/**
 * 
 * Kontroler do administrowania eventami
 * 
 */
public class AdminEventControler extends BaseControler {
	
	public AdminEventControler() {
		super();
	}


	public List<Event> getListEvent() {
		List<Event> result = new ArrayList<>();
		try {
			result.addAll(dbManager.eventDao.queryForAll());
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
	}
	
	public List<Event> getListEventTest() {
		List<Event> result = new ArrayList<>();
		
		Event event = new Event();
		event.setEventId(1);
		event.setRoomId(2);
		result.add(event);

		event = new Event();
		event.setEventId(2);
		event.setRoomId(2);
		result.add(event);

		event = new Event();
		event.setEventId(3);
		event.setRoomId(3);
		result.add(event);
		event = new Event();
		event.setEventId(7);
		event.setRoomId(4);
		result.add(event);

		event = new Event();
		event.setEventId(4);
		event.setRoomId(4);
		result.add(event);

		event = new Event();
		event.setEventId(5);
		event.setRoomId(4);
		result.add(event);

		return result;
	}

	public Event getEvent(int eventID) {
		Event result = null;
		try {
			if (dbManager.eventDao.idExists(eventID)) {
				result = dbManager.eventDao.queryForId(eventID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	


	public void cancelEvent(Event event) {

		try {
			dbManager.eventDao.update(event);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendEvent(Event event) {
		try {
			dbManager.eventDao.create(event);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
