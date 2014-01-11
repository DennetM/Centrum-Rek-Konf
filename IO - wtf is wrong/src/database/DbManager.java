package database;

import java.sql.SQLException;

import POJO.Administrator;
import POJO.Equipment;
import POJO.Event;
import POJO.Guest;
import POJO.Personnel;
import POJO.Room;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;


public class DbManager  {

	// Proper db address should be placed here.
	private final String DATABASE_URL = "jdbc:sqlserver://localhost:1434;databaseName=IO;integratedSecurity=true;";
	
	private ConnectionSource connectionSource;
	
	public Dao<Administrator,Integer> administratorDao;
	public Dao<Equipment,Integer> equipmentDao;
	public Dao<Event,Integer> eventDao;
	public Dao<Guest,Integer> guestDao;
	public Dao<Personnel,Integer> personnelDao;
	public Dao<Room,Integer> roomDao;
	
	public DbManager() throws SQLException
	{
		connectionSource = new JdbcConnectionSource(DATABASE_URL);
		administratorDao = DaoManager.createDao(connectionSource, Administrator.class);
		equipmentDao = DaoManager.createDao(connectionSource, Equipment.class);
		eventDao = DaoManager.createDao(connectionSource, Event.class);
		guestDao = DaoManager.createDao(connectionSource, Guest.class);
		personnelDao = DaoManager.createDao(connectionSource, Personnel.class);
		roomDao = DaoManager.createDao(connectionSource, Room.class);
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		connectionSource.close();		
		super.finalize();
		
	}
}
