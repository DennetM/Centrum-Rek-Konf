package model;

public class PersonelModel {

	private int idPersonel;

	private String name;
	private String surname;
	private String jobDesc;

	public PersonelModel() {

	}

	public PersonelModel(PersonelModel copy) {
		this.idPersonel = copy.idPersonel;
		this.name = copy.name;
		this.surname = copy.surname;
		this.jobDesc = copy.jobDesc;
	}

	public int getIdPersonel() {
		return idPersonel;
	}

	public void setIdPersonel(int idPersonel) {
		this.idPersonel = idPersonel;
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

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonelModel [idPersonel=").append(idPersonel).append(", name=").append(name).append(", surname=").append(surname).append(", jobDesc=").append(jobDesc).append("]");
		return builder.toString();
	}

}
