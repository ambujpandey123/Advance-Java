package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class student {
	static Connection conn;
	
    public static void main(String[] args) throws SQLException {
    	ConnectDB();
//    	int i=insert(108,"Raja","Maharastra");
    	display();
    	 
    }
    
    
    public static void ConnectDB() {
        String url = "jdbc:mysql://localhost:3306/test";  
        String user = "root";
        String password = "";  
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");

             conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL");
//            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
     
    public static int insert(int rollno,String name,String address) throws SQLException {
    	
       String sql = "INSERT INTO student (rollno, name, address) VALUES ("+rollno+",'"+name+"','"+address+"')" ;
//    	conn.beginRequest();
    	Statement stmt = conn.createStatement();
    	int q= stmt.executeUpdate(sql);
    	return q;
//    	 conn.close();
    }
    public static void display() throws SQLException {
    	Statement stmt = conn.createStatement();
        
    	
        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

        while (rs.next()) {
            System.out.println("RollNo: " + rs.getInt("rollno") +
                               ", Name: " + rs.getString("name")+
                               ", Address: " + rs.getString("address") );
        }
    }
    
}
