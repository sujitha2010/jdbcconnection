package jdbcpractise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConnection {
	public static void main(String[] args) throws Exception {
		   String url = "jdbc:mysql:///knowprogram";
	       String user = "root";
	       String password = "Sujiavs@2010";
	      String query ="select name from person where id=102";
	      
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("name");
        System.out.println(name);
        st.close();
        con.close();
	}
}
