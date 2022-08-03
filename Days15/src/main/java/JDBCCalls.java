

/*Develop a jdbc program containing the main method, which should instantiate a class called DAOClass, which should contain methods called insert, delete, modify and display. Description of what each of these methods are expected to do is given below. Necessary details required for executing these methods are passed from command line argument. For e.g. If the name of the class containing the main method is JDBCCalls, then if you want to insert a record, you will execute this class as java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000

Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. The structure of the student table is given below. Similarly, for deleting a record, you have to execute the code as java JDBCCalls 2 101 where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.
For modifying a record, you will use java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.

For Displaying records, if the main class is executed as follows java JDBCCalls 4 101 it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record.

If the main class is executed as java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students should be displayed.
*/
import java.sql.SQLException;
public class JDBCCalls {
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.print("Enter your choice : ");
		int i= Integer.parseInt(args[0]);
		System.out.print(i+"\n");
		switch(i)
		{
		    case 1:
		    	int rollno = Integer.parseInt(args[1]);
				String name = args[2];
				String std = args[3];
				String dob = args[4];
				double amt = Double.parseDouble(args[5]);
				if(DAO.insert(rollno, name, std, dob, amt)) {
					System.out.println(" Row Inserted");
				}
				
				else {
					System.out.println("Insertion not take place");
				}
				break;
		    case 2:
		    	rollno=Integer.parseInt(args[1]);
		    	
		    	if(DAO.delete(rollno))
		    	{
		    		System.out.println("Record with rollno" +rollno+"   deleted");
		    	}
		    	else
		    	{
		    		 System.out.println("Deletion not take place");
		    	}
		    	break;
		    case 3:
		    	rollno = Integer.parseInt(args[1]);
				amt = Double.parseDouble(args[2]);
				
				if(DAO.modify(rollno, amt)) {
					System.out.println("Record updated");
				}
				else {
					System.out.println("Updation not take place");
				}
				break;
				
		    case 4:
		    	rollno=Integer.parseInt(args[1]);
		    	if(DAO.display(rollno))
		    	{
		    		System.out.println();
		    		System.out.println("Records of Student with  Rollno:"+ rollno+"   is displayed");
		    	}
		    	else
		    	{
		    		System.out.println("Invalid rollno records not displayed");
		    	}
		    	break;
		    case 5:
		    	if(DAO.displayAll()) {
					System.out.println();
					System.out.println("All records displayed...");
				}
				else {
					System.out.println("Displaying of records not possible");
				}
				break;
		    default :
				System.out.println("Wrong Choice!!");
				break;
		    	
		}

	}

}
