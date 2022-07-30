import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void test() {
		Demo2 d= new Demo2();
		boolean b= d.Pallindrome("jitin");
		assertEquals(false,b);
	}

}
