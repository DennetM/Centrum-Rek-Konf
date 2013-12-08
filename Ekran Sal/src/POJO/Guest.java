package POJO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Guest")
public class Guest {

	@DatabaseField(generatedId = true)
    private int GuestId;
    @DatabaseField
    private String Name;
    @DatabaseField
    private String Surname;
    @DatabaseField
    private String TelephoneNumber;
    @DatabaseField
    private String Email;

    public Guest(){
    	
    }
    
    public Guest(int GuestId, String Name, String Surname, String TelephoneNumber, String Email){
    	this.GuestId = GuestId;
    	this.Name = Name;
    	this.Surname = Surname;
    	this.TelephoneNumber = TelephoneNumber;
    	this.Email = Email;
    }
    
    public int getGuestId() {
        return GuestId;
    }
    public void setGuestId(int GuestId) {
        this.GuestId = GuestId;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    
    public String getTelephoneNumber() {
        return TelephoneNumber;
    }
    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
