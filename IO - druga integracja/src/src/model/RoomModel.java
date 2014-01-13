package model;

public class RoomModel {

	private int idRoom;
	private int roomNumber;
	private float surface;
	private boolean available;
	private int peapleLimit;
	private String type;
	private float price;
	private int equipmentID;

	private EquipmentModel equipmentHandle;


	public RoomModel(RoomModel copy) {
		this.idRoom = copy.idRoom;
		this.roomNumber = copy.roomNumber;
		this.surface = copy.surface;
		this.available = copy.available;
		this.peapleLimit = copy.peapleLimit;
		this.type = copy.type;
		this.price = copy.price;
		this.equipmentID = copy.equipmentID;
		this.equipmentHandle = copy.equipmentHandle;
	}

	public RoomModel() {

	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getPeapleLimit() {
		return peapleLimit;
	}

	public void setPeapleLimit(int peapleLimit) {
		this.peapleLimit = peapleLimit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoomModel [idRoom=").append(idRoom).append(", roomNumber=").append(roomNumber).append(", surface=").append(surface).append(", available=").append(available).append(", peapleLimit=").append(peapleLimit).append(", type=").append(type).append(", price=").append(price).append(", equipmentID=").append(equipmentID).append("]");
		return builder.toString();
	}

	public EquipmentModel getEquipmentHandle() {
		return equipmentHandle;
	}

	public void setEquipmentHandle(EquipmentModel equipmentHandle) {
		this.equipmentHandle = equipmentHandle;
	}

}
