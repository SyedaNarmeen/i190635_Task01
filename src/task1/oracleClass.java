package task1;
import java.sql.*;

public class oracleClass {

	public void insert(String customerName, String address,  int contact, int accountId, int accountType, double bal) throws SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			Connection con=DriverManager.getConnection(url,"root","lokithor");
			Statement statemnt=con.createStatement();
            String q="insert into account customer Name,address,date created, contact, accountId, account Type, balance, and fees)" + " values ('"+customerName+"','"+address+"','"+contact+"','"+accountId+"','"+accountType+"','"+bal+"')";
			
			statemnt.executeUpdate(q);
			con.close();
		}catch(ClassNotFoundException e) {
			System.out.println("Driver couldn't be loaded");
		}
	}
}
