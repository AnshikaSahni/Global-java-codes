
import java.util.Iterator;
import java.util.LinkedList;


class Employee1
{
	int empId;
	String empName;
	String email;
	String gender;
    float salary;
	
	public Employee1(int EmpId, String EmpName, String Email, String Gender, float Salary) {
		super();
		empId=EmpId ;
		empName=EmpName ;
	    email=Email ;
		gender=Gender;
		salary = Salary;
	}
    void getEmployeeDetails()
    { 
       System.out.println("EmpId:" + empId +" "+ "EmpName:" + empName + " "+ "EmpEmail:" + email 
				+ " "+"EmpGender:" + gender + " "+"EmpSalary:" + salary);
    	
    }
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
class EmployeeDB1
{
    
	LinkedList<Employee>List= new LinkedList<>();
	public boolean addEmployee(Employee e) {
		return List.add(e);
	}
	public boolean deleteEmployee(int empId) {
        boolean R = false;
		
		Iterator<Employee> it = List.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				R = true;
				it.remove();
			}
		}
		
		return R;
	}
	public String showPaySlip(int empId) {
		String Slip = "Invalid id";
		
		for (Employee e : List) {
			if (e.getEmpId() == empId) {
				Slip = "Pay slip for employee id " + empId + " is " +
						e.getSalary();
			}
		}

		return Slip;
	}
	
	
}

public class TestEmployeeUsingLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(76, "Anshika", "anshika@global", "female", 2000);
		EmployeeDB d= new EmployeeDB();
	    e.getEmployeeDetails();
	    System.out.println(d.addEmployee(e));
	    System.out.println(d.showPaySlip(86));
	    
	    
	    
		
		

	}

}
