package main;

import gui.frame.ApplicationFrame;

import java.awt.EventQueue;

import javax.swing.UIManager;

public class Program {

	private static boolean admin = true;

	public static boolean testMode = true;

	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ApplicationFrame frame = new ApplicationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static boolean isAdmin() {
		return admin;
	}

	public static void setAdmin(boolean admin) {
		Program.admin = admin;
	}

}
