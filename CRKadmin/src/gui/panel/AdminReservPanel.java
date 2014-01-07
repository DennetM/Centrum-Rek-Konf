package gui.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import main.Program;
import POJO.Event;

import com.toedter.calendar.JDateChooser;

import controler.AdminEventControler;

@SuppressWarnings("serial")
public class AdminReservPanel extends JPanel {
	private EventListTablePanel eventListTablePanel;
	private JLabel zgoszeniaLabel;
	private JButton rezerwjButton;
	private JButton odrzuButton;
	private JLabel filtrowanieZgoszeLabel;
	private JLabel odLabel;
	private JDateChooser dateFromFilterChooser;
	private JLabel doLabel;
	private JDateChooser dateToFIlterChooser;
	private JButton filtrujZgoszeniaButton;

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

		filtrowanieZgoszeLabel = new JLabel("Filtrowanie zg\u0142osze\u0144");

		odLabel = new JLabel("od:");

		dateFromFilterChooser = new JDateChooser();

		doLabel = new JLabel("do:");

		dateToFIlterChooser = new JDateChooser();

		filtrujZgoszeniaButton = new JButton("Filtruj zg\u0142oszenia");
		filtrujZgoszeniaButton.addActionListener(new FiltrujZgoszeniaButtonActionListener());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addContainerGap(679, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addComponent(filtrowanieZgoszeLabel).addContainerGap()).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false).addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(odLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(dateFromFilterChooser, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE).addGap(18).addComponent(doLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(dateToFIlterChooser, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(filtrujZgoszeniaButton)).addComponent(eventListTablePanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)).addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(odrzuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(rezerwjButton, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)).addGap(31)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(eventListTablePanel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addGap(32).addComponent(rezerwjButton).addPreferredGap(ComponentPlacement.RELATED).addComponent(odrzuButton))).addGap(18).addComponent(filtrowanieZgoszeLabel).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(odLabel).addComponent(dateFromFilterChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(doLabel).addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(filtrujZgoszeniaButton).addComponent(dateToFIlterChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))).addContainerGap(17, Short.MAX_VALUE)));
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
					event.setIsApproved(false);

					if (!Program.testMode) { // tryb testowy niejest podlaczony
												// do bazy
						control.cancelEvent(event);
					}

					eventListTablePanel.reloadDateIdRoom(event.getRoomId());
					Date from = dateFromFilterChooser.getDate();
					Date to = dateToFIlterChooser.getDate();
					eventListTablePanel.reloadFilterDate(from, to);
				}
			}
		}
	}

	private class FiltrujZgoszeniaButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			Date from = dateFromFilterChooser.getDate();
			Date to = dateToFIlterChooser.getDate();
			eventListTablePanel.reloadFilterDate(from, to);
		}
	}

	public EventListTablePanel getEventListTablePanel() {
		return eventListTablePanel;
	}

	public void setEventListTablePanel(EventListTablePanel eventListTablePanel) {
		this.eventListTablePanel = eventListTablePanel;
	}

	public JDateChooser getDateToFIlterChooser() {
		return dateToFIlterChooser;
	}

	public JDateChooser getDateFromFilterChooser() {
		return dateFromFilterChooser;
	}
}
