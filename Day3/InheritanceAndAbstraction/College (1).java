/* 7) Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
Create a class called College Student that inherits from Student class. This class will have collegeName,
the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.*/

 class Person {

	String name;
	String dateofBirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

}
class Teacher extends Person
{ 
	int salary;
	String subject;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
class Student extends Person
{
	int studentId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
public class College extends Student
{
	String collegename;
	int year;
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public  static void main(String[] args)
	{
		College c= new College();
		c.setCollegename("SRMU");
		c.setDateofBirth("15/07/2022");
		c.setName("anshika");
		c.setStudentId(076);
		c.setYear(4);
		System.out.println(c.getCollegename());
		System.out.println(c.getDateofBirth());
		System.out.println(c.getName());
		System.out.println(c.getStudentId());
		System.out.println(c.getYear());
	}
	
	
}