package gui.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import conteners.RoomEquipment;
import filter.RoomFilter;

@SuppressWarnings("serial")
public class RoomListFilterPanel extends JPanel {

	private boolean admin;
	private RoomListTablePanel panelHandle;

	private JLabel dostpnoLabel;
	private JComboBox<String> cbAvaible;
	private JLabel typSaliLabel;
	private JComboBox<String> cbTypeRoom;
	private JLabel cenaOdLabel;
	private JTextField costfromTextField;
	private JLabel doLabel;
	private JTextField costToTextField;
	private JLabel iloOsbMinLabel;
	private JTextField minpeopleTextField;
	private JLabel maxLabel;
	private JTextField maxpeopleTextField_1;
	private JLabel powierzczhniaOdLabel;
	private JTextField minsurfaceTextField;
	private JLabel doLabel_1;
	private JTextField maxsurfaceTextField;
	private JLabel pokjNrLabel;
	private JTextField roomNumberTextField;
	private JButton filtrujButton;

	public RoomListFilterPanel(RoomListTablePanel handle, boolean admin) {
		this.admin = admin;
		this.panelHandle = handle;
		initialize();
	}

	private void initialize() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setPreferredSize(new Dimension(330, 225));

		dostpnoLabel = new JLabel("Dost\u0119pno\u015B\u0107");

		cbAvaible = new JComboBox<String>();
		cbAvaible.setModel(new DefaultComboBoxModel<String>(new String[] { "Wybierz", "Dost\u0119pny", "Niedost\u0119pny" }));

		typSaliLabel = new JLabel("Typ sali");

		cbTypeRoom = new JComboBox<String>();
		cbTypeRoom.setModel(new DefaultComboBoxModel<String>(new String[] { "Wybierz", "Konferencyjna", "Si\u0142ownia" }));

		cenaOdLabel = new JLabel("Cena od:");

		costfromTextField = new JTextField();
		costfromTextField.setColumns(10);

		doLabel = new JLabel("do:");

		costToTextField = new JTextField();
		costToTextField.setColumns(10);

		iloOsbMinLabel = new JLabel("Ilo\u015B\u0107 os\u00F3b min:");

		minpeopleTextField = new JTextField();
		minpeopleTextField.setColumns(10);

		maxLabel = new JLabel("max:");

		maxpeopleTextField_1 = new JTextField();
		maxpeopleTextField_1.setColumns(10);

		powierzczhniaOdLabel = new JLabel("Powierzczhnia od:");

		minsurfaceTextField = new JTextField();
		minsurfaceTextField.setColumns(10);

		doLabel_1 = new JLabel("do:");

		maxsurfaceTextField = new JTextField();
		maxsurfaceTextField.setColumns(10);

		pokjNrLabel = new JLabel("Pok\u00F3j nr:");

		roomNumberTextField = new JTextField();
		roomNumberTextField.setColumns(10);

		filtrujButton = new JButton("Filtruj");
		filtrujButton.addActionListener(new FiltrujButtonActionListener());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout
				.createSequentialGroup()
				.addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cenaOdLabel)
						.addComponent(iloOsbMinLabel)
						.addComponent(dostpnoLabel)
						.addComponent(typSaliLabel)
						.addComponent(powierzczhniaOdLabel)
						.addComponent(pokjNrLabel))
				.addGap(30)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(cbTypeRoom, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cbAvaible, 0, 97, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
				.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(costfromTextField, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(roomNumberTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
					.addComponent(minsurfaceTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
					.addComponent(minpeopleTextField, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(maxLabel).addComponent(doLabel_1)
					.addComponent(doLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
					.addComponent(costToTextField, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
					.addComponent(maxpeopleTextField_1, 0, 0, Short.MAX_VALUE)
					.addComponent(maxsurfaceTextField, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
					.addComponent(filtrujButton)).addGap(26))).addGap(21)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
			.addContainerGap()
			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbAvaible, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(dostpnoLabel))
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(cbTypeRoom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(typSaliLabel))
			.addPreferredGap(ComponentPlacement.UNRELATED)
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(cenaOdLabel)
					.addComponent(costfromTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
					.addComponent(iloOsbMinLabel)
					.addComponent(minpeopleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
					.addComponent(powierzczhniaOdLabel)
			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(minsurfaceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(doLabel_1)
					.addComponent(maxsurfaceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
			.addGroup(groupLayout.createSequentialGroup()
			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
					.addComponent(costToTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(doLabel))
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(maxLabel)
					.addComponent(maxpeopleTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
			.addGap(18)
			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
					.addComponent(pokjNrLabel)
					.addComponent(roomNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
			.addGroup(groupLayout.createSequentialGroup()
			.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(filtrujButton)))
			.addContainerGap()));
		setLayout(groupLayout);
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Properties buildFilterProperties() {
		Properties filter = new Properties();

		int index = this.cbAvaible.getSelectedIndex();
		if (index != 0) {
			if (index == 1) {
				filter.put("AVAIBLE", Boolean.TRUE);
			} else if (index == 2) {
				filter.put("AVAIBLE", Boolean.FALSE);
			}
		}

		String type = this.cbTypeRoom.getSelectedItem().toString();
		if (this.cbTypeRoom.getSelectedIndex() != 0 && !type.isEmpty()) {
			filter.put("ROOM_TYPE", type);
		}

		try {
			int roomNo = Integer.valueOf(this.roomNumberTextField.getText());

			filter.put("ROOM_NUMBER", roomNo);

		} catch (NumberFormatException e) {

		}

		try {
			int minPaople = Integer.valueOf(this.minpeopleTextField.getText());
			if (minPaople > 0) {
				filter.put("MIN_PEOPLE", minPaople);
			}
		} catch (NumberFormatException e) {

		}

		try {
			int maxPaople = Integer.valueOf(this.maxpeopleTextField_1.getText());
			if (maxPaople > 0) {
				filter.put("MAX_PEOPLE", maxPaople);
			}
		} catch (NumberFormatException e) {

		}

		try {
			float minSurface = Float.valueOf(this.minsurfaceTextField.getText());
			if (minSurface > 0) {
				filter.put("MIN_SURFACE", minSurface);
			}
		} catch (NumberFormatException e) {

		}

		try {
			float maxSurface = Float.valueOf(this.maxsurfaceTextField.getText());
			if (maxSurface > 0) {
				filter.put("MAX_SURFACE", maxSurface);
			}
		} catch (NumberFormatException e) {

		}

		try {
			float minCost = Float.valueOf(this.costfromTextField.getText());
			if (minCost > 0) {
				filter.put("MIN_PRICE", minCost);
			}
		} catch (NumberFormatException e) {

		}

		try {
			float maxCost = Float.valueOf(this.costToTextField.getText());
			if (maxCost > 0) {
				filter.put("MAX_PRICE", maxCost);
			}
		} catch (NumberFormatException e) {

		}

		return filter;
	}

	private class FiltrujButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (panelHandle != null) {
				RoomFilter filter = new RoomFilter();
				List<RoomEquipment> filterList = new ArrayList<>();
				filterList.addAll(filter.filter(panelHandle.getListRooms(), buildFilterProperties()));
				panelHandle.reloadData(filterList, true);
			}
		}
	}
}
