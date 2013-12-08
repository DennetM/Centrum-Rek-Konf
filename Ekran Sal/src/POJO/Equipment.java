package POJO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Equipment")
public class Equipment {

	@DatabaseField(generatedId = true)
    private int EquipmentId;
    @DatabaseField
    private int TablesCount;
    @DatabaseField
    private int ChairsCount;
    @DatabaseField
    private int ProjectorsCount;
    @DatabaseField
    private int SpeakersCount;
    @DatabaseField
    private int MicrophonesCount;
    @DatabaseField
    private int ComputersCount;
    @DatabaseField
    private int TVCount;
    @DatabaseField
    private int FlipchartCount;
    @DatabaseField
    private int StepCount;
    @DatabaseField
    private int ExerciseMatCount;
    @DatabaseField
    private int BallCount;
    @DatabaseField
    private int DumbbellCount;
    @DatabaseField
    private int BilliardTableCount;
    @DatabaseField
    private int SoccerTableCount;
    @DatabaseField
    private int RadioCount;
    @DatabaseField
    private boolean Bowling;
  
    public Equipment(){
    }
    
    public Equipment(int EquipmentId, int TablesCount, int ChairsCount, int ProjectorsCount, int SpeakersCount, 
    		int MicrophonesCount, int ComputersCount, int TVCount, int FlipchartCount, int StepCount, int ExerciseMatCount,
    		int BallCount, int DumbbellCount, int BilliardTableCount, int SoccerTableCount, int RadioCount,
    		boolean Bowling) {
    	
        this.EquipmentId = EquipmentId;
        this.TablesCount = TablesCount;
        this.ChairsCount = ChairsCount;
        this.ProjectorsCount = ProjectorsCount;
        this.SpeakersCount = SpeakersCount;
        this.MicrophonesCount = MicrophonesCount;
        this.ComputersCount = ComputersCount;
        this.TVCount = TVCount;
        this.FlipchartCount = FlipchartCount;
        this.StepCount = StepCount;
        this.ExerciseMatCount = ExerciseMatCount;
        this.BallCount = BallCount;
        this.DumbbellCount = DumbbellCount;
        this.BilliardTableCount = BilliardTableCount;
        this.SoccerTableCount = SoccerTableCount;
        this.RadioCount = RadioCount;
        this.Bowling = Bowling;
    }
	
    public int getEquipmentId() {
        return EquipmentId;
    }
    public void setEquipmentId(int EquipmentId) {
        this.EquipmentId = EquipmentId;
    }
    
    public int getTablesCount() {
        return TablesCount;
    }
    public void setTablesCount(int TablesCount) {
        this.TablesCount = TablesCount;
    }
    
    public int getChairsCount() {
        return ChairsCount;
    }
    public void setChairsCount(int ChairsCount) {
        this.ChairsCount = ChairsCount;
    }
    
    public int getProjectorsCount() {
        return ProjectorsCount;
    }
    public void setProjectorsCount(int ProjectorsCount) {
        this.ProjectorsCount = ProjectorsCount;
    }
    
    public int getSpeakersCount() {
        return SpeakersCount;
    }
    public void setSpeakersCount(int SpeakersCount) {
        this.SpeakersCount = SpeakersCount;
    }
    
    public int getMicrophonesCount() {
        return MicrophonesCount;
    }
    public void setMicrophonesCount(int MicrophonesCount) {
        this.MicrophonesCount = MicrophonesCount;
    }
    
    public int getComputersCount() {
        return ComputersCount;
    }
    public void setComputersCount(int ComputersCount) {
        this.ComputersCount = ComputersCount;
    }
    
    public int getTVCount() {
        return TVCount;
    }
    public void setTVCount(int TVCount) {
        this.TVCount = TVCount;
    }
    
    public int getFlipchartCount() {
        return FlipchartCount;
    }
    public void setFlipchartCount(int FlipchartCount) {
        this.FlipchartCount = FlipchartCount;
    }
    
    public int getStepCount() {
        return StepCount;
    }
    public void setStepCount(int StepCount) {
        this.StepCount = StepCount;
    }
    
    public int getExerciseMatCount() {
        return ExerciseMatCount;
    }
    public void setExerciseMatCount(int ExerciseMatCount) {
        this.ExerciseMatCount = ExerciseMatCount;
    }
    
    public int getBallCount() {
        return BallCount;
    }
    public void setBallCount(int BallCount) {
        this.BallCount = BallCount;
    }
    
    public int getDumbbellCount() {
        return DumbbellCount;
    }
    public void setDumbbellCount(int DumbbellCount) {
        this.DumbbellCount = DumbbellCount;
    }
    
    public int getBilliardTableCount() {
        return BilliardTableCount;
    }
    public void setBilliardTableCount(int BilliardTableCount) {
        this.BilliardTableCount = BilliardTableCount;
    }
    
    public int getSoccerTableCount() {
        return SoccerTableCount;
    }
    public void setSoccerTableCount(int SoccerTableCount) {
        this.SoccerTableCount = SoccerTableCount;
    }
    
    public int getRadioCount() {
        return RadioCount;
    }
    public void setRadioCount(int RadioCount) {
        this.RadioCount = RadioCount;
    }
    
    public boolean getBowling() {
        return Bowling;
    }
    public void setBowling(boolean Bowling) {
        this.Bowling = Bowling;
    }
}
