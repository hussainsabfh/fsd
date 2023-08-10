import java.sql.*;

public class Week13 {
	public static void main(String arg[])
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/branch","root","");
			Statement sm = con.createStatement();
			ResultSet rs = sm.executeQuery("select * from students");
			int rno;
			String name;
                        System.out.println("Rno Name");
			while (rs.next()) 
                        {
				rno = rs.getInt("rno");
				name = rs.getString("name").trim();
				System.out.println(rno +"   "+name);
			}
		   }
		catch (Exception exception) {
			System.out.println(exception);
		}
	}
}