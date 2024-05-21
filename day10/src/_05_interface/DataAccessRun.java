package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {

		DataAccess oracle = new Oracle();
		DataAccess mysql = new MySql();
		
		oracle.select();
		oracle.insert();
		oracle.update();
		oracle.delete();
		
		mysql.select();
		mysql.insert();
		mysql.update();
		mysql.delete();
		
		
	}

}
