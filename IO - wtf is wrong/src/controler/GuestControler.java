package controler;

import java.sql.SQLException;

import POJO.Guest;

public class GuestControler extends BaseControler {

	public GuestControler() {
		super();
	}

	public Guest getGuest(int guestID) {
		Guest result = null;
		try {
			if (dbManager.eventDao.idExists(guestID)) {
				result = dbManager.guestDao.queryForId(guestID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public void cancelGuest(Guest guest) {

		try {
			dbManager.guestDao.update(guest);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendGuest(Guest guest) {
		try {
			dbManager.guestDao.create(guest);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getGuestId(Guest guest) {
		int result = 0;
		try {
				result = dbManager.guestDao.extractId(guest);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
}
