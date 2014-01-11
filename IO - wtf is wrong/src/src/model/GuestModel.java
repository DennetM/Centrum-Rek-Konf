package model;

public class GuestModel {

	private int idGuest;
	private String name;
	private String surname;
	private String phoneNumber;
	private String email;

	public GuestModel() {

	}

	public GuestModel(GuestModel copy) {
		this.idGuest = copy.idGuest;
		this.name = copy.name;
		this.surname = copy.surname;
		this.phoneNumber = copy.phoneNumber;
		this.email = copy.email;
	}

	public int getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(int idGuest) {
		this.idGuest = idGuest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GuestModel [idGuest=").append(idGuest).append(", name=").append(name).append(", surname=").append(surname).append(", phoneNumber=").append(phoneNumber).append(", email=").append(email).append("]");
		return builder.toString();
	}

}
