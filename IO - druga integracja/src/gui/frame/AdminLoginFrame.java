package gui.frame;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

import main.Program;


public class AdminLoginFrame extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel napis_haslo;
	private JButton przycisk_zaloguj;
	private AbstractAction akcja_zaloguj;
	private AbstractAction akcja_okno_logowania_admina_anuluj;
	private JButton przycisk_anuluj;
	private JPasswordField tekst_haslo;
	private String haslo;

	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				AdminLoginFrame inst = new AdminLoginFrame(frame);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				
			}
		});
	}
	
	public AdminLoginFrame(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	
	public void dispose() {
		super.dispose();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			{
				napis_haslo = new JLabel();
				napis_haslo.setText("Haslo:");
			}
			{
				tekst_haslo = new JPasswordField();
			}
			{
				przycisk_zaloguj = new JButton();
				przycisk_zaloguj.setText("Zaloguj");
				przycisk_zaloguj.setAction(getAkcja_zaloguj());
			}
			{
				przycisk_anuluj = new JButton();
				przycisk_anuluj.setText("Anuluj");
				przycisk_anuluj.setAction(getAkcja_okno_logowania_admina_anuluj());
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(54, 54)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(tekst_haslo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(napis_haslo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(41)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(przycisk_zaloguj, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(przycisk_anuluj, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(przycisk_zaloguj, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
				        .addGap(25))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(50)
				        .addComponent(napis_haslo, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
				.addGap(38)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(tekst_haslo, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(68)
				        .addComponent(przycisk_anuluj, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(26, Short.MAX_VALUE));
			this.setSize(361, 191);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AbstractAction getAkcja_okno_logowania_admina_anuluj() {
		if(akcja_okno_logowania_admina_anuluj == null) {
			akcja_okno_logowania_admina_anuluj = new AbstractAction("Anuluj", null) {
				private static final long serialVersionUID = 1L;
				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			};
		}
		return akcja_okno_logowania_admina_anuluj;
	}
	
	private AbstractAction getAkcja_zaloguj() {
		if(akcja_zaloguj == null) {
			akcja_zaloguj = new AbstractAction("Zaloguj", null) {
				private static final long serialVersionUID = 1L;
				public void actionPerformed(ActionEvent evt) {
					
					//Tutaj miejsce na wywolanie funkcji otwoerania okna grupy robiacej rowniez interfejs
					//Na ten czas wrzucam kawalem otwierajacy okno ds personelu
					haslo = "";
			        char[] pass = tekst_haslo.getPassword();
			        for(int i=0; i<pass.length; i++) {
			            haslo += pass[i];
			        }
					///////////////////////////////////////////////////
					//Okno_administratora_ds_personelu.main(null);
					//haslo = tekst_haslo.getPassword();
					if (haslo.equals("12345")){
						Program.setAdmin(true);
						Program.main(null);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "B\u0142\u0119dne has\u0142o");
						tekst_haslo.setText("");
					}
					////////////////////////////////////////////////////
					
				}
			};
		}
		return akcja_zaloguj;
	}

}
