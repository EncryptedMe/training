import java.sql.*;
public class user {

	public static void main(String[] args) throws Exception {
		try{// TODO Auto-generated method stub
		String query= "Select * from info;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Mysql19.");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		
		st.close();
		con.close();
		}
		
		catch (SQLException e){}
		//System.out.print("0");
	}

}
