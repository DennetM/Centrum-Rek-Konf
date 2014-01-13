package conteners;

import POJO.Event;
import POJO.Personnel;
import POJO.Room;

/**
 * 
 * Klasa ³¹czaca obiekty po³aczoneodpowiednimi kluczami obcymi
 * 
 */
public class EventContener {
	
	private Event event;
	private Room room;
	private Personnel personnel;

	public EventContener() {
		event = new Event();
		room = new Room();
		personnel = new Personnel();
	}

	public EventContener(Event event, Room room, Personnel personnel) {

		this.event = event;
		this.room = room;
		this.personnel = personnel;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}


}
