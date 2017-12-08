package testing;

import static org.junit.Assert.*;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA(alphabet);
		assertEquals(2, output);

	}
}