package database;
import java.sql.SQLException;
import POJO.Administrator;


public class Startup {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	 public static void main(String[] args) throws SQLException {
	
	 DbManager manager = new DbManager();
	
	 Administrator admin = new Administrator();
	 admin.setEmail("test@niepodam.pl");
	 admin.setName("Admin");
	 admin.setSurname("Olek");
	 admin.setPassword("12345");
	 admin.setPhoneNumber("12-12-12-12");
	
	 int id = manager.administratorDao.create(admin);
	
	 Administrator admin2 = manager.administratorDao.queryForId(id);
	 System.out.println(admin2.getName());
	 }

}
