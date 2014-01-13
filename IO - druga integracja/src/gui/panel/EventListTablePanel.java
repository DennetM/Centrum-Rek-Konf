package gui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import POJO.Event;

/**
 * 
 * Panel z tabela listy dostepnych sal
 * 
 * 
 */
@SuppressWarnings("serial")
public class EventListTablePanel extends JPanel {
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
	private boolean admin;// flaga okreslajaca tryb tabelki dla admina/goscia
	private Vector<String> labels = new Vector<>();
	private Vector<Vector<Object>> tableData = new Vector<>();
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model;
	private List<Event> listEvents; // List obiektów RoomModeli pomocniczo
									// dla listnera

	private int tempIdRoom = 0;

	/**
	 * Create the panel.
	 */
	public EventListTablePanel(boolean admin) {
		this.setAdmin(admin);
		listEvents = new ArrayList<>();
		labels.add("ID Event");
		labels.add("Nazwa");
		labels.add("ID Sali");
		labels.add("ID Goœcia");
		labels.add("Od");
		labels.add("Do");

		labels.add("Status");
		model = new DefaultTableModel(tableData, labels);
		initialize();
	}

	private void initialize() {
		setPreferredSize(new Dimension(500, 280));
		setMaximumSize(new Dimension(500, 280));
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(model);

		scrollPane.setViewportView(table);
	}

	/**
	 * Prze³adowanie danych w tabelce
	 * 
	 * @param rooms
	 */
	public void reloadData(List<Event> events) {
		listEvents.clear();
		tableData.clear();
		listEvents.addAll(events);

		for (Event rm : events) {
			addRow(rm.getEventId(), rm.getName(), rm.getRoomId(), rm.getGuestId(), rm.getStartDate() != null ? dateFormat.format(rm.getStartDate()) : "", rm.getEndDate() != null ? dateFormat.format(rm.getEndDate()) : "", rm.getIsApproved());
		}

		((DefaultTableModel) table.getModel()).setDataVector(tableData, labels);
	}

	public void reloadDateIdRoom(int idRoom) {

		tableData.clear();
		if (listEvents != null) {
			tempIdRoom = idRoom;
			for (Event rm : listEvents) {
				if (rm.getRoomId() == idRoom) {
					addRow(rm.getEventId(), rm.getName(), rm.getRoomId(), rm.getGuestId(), rm.getStartDate() != null ? dateFormat.format(rm.getStartDate()) : "", rm.getEndDate() != null ? dateFormat.format(rm.getEndDate()) : "", rm.getIsApproved());
				}

			}
		}
		((DefaultTableModel) table.getModel()).setDataVector(tableData, labels);
	}

	public void reloadFilterDate(Date from, Date to) {

		tableData.clear();
		if (listEvents != null) {
			for (Event rm : listEvents) {
				if (rm.getRoomId() == tempIdRoom) {
					if (from != null && (rm.getStartDate() == null || from.after(rm.getStartDate()))) {
						continue;
					} else if (to != null && (rm.getEndDate() == null || to.before(rm.getStartDate()))) {
						continue;
					}

					addRow(rm.getEventId(), rm.getName(), rm.getRoomId(), rm.getGuestId(), rm.getStartDate() != null ? dateFormat.format(rm.getStartDate()) : "", rm.getEndDate() != null ? dateFormat.format(rm.getEndDate()) : "", rm.getIsApproved());
				}

			}
		}
		((DefaultTableModel) table.getModel()).setDataVector(tableData, labels);
	}


	public Event getEventForID(int eventid) {
		for (Event e : listEvents) {
			if (e.getEventId() == eventid) {
				return e;
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

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public List<Event> getListEvents() {
		return listEvents;
	}

	public void setListEvents(List<Event> listEvents) {
		this.listEvents = listEvents;
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

}
