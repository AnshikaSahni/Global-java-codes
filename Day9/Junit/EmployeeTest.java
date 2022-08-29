import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
//Testing Application
class EmployeeTest {

	@Test
	void test() {
		ArrayList<String>employees= new ArrayList<>();
		employees.add("anshika");
		employees.add("jitin");
		employees.add("sahni");
		
		Employee e= new Employee();
		String s= e.findName(employees, "jitin");
		assertEquals("FOUND",s);
		
	}

}
