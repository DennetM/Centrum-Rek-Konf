package gui.frame;

import gui.panel.ReservationRoomPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Program;

/**
 * 
 * Klasa g³ownego okna programu
 * 
 */
@SuppressWarnings("serial")
public class ApplicationFrame extends JFrame {

	private JPanel contentPane;
	private ReservationRoomPanel roomPanel;
	private JMenuBar menuBar;
	private JMenu programMenu;
	private JMenuItem exitMenuItem;


	/**
	 * Create the frame.
	 */
	public ApplicationFrame() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(ApplicationFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 0, 1024, 728);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		programMenu = new JMenu("Program");
		menuBar.add(programMenu);
		
		exitMenuItem = new JMenuItem("Wyj\u015Bcie");
		exitMenuItem.addActionListener(new ExitMenuItemActionListener());
		programMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		roomPanel = new ReservationRoomPanel(Program.isAdmin());
		contentPane.add(roomPanel, BorderLayout.CENTER);
	}

	private class ExitMenuItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	}
}
