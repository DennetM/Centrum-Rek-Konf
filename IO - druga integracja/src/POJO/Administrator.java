package POJO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Administrator")
public class Administrator {
	
	@DatabaseField(generatedId = true)
    private int AdministratorId;
    @DatabaseField
    private String Password;
    @DatabaseField
    private String Name;
    @DatabaseField
    private String Surname;
    @DatabaseField
    private String PhoneNumber;
    @DatabaseField
    private String Email;

    public Administrator(){}
    
    public Administrator(int AdministratorId, String Password, String Name, String Surname, String PhoneNumber,
    		String Email){
    	this.AdministratorId = AdministratorId;
    	this.Password = Password;
    	this.Name = Name;
    	this.Surname = Surname;
    	this.PhoneNumber = PhoneNumber;
		this.Email = Email;
    }
    
    public int getAdministratorId() {
        return AdministratorId;
    }
    public void setAdministratorId(int AdministratorId) {
        this.AdministratorId = AdministratorId;
    }
    
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
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
    
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
        
}
