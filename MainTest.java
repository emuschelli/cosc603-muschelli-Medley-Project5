package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MainTest</code> contains tests for the class <code>{@link Main}</code>.
 *
 * @generatedBy CodePro at 4/19/16 11:15 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class MainTest {
	
		
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testMain_1_CheckOptions()
		throws Exception {
		String[] args = new String[] {};

		Main.main(args);

		// add additional test code here
	}

	/**
	 * Run the void mainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testMainMenu_1()
		throws Exception {

		Main.mainMenu();

		// add additional test code here
	}


	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MainTest.class);
	}
}
