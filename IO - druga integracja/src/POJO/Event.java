package POJO;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Event")
public class Event {
	
	@DatabaseField(generatedId = true)
    private int EventId;
    @DatabaseField
    private String Name;
    @DatabaseField
    private Date StartDate;
    @DatabaseField
    private Date EndDate;
    @DatabaseField
    private boolean IsApproved;
    @DatabaseField
    private int RoomId;
    @DatabaseField
    private int GuestId;
    @DatabaseField
    private int PersonnelId;
    
    public Event(){
    	
    }
    
    public Event(int EventId, String Name, Date StartDate, Date EndDate, boolean IsApproved, int RoomId, int GuestId, int PersonnelId){
    	this.EventId = EventId;
    	this.Name = Name;
    	this.StartDate = StartDate;
    	this.EndDate = EndDate;
    	this.IsApproved = IsApproved;
    	this.RoomId = RoomId;
    	this.GuestId = GuestId;
    	this.PersonnelId = PersonnelId;    	
    }
    
    public int getEventId() {
        return EventId;
    }
    public void setEventId(int EventId) {
        this.EventId = EventId;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public Date getStartDate() {
        return StartDate;
    }
    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
    
    public Date getEndDate() {
        return EndDate;
    }
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    
    public boolean getIsApproved() {
        return IsApproved;
    }
    public void setIsApproved(boolean IsApproved) {
        this.IsApproved = IsApproved;
    }
    
    public int getRoomId() {
        return RoomId;
    }
    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }
    
    public int getGuestId() {
        return GuestId;
    }
    public void setGuestId(int GuestId) {
        this.GuestId = GuestId;
    }
    
    public int getPersonnelId() {
        return PersonnelId;
    }
    public void setPersonnelId(int PersonnelId) {
        this.PersonnelId = PersonnelId;
    }
}
