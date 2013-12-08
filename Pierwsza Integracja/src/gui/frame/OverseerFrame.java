package gui.frame;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import javax.swing.JFrame;
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
				.addGap(0, 164, Short.MAX_VALUE)
				.addComponent(przycisk_anuluj, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(lista_rozwijana_nadzorcow, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 42, Short.MAX_VALUE)
				.addComponent(przycisk_anuluj, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
				.addContainerGap());
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
	public void dispose() {
		super.dispose();
	}

}
