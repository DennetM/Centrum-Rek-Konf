package gui.panel;



import gui.frame.AdminLoginFrame;
import gui.frame.OverseerFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import main.Program;


import POJO.Event;
import controler.AdminEventControler;

@SuppressWarnings("serial")
public class AdminReservPanel extends JPanel {
	private EventListTablePanel eventListTablePanel;
	private JLabel zgoszeniaLabel;
	private JButton rezerwjButton;
	private JButton odrzuButton;

	/**
	 * Create the panel.
	 */
	public AdminReservPanel() {

		if (Program.isAdmin()) {
		initialize();
		}
	}

	private void initialize() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setPreferredSize(new Dimension(734, 315));

		eventListTablePanel = new EventListTablePanel(false);

		zgoszeniaLabel = new JLabel("Zg\u0142oszenia");

		rezerwjButton = new JButton("Rezerwuj");
		rezerwjButton.addActionListener(new RezerwjButtonActionListener());

		odrzuButton = new JButton("Odrzu\u0107");
		odrzuButton.addActionListener(new OdrzuButtonActionListener());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(eventListTablePanel, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(odrzuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(rezerwjButton, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)).addGap(31)).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addContainerGap(679, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(eventListTablePanel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addGap(32).addComponent(rezerwjButton).addPreferredGap(ComponentPlacement.RELATED).addComponent(odrzuButton))).addContainerGap(19, Short.MAX_VALUE)));
		setLayout(groupLayout);
	}

	private class RezerwjButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			int index = eventListTablePanel.getTable().getSelectedRow();
			if (index >= 0 && index < eventListTablePanel.getTableData().size()) {

				int eventid = (int) eventListTablePanel.getModel().getValueAt(index, 0); // pobranie
																							// zaznaczonego
																							// event
																							// id
																							// z
																							// tabeli
				Event event = eventListTablePanel.getEventForID(eventid);
				if (event != null) {
					// *przejscie do panelu rezerwacji i przeladowanie listy
					OverseerFrame.main(null);
				}

			}

		}
	}

	private class OdrzuButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int index = eventListTablePanel.getTable().getSelectedRow();
			if (index >= 0 && index < eventListTablePanel.getTableData().size()) {

				// komunikat potwierdzajacy moze?
				int eventid = (int) eventListTablePanel.getModel().getValueAt(index, 0); // pobranie
																							// zaznaczonego
																							// event
																							// id
																							// z
																							// tabeli
				Event event = eventListTablePanel.getEventForID(eventid);

				if (event != null) {
					AdminEventControler control = new AdminEventControler();
					event.setIsApproved(true);

					if (!Program.testMode) { // tryb testowy niejest podlaczony
												// do bazy
						control.cancelEvent(event);
					}


					eventListTablePanel.reloadDateIdRoom(event.getRoomId());
				}
			}
		}
	}

	public EventListTablePanel getEventListTablePanel() {
		return eventListTablePanel;
	}

	public void setEventListTablePanel(EventListTablePanel eventListTablePanel) {
		this.eventListTablePanel = eventListTablePanel;
	}
}
