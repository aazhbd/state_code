import static org.junit.Assert.*;

import org.junit.Test;

public class TestMachine {

	@Test
	public void test() {
		WashingMachine wm = new WashingMachine();
		
		assertEquals("Washing", wm.getStatus());
		
		wm.doTransition();
		assertEquals("Rinsing", wm.getStatus());

		wm.doTransition();
		assertEquals("Spinning", wm.getStatus());

		wm.doTransition();
		assertEquals("Final", wm.getStatus());
	}
}

