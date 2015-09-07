import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleSumTest extends SimpleSum {

	@Test
	public void test() {
		int result = sum (2, 2);
		assertTrue(result != 4);
	}

}
