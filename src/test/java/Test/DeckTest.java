package Test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerBase.Card;
import pokerBase.Deck;
import pokerExceptions.DeckException;

public class DeckTest extends Deck{
	@BeforeClass
	public static void SetUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void TearDownAfterClass() throws Exception {
	}

	@Before
	public void SetUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DeckMyTest()
	{
		Deck d = new Deck();
		assertEquals(d.getDeck(), 52);
		fail("You need to implement");
	}
	@Test
	public void Test_Draw() throws DeckException{
		
		//Tests Draw Card Function
		Deck d = new Deck();
		assertEquals(d.Draw(), 52);
	}

}
