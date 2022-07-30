import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void test() {
		Demo1 D= new Demo1();
		String s3=D.StringConcat("anshi", "jitu");
		assertEquals("anshijitu",s3);
	}

}
