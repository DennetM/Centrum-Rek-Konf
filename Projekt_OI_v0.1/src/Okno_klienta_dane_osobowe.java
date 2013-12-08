import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Okno_klienta_dane_osobowe extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;
	private JLabel napis_imie;
	private JLabel napis_nazwisko;
	private JLabel napis_telefon;
	private AbstractAction akcja_zatwierdz;
	private AbstractAction akcja_anuluj;
	private JButton przycisk;
	private JButton przycisk_zatwierdz;
	private JTextField tekst_email;
	private JTextField tekst_telefon;
	private JTextField tekst_nazwisko;
	private JTextField tekst_imie;
	private JLabel napis_email;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Okno_klienta_dane_osobowe inst = new Okno_klienta_dane_osobowe(frame);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Okno_klienta_dane_osobowe(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			{
				napis_imie = new JLabel();
				napis_imie.setText("Imi\u0119:");
			}
			{
				napis_nazwisko = new JLabel();
				napis_nazwisko.setText("Nazwisko:");
			}
			{
				napis_telefon = new JLabel();
				napis_telefon.setText("Telefon:");
			}
			{
				napis_email = new JLabel();
				napis_email.setText("Email:");
			}
			{
				tekst_imie = new JTextField();
			}
			{
				tekst_nazwisko = new JTextField();
			}
			{
				tekst_telefon = new JTextField();
			}
			{
				tekst_email = new JTextField();
			}
			{
				przycisk_zatwierdz = new JButton();
				przycisk_zatwierdz.setText("Zatwierd\u017a");
				przycisk_zatwierdz.setAction(getAkcja_zatwierdz());
			}
			{
				przycisk = new JButton();
				przycisk.setText("Anuluj");
				przycisk.setAction(getAkcja_anuluj());
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(37, 37)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(tekst_imie, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(napis_imie, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(tekst_nazwisko, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(napis_nazwisko, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(17)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(tekst_telefon, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(napis_telefon, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(tekst_email, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(napis_email, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(39)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(przycisk_zatwierdz, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				    .addComponent(przycisk, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(napis_imie, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 43, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(napis_nazwisko, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 43, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(napis_telefon, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 43, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(napis_email, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 43, Short.MAX_VALUE))
				    .addComponent(przycisk_zatwierdz, GroupLayout.Alignment.LEADING, 0, 121, Short.MAX_VALUE))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(tekst_imie, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(77))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(tekst_nazwisko, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(77))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(tekst_telefon, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(77))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(tekst_email, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(77))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(112)
				        .addComponent(przycisk, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(31, 31));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {napis_email, napis_telefon, napis_nazwisko, napis_imie});
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private AbstractAction getAkcja_anuluj() {
		if(akcja_anuluj == null) {
			akcja_anuluj = new AbstractAction("Anuluj", null) {
				private static final long serialVersionUID = 1L;

				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			};
		}
		return akcja_anuluj;
	}
	
	private AbstractAction getAkcja_zatwierdz() {
		if(akcja_zatwierdz == null) {
			akcja_zatwierdz = new AbstractAction("Zatwierd\u017a", null) {
				private static final long serialVersionUID = 1L;

				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			};
		}
		return akcja_zatwierdz;
	}

}
