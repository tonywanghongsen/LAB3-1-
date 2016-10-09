package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerBase.Card;
import pokerBase.Hand;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class HandTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		

	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestRoyalFlush() {
		Hand h = new Hand();
		ArrayList<Card> RoyalFalsh= new ArrayList<Card>();
		RoyalFalsh.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		RoyalFalsh.add(new Card(eSuit.CLUBS, eRank.JACK,1));
		RoyalFalsh.add(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		RoyalFalsh.add(new Card(eSuit.CLUBS, eRank.KING,1));
		RoyalFalsh.add(new Card(eSuit.CLUBS, eRank.ACE,1));
		h.EvaulateHand();
		
	


	}
	@Test
	public void StraightFlush() {
		Hand h = new Hand();
		ArrayList<Card> StraightFlush= new ArrayList<Card>();
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.JACK,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.KING,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.NINE,1));
		h.EvaulateHand();

	}
	
	
	
	@Test
	public void TestFourOfAKind() {
		Hand h = new Hand();
		ArrayList<Card> StraightFlush= new ArrayList<Card>();
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN,1));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.ACE,1));
		h.EvaulateHand();
		

	

	}

}
