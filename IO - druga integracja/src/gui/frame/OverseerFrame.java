package gui.frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class OverseerFrame extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;
	private JComboBox lista_rozwijana_nadzorcow;
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private AbstractAction akcja_akceptuj;
	private JCheckBox jCheckBox3;
	private JButton przycisk_akceptuj;
	private AbstractAction akcja_anuluj;
	private JButton przycisk_anuluj;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				OverseerFrame inst = new OverseerFrame(frame);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public OverseerFrame(JFrame frame) {
		super(frame);
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			{
				ComboBoxModel lista_rozwijana_nadzorcowModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
				////////////////////////////////////////////////////////////////
				//W tym miejscu automatycznie wygenerowaly sie 2 stringi
				//Chyba tutaj powinna znajdowac sie funkcja wybierajaca pracownikow
				////////////////////////////////////////////////////////////////
				lista_rozwijana_nadzorcowModel.setSelectedItem("Nadzorca");
				lista_rozwijana_nadzorcow = new JComboBox();
				lista_rozwijana_nadzorcow.setModel(lista_rozwijana_nadzorcowModel);
			}
			{
				przycisk_anuluj = new JButton();
				przycisk_anuluj.setText("Anuluj");
				przycisk_anuluj.setAction(getAkcja_anuluj());
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(34, 34)
				.addComponent(lista_rozwijana_nadzorcow, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(81)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(przycisk_anuluj, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getPrzycisk_akceptuj(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(21, 21));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(getPrzycisk_akceptuj(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
				        .addGap(103))
				    .addComponent(lista_rozwijana_nadzorcow, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 42, Short.MAX_VALUE)
				        .addComponent(przycisk_anuluj, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap());
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {przycisk_anuluj, getPrzycisk_akceptuj()});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {przycisk_anuluj, getPrzycisk_akceptuj()});
			setSize(350, 200);
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
	public void dispose() {
		super.dispose();
	}
	
	private JButton getPrzycisk_akceptuj() {
		if(przycisk_akceptuj == null) {
			przycisk_akceptuj = new JButton();
			przycisk_akceptuj.setText("Akceptuj");
			przycisk_akceptuj.setAction(getAkcja_akceptuj());
		}
		return przycisk_akceptuj;
	}
	
	
	private AbstractAction getAkcja_akceptuj() {
		if(akcja_akceptuj == null) {
			akcja_akceptuj = new AbstractAction("Akceptuj", null) {
				public void actionPerformed(ActionEvent evt) {
					//Funkcje po akceptacji. Na ten czas dodaje tylko zamykanie okna
					dispose();
				}
			};
		}
		return akcja_akceptuj;
	}

}
