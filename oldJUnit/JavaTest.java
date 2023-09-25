package oldJUnit;

/*
 * If this was a typical test case,it would be invoking methods of the class to be tested.
 */

import junit.framework.TestCase;

public class JavaTest extends TestCase {
	protected ClassToBeTested testee;

	// assigning the values.  Creating the "fixture"
	protected void setUp(){
		testee = new ClassToBeTested(3, 3);
	}

	// test method to add two values
	public void testAdd(){
		assertTrue("Testing addition", testee.add() == 6);
	}
	
	public void testBogusAdd(){
		assertEquals("Bogus test; ", 5, testee.add());
	}

}