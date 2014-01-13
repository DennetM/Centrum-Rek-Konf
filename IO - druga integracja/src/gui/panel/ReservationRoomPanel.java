package gui.panel;

import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import main.Program;
import POJO.Event;
import conteners.RoomEquipment;
import controler.AdminEventControler;
import controler.AdminRoomControler;

@SuppressWarnings("serial")
public class ReservationRoomPanel extends JPanel {

	private boolean admin;// flaga okreslajaca tryb tabelki dla admina/goscia
	private RoomDescTablePanel roomDescPanel;

	private JLabel newLabelLabel;
	private JLabel newLabelLabel_1;
	private RoomListTablePanel roomListPanel;
	private JLabel filtrowanieLabel;
	private RoomListFilterPanel roomListFilterPanel;
	private AdminReservPanel adminReservPanel;

	private AdminRoomControler roomControler;
	private AdminEventControler eventControler;
	private GuestReservPanel guestReservPanel;
	/**
	 * Create the panel.
	 */
	public ReservationRoomPanel(boolean admin) {
		this.admin = admin;
		roomControler = new AdminRoomControler();
		eventControler = new AdminEventControler();
		initialize();
		if (admin) {
			reloadData();
		}
	}

	private void reloadData() {

		if (Program.testMode) {
			reloadRoomListData(roomControler.getListRoomEquipmentDataTest());

			if (admin) {
				roomListPanel.setEventHandle(adminReservPanel.getEventListTablePanel());
				List<Event> list = eventControler.getListEventTest();
				adminReservPanel.getEventListTablePanel().setListEvents(list);
			}
		} else {
			reloadRoomListData(roomControler.getListRoomEquipmentData());

			if (admin) {
				roomListPanel.setEventHandle(adminReservPanel.getEventListTablePanel());
				List<Event> list = eventControler.getListEvent();
				adminReservPanel.getEventListTablePanel().setListEvents(list);
			}
		}

	}

	private void initialize() {

		roomDescPanel = new RoomDescTablePanel(admin);

		newLabelLabel = new JLabel("Parametry sali");

		newLabelLabel_1 = new JLabel("Lista sal");

		roomListPanel = new RoomListTablePanel(roomDescPanel, admin);

		filtrowanieLabel = new JLabel("Filtrowanie");

		roomListFilterPanel = new RoomListFilterPanel(roomListPanel, admin);

		if(!admin)reloadData();

		adminReservPanel = new AdminReservPanel();

		guestReservPanel = new GuestReservPanel(roomListPanel);

		GroupLayout groupLayout = new GroupLayout(this);
		
		if (admin) {
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(newLabelLabel_1).addComponent(roomListPanel, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(filtrowanieLabel).addComponent(roomListFilterPanel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(newLabelLabel).addComponent(roomDescPanel, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)).addPreferredGap(ComponentPlacement.RELATED).addComponent(adminReservPanel, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))).addContainerGap()));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(10).addComponent(newLabelLabel_1).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomListPanel, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(filtrowanieLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomListFilterPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(newLabelLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomDescPanel, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE).addGap(20)).addGroup(groupLayout.createSequentialGroup().addComponent(adminReservPanel, GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE).addContainerGap()))));
			
		} else {
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(newLabelLabel_1).addComponent(roomListPanel, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(filtrowanieLabel).addComponent(roomListFilterPanel, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(newLabelLabel).addComponent(roomDescPanel, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(guestReservPanel, GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE))).addContainerGap()));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(10).addComponent(newLabelLabel_1).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomListPanel, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(filtrowanieLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomListFilterPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(newLabelLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(roomDescPanel, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)).addComponent(guestReservPanel, 0, 0, Short.MAX_VALUE)).addGap(20)));

		}
		
		setLayout(groupLayout);

	}

	public void reloadRoomData(RoomEquipment room) {
		roomDescPanel.reloadData(room);
	}

	public void reloadRoomListData(List<RoomEquipment> rooms) {
		roomListPanel.reloadData(rooms);
	}
}
