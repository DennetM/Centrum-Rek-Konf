package model;

public class AdminModel {

	private int idAdmin;
	private String password;
	private String name;
	private String surname;
	private String phoneNumber;
	private String email;

	public AdminModel() {

	}

	public AdminModel(AdminModel copy) {
		this.idAdmin = copy.idAdmin;
		this.password = copy.password;
		this.name = copy.name;
		this.surname = copy.surname;
		this.phoneNumber = copy.phoneNumber;
		this.email = copy.email;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		builder.append("AdminModel [idAdmin=").append(idAdmin).append(", password=").append(password).append(", name=").append(name).append(", surname=").append(surname).append(", phoneNumber=").append(phoneNumber).append(", email=").append(email).append("]");
		return builder.toString();
	}

}
