//Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
//Display the columns ename, job, sal and comm.

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayCondition{

 public static void main(String[] args) throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anshika", "root", "root");

 Statement st=con.createStatement();

 String query="select * from emp where sal>1000 and sal<2000 ";

 ResultSet rs=st.executeQuery(query);
 while(rs.next())
 { 
	 
     System.out.println("ename: " + rs.getString("ename")+ ", job: " + rs.getString("job")+", salary: "+rs.getDouble("sal")+",comm:"+rs.getDouble("comm"));
	 
 }
 st.close();
 

 }

}
