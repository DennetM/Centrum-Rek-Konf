package model;

import java.util.Date;

public class EventModel {

	private int idEvent;
	private String name;
	private Date startDate;
	private Date endDate;
	private boolean approved;
	
	private int roomID;
	private int guestID;
	private int personelID;
	
	private RoomModel roomHandle;
	private GuestModel guestHandle;
	private PersonelModel personelHandle;
	


	public EventModel(EventModel copy) {
		this.idEvent = copy.idEvent;
		this.name = copy.name;
		this.startDate = copy.startDate;
		this.endDate = copy.endDate;
		this.approved = copy.approved;
		this.roomID = copy.roomID;
		this.guestID = copy.guestID;
		this.personelID = copy.personelID;
		this.roomHandle = copy.roomHandle;
		this.guestHandle = copy.guestHandle;
		this.personelHandle = copy.personelHandle;
	}

	public EventModel() {

	}

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public int getGuestID() {
		return guestID;
	}

	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}

	public int getPersonelID() {
		return personelID;
	}

	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EventModel [idEvent=").append(idEvent).append(", name=").append(name).append(", startDate=").append(startDate).append(", endDate=").append(endDate).append(", approved=").append(approved).append(", roomID=").append(roomID).append(", guestID=").append(guestID).append(", personelID=").append(personelID).append("]");
		return builder.toString();
	}

	public RoomModel getRoomHandle() {
		return roomHandle;
	}

	public void setRoomHandle(RoomModel roomHandle) {
		this.roomHandle = roomHandle;
	}

	public GuestModel getGuestHandle() {
		return guestHandle;
	}

	public void setGuestHandle(GuestModel guestHandle) {
		this.guestHandle = guestHandle;
	}

	public PersonelModel getPersonelHandle() {
		return personelHandle;
	}

	public void setPersonelHandle(PersonelModel personelHandle) {
		this.personelHandle = personelHandle;
	}

}
