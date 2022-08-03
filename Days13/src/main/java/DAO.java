/*Develop a jdbc program containing the main method, which should instantiate a class called DAOClass, which should contain methods called insert, delete, modify and display. Description of what each of these methods are expected to do is given below. Necessary details required for executing these methods are passed from command line argument. For e.g. If the name of the class containing the main method is JDBCCalls, then if you want to insert a record, you will execute this class as java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000

Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. The structure of the student table is given below. Similarly, for deleting a record, you have to execute the code as java JDBCCalls 2 101 where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.
For modifying a record, you will use java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.

For Displaying records, if the main class is executed as follows java JDBCCalls 4 101 it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record.

If the main class is executed as java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students should be displayed.
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	static Connection con=null;
	static PreparedStatement p=null;
	static {
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
			} 
			 catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 
	}
	public static boolean insert (int rollno,String name,String std,String dob ,double fee)throws SQLException
	{
		String query = "insert into student values(?, ?, ?, ?, ?)";
		  PreparedStatement p= con.prepareStatement(query);
		  p.setInt(1, rollno);
		  p.setString(2, name);
		  p.setString(3, std);
		  p.setString(4, dob);
		  p.setDouble(5, fee);
		  p.executeUpdate();
		  return true;
	}
	public static boolean delete(int rollno)throws SQLException
	{
		
		/*String query= "INSERT INTO studentLog ";
		p = con.prepareStatement(query);
		p.setInt(1, rollno);
		int logged = p.executeUpdate();
		
        query = "delete from student where rollno = ?";
		
		p = con.prepareStatement(query);
		
		p.setInt(1,rollno);
		*/
		
		return true;
	}
	
	public static boolean modify(int rollno, double fee) throws SQLException
	{
		String query = "update student set fee = ? where rollno = ?";
		
		p = con.prepareStatement(query);
		
		p.setDouble(1, fee);
		p.setInt(2,rollno);
		p.executeUpdate();
		
		return true;
	}
   public static boolean display(int rollno)throws SQLException {
		
		String query = "select * from student where rollno = ?";
		
		p = con.prepareStatement(query);
		
		p.setInt(1,rollno);
		ResultSet rs = p.executeQuery();
		
		while(rs.next()) {
			int roll = rs.getInt("RollNo");
			String name = rs.getString("studentname");
			String std = rs.getString("standard");
			String dob = rs.getString("Date_of_Birth");
			double fee = rs.getDouble("fee");
			
			System.out.format("%15s %15s %15s %15s %15s\n", roll, name, std, dob, fee);
		}
		
		return true;
	}
    public static boolean displayAll() throws SQLException{

		String query = "select * from student";
		
		p = con.prepareStatement(query);
		ResultSet rs = p.executeQuery();
		
		while(rs.next()) {
			int roll = rs.getInt("RollNo");
			String name = rs.getString("studentname");
			String std = rs.getString("standard");
			String dob = rs.getString("Date_of_Birth");
			double fee = rs.getDouble("fee");
			
			System.out.format("%15s %15s %15s %15s %15s\n", roll, name, std, dob, fee);
		}
		
		return true;
     }
	
}
