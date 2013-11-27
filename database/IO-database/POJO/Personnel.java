import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Personnel")
public class Personnel {
	
	@DatabaseField(generatedId = true)
    private int PersonnelId;
    @DatabaseField
    private String Name;
    @DatabaseField
    private String Surname;
    @DatabaseField
    private String JobDescription;

    public Personnel(){
    	
    }
    
    public Personnel(int PersonnelId, String Name, String Surname, String JobDescription){
    	this.PersonnelId = PersonnelId;
    	this.Name = Name;
    	this.Surname = Surname;
    	this.JobDescription = JobDescription;
    	}
    
    public int getPersonnelId() {
        return PersonnelId;
    }
    public void setPersonnelId(int PersonnelId) {
        this.PersonnelId = PersonnelId;
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
    
    public String getJobDescription() {
        return JobDescription;
    }
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }
}
