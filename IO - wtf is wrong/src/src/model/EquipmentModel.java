package model;

public class EquipmentModel {

	private int idEquipment;
	private int tablesCount;
	private int chairsCount;
	private int projectorsCount;
	private int speakersCount;
	private int microphonesCount;
	private int computersCount;
	private int tvCount;
	private int flipchartCount;
	private int stepCount;
	private int exerciseMatCount;
	private int ballCount;
	private int dumbbellCount;
	private int bilardCount;
	private int soccerTableCount;
	private int radioCount;
	private boolean bowling;

	public EquipmentModel() {

	}

	public EquipmentModel(EquipmentModel copy) {
		this.idEquipment = copy.idEquipment;
		this.tablesCount = copy.tablesCount;
		this.chairsCount = copy.chairsCount;
		this.projectorsCount = copy.projectorsCount;
		this.speakersCount = copy.speakersCount;
		this.microphonesCount = copy.microphonesCount;
		this.computersCount = copy.computersCount;
		this.tvCount = copy.tvCount;
		this.flipchartCount = copy.flipchartCount;
		this.stepCount = copy.stepCount;
		this.exerciseMatCount = copy.exerciseMatCount;
		this.ballCount = copy.ballCount;
		this.dumbbellCount = copy.dumbbellCount;
		this.bilardCount = copy.bilardCount;
		this.soccerTableCount = copy.soccerTableCount;
		this.radioCount = copy.radioCount;
		this.bowling = copy.bowling;
	}

	public int getIdEquipment() {
		return idEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		this.idEquipment = idEquipment;
	}

	public int getTablesCount() {
		return tablesCount;
	}

	public void setTablesCount(int tablesCount) {
		this.tablesCount = tablesCount;
	}

	public int getChairsCount() {
		return chairsCount;
	}

	public void setChairsCount(int chairsCount) {
		this.chairsCount = chairsCount;
	}

	public int getProjectorsCount() {
		return projectorsCount;
	}

	public void setProjectorsCount(int projectorsCount) {
		this.projectorsCount = projectorsCount;
	}

	public int getSpeakersCount() {
		return speakersCount;
	}

	public void setSpeakersCount(int speakersCount) {
		this.speakersCount = speakersCount;
	}

	public int getMicrophonesCount() {
		return microphonesCount;
	}

	public void setMicrophonesCount(int microphonesCount) {
		this.microphonesCount = microphonesCount;
	}

	public int getComputersCount() {
		return computersCount;
	}

	public void setComputersCount(int computersCount) {
		this.computersCount = computersCount;
	}

	public int getTvCount() {
		return tvCount;
	}

	public void setTvCount(int tvCount) {
		this.tvCount = tvCount;
	}

	public int getFlipchartCount() {
		return flipchartCount;
	}

	public void setFlipchartCount(int flipchartCount) {
		this.flipchartCount = flipchartCount;
	}

	public int getStepCount() {
		return stepCount;
	}

	public void setStepCount(int stepCount) {
		this.stepCount = stepCount;
	}

	public int getExerciseMatCount() {
		return exerciseMatCount;
	}

	public void setExerciseMatCount(int exerciseMatCount) {
		this.exerciseMatCount = exerciseMatCount;
	}

	public int getBallCount() {
		return ballCount;
	}

	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}

	public int getDumbbellCount() {
		return dumbbellCount;
	}

	public void setDumbbellCount(int dumbbellCount) {
		this.dumbbellCount = dumbbellCount;
	}

	public int getBilardCount() {
		return bilardCount;
	}

	public void setBilardCount(int bilardCount) {
		this.bilardCount = bilardCount;
	}

	public int getSoccerTableCount() {
		return soccerTableCount;
	}

	public void setSoccerTableCount(int soccerTableCount) {
		this.soccerTableCount = soccerTableCount;
	}

	public int getRadioCount() {
		return radioCount;
	}

	public void setRadioCount(int radioCount) {
		this.radioCount = radioCount;
	}

	public boolean isBowling() {
		return bowling;
	}

	public void setBowling(boolean bowling) {
		this.bowling = bowling;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipmentModel [idEquipment=").append(idEquipment).append(", tablesCount=").append(tablesCount).append(", chairsCount=").append(chairsCount).append(", projectorsCount=").append(projectorsCount).append(", speakersCount=").append(speakersCount).append(", microphonesCount=").append(microphonesCount).append(", computersCount=").append(computersCount).append(", tvCount=").append(tvCount).append(", flipchartCount=").append(flipchartCount).append(", stepCount=").append(stepCount).append(", exerciseMatCount=").append(exerciseMatCount).append(", ballCount=").append(ballCount).append(", dumbbellCount=").append(dumbbellCount).append(", bilardCount=").append(bilardCount).append(", soccerTableCount=").append(soccerTableCount).append(", radioCount=").append(radioCount).append(", bowling=").append(bowling).append("]");
		return builder.toString();
	}

}
