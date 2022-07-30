package anshi;
public class TestEmployee
{
	public static void main(String[]args)
	{
		 Employee E= new Employee();
		 E.setMembername("anshika");
		 E.setAnnualSalary(20000);
		 E.setYear(2022);
		 E.setNumber(001);
		 E.getAnnualSalary();
		 E.getMembername();
		 System.out.println( E.getAnnualSalary());
		 System.out.println( E.getMembername());
		 System.out.println( E.getNumber());
		 System.out.println(E.getYear()); 
		  
	}
	 
}