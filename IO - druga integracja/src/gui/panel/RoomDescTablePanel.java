package gui.panel;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import POJO.Equipment;
import POJO.Room;
import conteners.RoomEquipment;

/**
 * 
 * Panel zawieraj¹cy tabele szczegó³ow sali
 * 
 */
@SuppressWarnings("serial")
public class RoomDescTablePanel extends JPanel {

	private boolean admin; // flaga okreslajaca tryb tabelki dla admina/goscia
	private Vector<String> labels = new Vector<>();
	private Vector<Vector<Object>> tableData = new Vector<>();
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Create the panel.
	 */
	public RoomDescTablePanel(boolean admin) {
		this.admin = admin;
		labels.add("");
		labels.add("");
		model = new DefaultTableModel(tableData, labels);
		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}

	 //public void reloadData(Room room) {
	 //reloadData(room, null);
	 //}

	/**
	 * Prze³adowanie danych w tabelce
	 * 
	 * @param room
	 */
	public void reloadData(RoomEquipment roomEquipment) {
		tableData.clear();
		Room room = roomEquipment.getRoom();
		Equipment equip = roomEquipment.getEquipment();

		if (admin) {
			addRow("ID Sali", room.getRoomId());
			addRow("Numer pokoju", room.getRoomNumber());
			addRow("Dostêpny", room.getAvailability());
		}
		addRow("Powierzchnia", room.getSurface());
		addRow("Limit osób", room.getPeopleLimit());
		addRow("Typ", room.getType());
		addRow("Cena", room.getPrice());

		if (equip != null) {
			if (admin) {
				addRow("ID Wyposarzenia", room.getEquipmentId());
			}
			addRow("Iloœæ sto³ów", equip.getTablesCount());
			addRow("Iloœæ krzese³", equip.getChairsCount());
			addRow("Iloœæ projektorów", equip.getProjectorsCount());
			addRow("Iloœæ g³oœników", equip.getSpeakersCount());
			addRow("Iloœæ mikrofonów", equip.getMicrophonesCount());
			addRow("Iloœæ komputerów", equip.getComputersCount());
			addRow("Iloœæ telewizorów", equip.getTVCount());
			addRow("Iloœæ tablic", equip.getFlipchartCount());
			addRow("Stepery", equip.getStepCount());
			addRow("Maty do æwiczeñ", equip.getExerciseMatCount());
			addRow("Pi³ki", equip.getBallCount());
			addRow("Hantle", equip.getDumbbellCount());
			addRow("Sto³y do bilarda", equip.getBilliardTableCount());
			addRow("Sto³y do pi³karzyków", equip.getSoccerTableCount());
			addRow("Radia", equip.getRadioCount());
			addRow("Krêgle", equip.getBowling());
		}

		((DefaultTableModel) table.getModel()).setDataVector(tableData, labels);
	}

	/**
	 * Dodanie pojedynczego wiersza do tabeli o dowolnej ilosci kolumn
	 * 
	 * @param data
	 */
	public void addRow(Object... data) {
		Vector<Object> row = new Vector<>();
		row.addAll(Arrays.asList(data));
		tableData.add(row);
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
