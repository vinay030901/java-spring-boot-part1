package day8_JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {

	public int m1;
	public int m2;

	public ParameterTest(int m1, int m2) {
		this.m1 = m1;
		this.m2 = m2;
	}

	@Parameters
	public static Collection<Object[]> userData() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 121, 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMulti() {
		Calculator c = new Calculator();
		assertEquals(m1 * m2, c.multiply(m1, m2));
	}

//	@Test(timeout=1000)
////	@Timeout(unit = TimeUnit.MILLISECONDS, value = 1000)
//	public void testAdd() {
//		try {
//			Thread.sleep(2000);
//			Calculator c = new Calculator();
//			assertEquals(m1 + m2, c.calculate(m1, m2));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//		}
//		
//	}
}
