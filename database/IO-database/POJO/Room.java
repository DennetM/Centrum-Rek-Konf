import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Room")
public class Room {

	@DatabaseField(generatedId = true)
    private int RoomId;
    @DatabaseField
    private int RoomNumberme;
    @DatabaseField
    private float Surface;
    @DatabaseField
    private boolean Availability;
    @DatabaseField
    private int PeopleLimit;
    @DatabaseField
    private int EquipmentId;
    @DatabaseField
    private String Type;
    @DatabaseField
    private float Price;
    
    public Room(){
    	
    }
    
    public Room(int RoomId, int RoomNumber, float Surface, boolean Availability, int PeopleLimit, 
    int EquipmentId, String Type, float Price){
    	this.RoomId = RoomId;
    	this.RoomNumberme = RoomNumber;
    	this.Surface = Surface;
    	this.Availability = Availability;
    	this.PeopleLimit = PeopleLimit;
    	this.EquipmentId = EquipmentId;
    	this.Type = Type;
    	this.Price = Price;
    }
    
    public int getRoomId() {
        return RoomId;
    }
    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }
    public int getRoomNumberme() {
        return RoomNumberme;
    }
    public void setRoomNumberme(int RoomNumberme) {
        this.RoomNumberme = RoomNumberme;
    }
    public float getSurface() {
        return Surface;
    }
    public void setSurface(float Surface) {
        this.Surface = Surface;
    }
    public boolean getAvailability() {
        return Availability;
    }
    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }
    public int getPeopleLimit() {
        return PeopleLimit;
    }
    public void setPeopleLimit(int PeopleLimit) {
        this.PeopleLimit = PeopleLimit;
    }
    public int getEquipmentId() {
        return EquipmentId;
    }
    public void setEquipmentId(int EquipmentId) {
        this.EquipmentId = EquipmentId;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public float getPrice() {
        return Price;
    }
    public void setPrice(float Price) {
        this.Price = Price;
    }
}
