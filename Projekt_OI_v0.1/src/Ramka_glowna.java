import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;



public class Ramka_glowna extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JButton przycisk_okno_1_klient;
	private AbstractAction akcja_klient;
	private AbstractAction akcja_otworz_okno_logowania_admina;
	private JLabel napis_okno_1_Witamy;
	private JButton przycisk_okno_1_admin;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Ramka_glowna inst = new Ramka_glowna();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Ramka_glowna() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				przycisk_okno_1_klient = new JButton();
				przycisk_okno_1_klient.setText("Klient");
				przycisk_okno_1_klient.setAction(getAkcja_klient());
			}
			{
				przycisk_okno_1_admin = new JButton();
				przycisk_okno_1_admin.setText("Administrator");
				przycisk_okno_1_admin.setAction(getAkcja_otworz_okno_logowania_admina());
			}
			{
				napis_okno_1_Witamy = new JLabel();
				napis_okno_1_Witamy.setText("Witamy. Prosz\u0119 wybra\u0107 sposób korzystania z aplikacji.");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(napis_okno_1_Witamy, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(27)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(przycisk_okno_1_klient, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				    .addComponent(przycisk_okno_1_admin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(33, 33));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(35, 35)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(przycisk_okno_1_klient, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(72)
				        .addComponent(przycisk_okno_1_admin, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(24)
				        .addComponent(napis_okno_1_Witamy, 0, 324, Short.MAX_VALUE)
				        .addGap(10)))
				.addContainerGap(32, 32));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {przycisk_okno_1_klient, przycisk_okno_1_admin});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {przycisk_okno_1_klient, przycisk_okno_1_admin});
			pack();
			this.setSize(441, 201);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private AbstractAction getAkcja_otworz_okno_logowania_admina() {
		if(akcja_otworz_okno_logowania_admina == null) {
			akcja_otworz_okno_logowania_admina = new AbstractAction("Administrator", null) {
				private static final long serialVersionUID = 1L;

				public void actionPerformed(ActionEvent evt) {
					Okno_logowania_admina.main(null);
				}
			};
		}
		return akcja_otworz_okno_logowania_admina;
	}
	
	private AbstractAction getAkcja_klient() {
		if(akcja_klient == null) {
			akcja_klient = new AbstractAction("Klient", null) {
				private static final long serialVersionUID = 1L;

				public void actionPerformed(ActionEvent evt) {
					
					//Tutaj powinna znajdowac sie funkcja wyswietlajaca okno kilenta robiona grupy drugiej
					
					//na chwile obecna umieszczam w calach testowych funkcje otwierajaca okno danych osobowych klienta
					
					/////////////////////////////////////////////////////////////
					Okno_klienta_dane_osobowe.main(null);
					/////////////////////////////////////////////////////////////
				}
			};
		}
		return akcja_klient;
	}

}
