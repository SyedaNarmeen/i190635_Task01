package task1;
import java.sql.*;

public class sqlClass {
	public void insert(String customerName, String address,  int contact, int accountId, int accountType, double bal){
		try {
		//	String url="jdbc:mysql://localhost:3306/db";
			Class.forName("com.mysql.cj.jdbc.Driver");

		//	Connection con=DriverManager.getConnection(url,"root","password");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","9597");
			
			Statement statemnt=con.createStatement();
		
			String q="insert into account customer Name,address,date created, contact, accountId, account Type, balance, and fees)" + " values ('"+customerName+"','"+address+"','"+contact+"','"+accountId+"','"+accountType+"','"+bal+"')";
			
			statemnt.executeUpdate(q);
			con.close();
		   }
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
