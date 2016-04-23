package edu.towson.cis.cosc603.project5.coffeemaker;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 4/19/16 11:15 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	
	//private CoffeeMaker cm;
	
	CoffeeMaker myCoffeeMaker = new CoffeeMaker();
	Recipe myRecipe = new Recipe();
	Inventory myInventory = new Inventory();
		
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Before
	public void setUp(){
		myInventory.setCoffee(0);
		myInventory.setMilk(0);
		myInventory.setSugar(0);
		myInventory.setChocolate(0);
		// add additional set up code here
	}
	
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15%nMilk: 15%nSugar: 15%nChocolate: 15%n", result.toString());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 * This method tests to see if there is enough coffee inventory
	 * to make for the recipe.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testEnoughIngredients_NotEnoughCoffee()
		throws Exception {

		//Inventory fixture = new Inventory();
		//Recipe r = new Recipe();
		myRecipe.setAmtCoffee(3);
		//should go into if(Inventory.coffee < r.getAmtCoffee())
		myInventory.setCoffee(1);
		boolean result = myInventory.enoughIngredients(myRecipe);
				
		//myInventory.setChocolate(10);
		//myRecipe.setAmtChocolate(1);
		//assertNotSame(3, myInventory.getChocolate());
		// add additional test code here
		assertEquals(false, result);
	}
	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 * This method tests to see if there is enough coffee inventory
	 * to make for the recipe.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testEnoughIngredients_NegCoffee()
		throws Exception {

		//Inventory fixture = new Inventory();
		//Recipe r = new Recipe();
		myRecipe.setAmtCoffee(3);
		//should go into if(Inventory.coffee < r.getAmtCoffee())
		myInventory.setCoffee(-1);
		boolean result = myInventory.enoughIngredients(myRecipe);
				
		//myInventory.setChocolate(10);
		//myRecipe.setAmtChocolate(1);
		//assertNotSame(3, myInventory.getChocolate());
		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertNotSame(10, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		fixture.setCoffee(15);
		fixture.setCoffee(1);
		int result = fixture.getCoffee();

		// add additional test code here
		assertNotSame(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetMilk_1(){
		// add additional test code here
		Inventory fixture = new Inventory();
		assertEquals(15, fixture.getMilk());
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetMilk_2(){
		// add additional test code here
		Inventory fixture = new Inventory();
		fixture.setMilk(0);
		assertEquals(0, fixture.getMilk());
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetMilk_3(){
		// add additional test code here
		Inventory fixture = new Inventory();
		fixture.setMilk(100);
		assertEquals(100, fixture.getMilk());
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetMilk_4(){
		// add additional test code here
		Inventory fixture = new Inventory();
		fixture.setMilk(-1);
		assertEquals(0, fixture.getMilk());
	}



	
	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testGetSugar_1(){
		// add additional test code here
		Inventory fixture = new Inventory();
		fixture.setSugar(-1);
		assertEquals(0, fixture.getSugar());
	}
	
	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetChocolate_NotEnough()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 50;

		fixture.setChocolate(chocolate);
		
		//assertFalse(setChocolate(50));

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();
		fixture.setChocolate(1);
		assertSame(1, fixture.getChocolate());
		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = new Inventory();
		fixture.setChocolate(-1);
		assertSame(0, fixture.getChocolate());

		// add additional test code here
	}
	
	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}
	

	
	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetMilk_1() {		
		
		Inventory fixture = new Inventory();
		
		fixture.setMilk(1);
		assertEquals(1,fixture.getMilk());
		fixture.setMilk(-1);
		assertEquals(0,fixture.getMilk());
		// add additional test code here
	}



	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = -1;

		fixture.setSugar(sugar);
//		assertEquals(0,new Inventory().getSugar());
		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testSetSugar_2(){
		Inventory fixture = new Inventory();
		fixture.setSugar(15);
		//assertEquals(15,fixture.getSugar());

		// add additional test code here
	}

	
	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/16 11:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = new Inventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15%nMilk: 15%nSugar: 15%nChocolate: 15%n", result);
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}