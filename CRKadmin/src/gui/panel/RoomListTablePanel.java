package gui.panel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import POJO.Room;
import conteners.RoomEquipment;

/**
 * 
 * Panel z tabela listy dostepnych sal
 * 
 * 
 */
@SuppressWarnings("serial")
public class RoomListTablePanel extends JPanel {

	private boolean admin;// flaga okreslajaca tryb tabelki dla admina/goscia
	private Vector<String> labels = new Vector<>();
	private Vector<Vector<Object>> tableData = new Vector<>();
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	private RoomDescTablePanel descHandle; // uchwyt do panelu tworzacy
											// powiazanie z panelemszczegu³ow
											// pokoju
	private EventListTablePanel eventHandle;
	private List<RoomEquipment> listRooms; // List obiektów Roomi pomocniczodla
											// listnera


	/**
	 * Create the panel.
	 */
	public RoomListTablePanel(boolean admin) {
		this.setAdmin(admin);
		listRooms = new ArrayList<>();
		if (admin) {
			labels.add("ID Sala");
		}
		labels.add("Numer sali");
		labels.add("Typ sali");
		labels.add("Powierzchnia");
		labels.add("Limit osób");
		if (admin) {
			labels.add("Status");
		}
		model = new DefaultTableModel(tableData, labels);
		initialize();
	}

	/**
	 * @wbp.parser.constructor
	 */
	public RoomListTablePanel(RoomDescTablePanel desc, boolean admin) {
		this(admin);
		descHandle = desc;

	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(model);
		table.getSelectionModel().addListSelectionListener(selectionListner());
		scrollPane.setViewportView(table);
	}

	/**
	 * Listenr do prze³adowania roomDescPanelu
	 * 
	 * @return
	 */
	public ListSelectionListener selectionListner() {
		return new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index = table.getSelectedRow();
				if (descHandle != null) {

					if (index >= 0 && index < tableData.size()) {
						descHandle.reloadData(listRooms.get(index));
					}
				}

				if (eventHandle != null) {

					if (index >= 0 && index < tableData.size()) {
						eventHandle.reloadDateIdRoom(listRooms.get(index).getRoom().getRoomId());
					}
				}
			}
		};
	}

	public void reloadData(List<RoomEquipment> rooms) {
		reloadData(rooms, false);
	}

	/**
	 * Prze³adowanie danych w tabelce
	 * 
	 * @param rooms
	 */
	public void reloadData(List<RoomEquipment> rooms, boolean filtered) {
		if (!filtered) {
			listRooms.clear();
			listRooms.addAll(rooms);
		}

		tableData.clear();

		for (RoomEquipment rme : rooms) {
			Room rm = rme.getRoom();
			if (admin) {
				addRow(rm.getRoomId(), rm.getRoomNumberme(), rm.getType(), rm.getSurface(), rm.getPeopleLimit(), rm.getAvailability());
			} else {
				addRow(rm.getRoomNumberme(), rm.getType(), rm.getSurface(), rm.getPeopleLimit());
			}
		}

		((DefaultTableModel) table.getModel()).setDataVector(tableData, labels);
	}

	public RoomEquipment getRoomForNo(int no) {
		for (RoomEquipment re : listRooms) {
			if (re.getRoom().getRoomNumberme() == no) {
				return re;
			}
		}
		return null;
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

	public Vector<Vector<Object>> getTableData() {
		return tableData;
	}

	public void setTableData(Vector<Vector<Object>> tableData) {
		this.tableData = tableData;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public List<RoomEquipment> getListRooms() {
		return listRooms;
	}

	public void setListRooms(List<RoomEquipment> listRooms) {
		this.listRooms = listRooms;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public RoomDescTablePanel getDescHandle() {
		return descHandle;
	}

	public void setDescHandle(RoomDescTablePanel descHandle) {
		this.descHandle = descHandle;
	}

	public EventListTablePanel getEventHandle() {
		return eventHandle;
	}

	public void setEventHandle(EventListTablePanel eventHandle) {
		this.eventHandle = eventHandle;
	}

}
