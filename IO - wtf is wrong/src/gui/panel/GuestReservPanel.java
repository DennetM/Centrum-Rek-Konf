package gui.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

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
import POJO.Guest;

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
	private JLabel imieLabel;
	private JLabel nazwiskoLabel;
	private JLabel telefonLabel;
	private JLabel emailLabel;
	private JTextField imieTextField;
	private JTextField nazwiskoTextField;
	private JTextField telefonTextField;
	private JTextField emailTextField;

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
			model.addElement(rv.getRoom().getRoomNumber());
		}
		comboBox.setModel(model);

	}

	private void initialize() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setPreferredSize(new Dimension(734, 400));

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

		imieLabel = new JLabel("Imie:");
		imieTextField = new JTextField();
		
		nazwiskoLabel = new JLabel("Nazwisko:");
		nazwiskoTextField = new JTextField();
		//nazwiskoTextField.setColumns(10);
		
		telefonLabel = new JLabel("Telefon:");
		telefonTextField = new JTextField();
		
		emailLabel = new JLabel("Email:");
		emailTextField = new JTextField();

		salaLabel = new JLabel("Sala");

		comboBox = new JComboBox<Integer>();


		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(zgoszeniaLabel)
				.addGap(1))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(rezerwjButton, 0, 150, 150)
				.addGap(1))
				.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(czasRezerwacjiLabel)
				.addPreferredGap(ComponentPlacement.RELATED, 168, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
				.addGap(22)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(godzinaOdLabel).addComponent(dzieLabel))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(fromTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(doLabel)
				.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(imieLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nazwiskoLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(telefonLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(emailLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
				.addPreferredGap(ComponentPlacement.RELATED, 122, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(477, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(imieTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(nazwiskoTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(telefonTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(salaLabel)
				.addContainerGap(674, Short.MAX_VALUE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(zgoszeniaLabel)
				.addGap(1)
						.addComponent(salaLabel)
				.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addComponent(imieLabel).addGap(5)
						.addComponent(imieTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addComponent(nazwiskoLabel).addGap(5)
						.addComponent(nazwiskoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addComponent(telefonLabel).addGap(5)
						.addComponent(telefonTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
						.addComponent(emailLabel).addGap(5)
						.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(czasRezerwacjiLabel)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(dzieLabel).addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(godzinaOdLabel)
						.addComponent(fromTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(doLabel)
						.addComponent(toTimeSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(1)
						.addComponent(rezerwjButton)
				.addContainerGap()));
		setLayout(groupLayout);
	}

	private class RezerwjButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			//TODO potrzebna jeszcze walidacja i komunikaty
			List<Guest> result = new ArrayList<>();
			List<Event> result2 = new ArrayList<>();
			Event event = new Event();
			Guest guest = new Guest();
			
			String imie = imieTextField.getText().trim();
			guest.setName(imie);
			String nazwisko = nazwiskoTextField.getText().trim();
			guest.setSurname(nazwisko);
			event.setName(nazwisko);
			String telefon = telefonTextField.getText().trim();
			guest.setTelephoneNumber(telefon);
			String email = emailTextField.getText().trim();
			guest.setEmail(email);
			result.add(guest);
			
			
			
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
