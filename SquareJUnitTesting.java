package testing;

import static org.junit.Assert.*;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);

	}
}