package controler;

import java.sql.SQLException;

import database.DbManager;

/**
 * 
 * Bazowa klasa controlera oerujacego na zapytaniach do bazy
 * 
 */
public class BaseControler {

	protected DbManager dbManager;

	public BaseControler() {
		try {
			dbManager = new DbManager();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

}
