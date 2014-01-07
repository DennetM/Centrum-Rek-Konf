package gui.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EtchedBorder;

import main.Program;
import POJO.Event;

import com.toedter.calendar.JDateChooser;

import conteners.RoomEquipment;
import controler.AdminEventControler;

@SuppressWarnings("serial")
public class GuestReservPanel extends JPanel {

	private RoomListTablePanel roomHandle;
	private JLabel zgoszeniaLabel;
	private JButton rezerwjButton;
	private JLabel czasRezerwacjiLabel;
	private JSpinner fromTimeSpinner;
	private JLabel dzieLabel;
	private JLabel godzinaOdLabel;
	private JLabel doLabel;
	private JSpinner toTimeSpinner;
	private JDateChooser dateChooser;
	private JLabel rezerwacjaNaNazwiskoLabel;
	private JTextField nameTextField;
	private JLabel salaLabel;
	private JComboBox<Integer> comboBox;

	/**
	 * Create the panel.
	 */
	public GuestReservPanel(RoomListTablePanel hand) {

		initialize();
		roomHandle = hand;
		DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>();
		for (RoomEquipment rv : roomHandle.getListRooms()) {
			model.addElement(rv.getRoom().getRoomNumberme());
		}
		comboBox.setModel(model);

	}

	private void initialize() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setPreferredSize(new Dimension(734, 315));

		zgoszeniaLabel = new JLabel("Reserwacja pokoju");

		rezerwjButton = new JButton("Rezerwuj");
		rezerwjButton.addActionListener(new RezerwjButtonActionListener());

		czasRezerwacjiLabel = new JLabel("Czas rezerwacji");
		Date time = new Date();
		fromTimeSpinner = new JSpinner(new SpinnerDateModel());
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(fromTimeSpinner, "HH:mm");
		fromTimeSpinner.setEditor(timeEditor);
		fromTimeSpinner.setValue(time);

		dzieLabel = new JLabel("Dzie\u0144");

		godzinaOdLabel = new JLabel("Godzina od:");

		doLabel = new JLabel("do");
		time = new Date(time.getTime() + 60 * 60 * 1000);

		toTimeSpinner = new JSpinner(new SpinnerDateModel());
		timeEditor = new JSpinner.DateEditor(toTimeSpinner, "HH:mm");
		toTimeSpinner.setEditor(timeEditor);
		toTimeSpinner.setValue(time);

		dateChooser = new JDateChooser(new Date());

		rezerwacjaNaNazwiskoLabel = new JLabel("Rezerwacja na nazwisko:");

		nameTextField = new JTextField();
		nameTextField.setColumns(10);

		salaLabel = new JLabel("Sala");

		comboBox = new JComboBox<Integer>();


		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addGap(537)).addGroup(groupLayout.createSequentialGroup().addComponent(rezerwjButton, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE).addGap(597)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(czasRezerwacjiLabel).addPreferredGap(ComponentPlacement.RELATED, 168, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addGap(22).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(godzinaOdLabel).addComponent(dzieLabel)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(fromTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(doLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(toTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false).addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(rezerwacjaNaNazwiskoLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(ComponentPlacement.RELATED, 122, GroupLayout.PREFERRED_SIZE))).addContainerGap(477, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE).addContainerGap(311, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addComponent(salaLabel).addContainerGap(674, Short.MAX_VALUE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(zgoszeniaLabel).addGap(31).addComponent(salaLabel).addPreferredGap(ComponentPlacement.RELATED).addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE).addComponent(rezerwacjaNaNazwiskoLabel).addGap(5).addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(czasRezerwacjiLabel).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(dzieLabel).addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(godzinaOdLabel).addComponent(fromTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(doLabel).addComponent(toTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(43).addComponent(rezerwjButton).addContainerGap()));
		setLayout(groupLayout);
	}

	private class RezerwjButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			//TODO potrzebna jeszcze walidacja i komunikaty
			Event event = new Event();

			String name = nameTextField.getText().trim();
			event.setName(name);

			int roomNo = (int) comboBox.getSelectedItem();
			RoomEquipment room = roomHandle.getRoomForNo(roomNo);

			if (room != null) {
				event.setRoomId(room.getRoom().getRoomId());
			}
			Date startDate = dateChooser.getDate();
			Date fromTime = (Date) fromTimeSpinner.getValue();
			startDate = buildDate(startDate, fromTime);
			event.setStartDate(startDate);


			Date endDate = dateChooser.getDate();
			Date toTime = (Date) toTimeSpinner.getValue();
			endDate = buildDate(endDate, toTime);
			event.setStartDate(endDate);

			if (!Program.testMode) {
				AdminEventControler control = new AdminEventControler();
				control.sendEvent(event);
			}

			//TODO komunikat o wyslaniu zgloszenia

		}

		private Date buildDate(Date date, Date time) {
			GregorianCalendar timeCalendar = new GregorianCalendar();
			timeCalendar.setTime(time);

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.set(Calendar.HOUR_OF_DAY, timeCalendar.get(Calendar.HOUR_OF_DAY));
			calendar.set(Calendar.MINUTE, timeCalendar.get(Calendar.MINUTE));
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);

			return calendar.getTime();
		}
	}
}
