package pokerBase;

import java.util.ArrayList;

public class HandScore {


	private int HandStrength;
	private int HiHand;
	private int LoHand = 0;
	private ArrayList<Card> Kickers = new ArrayList<Card>();

	
	public HandScore() {}
	
	public HandScore(int handStrength, int hiHand, int loHand, ArrayList<Card> kickers) {
		super();
		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
		Kickers = kickers;
	}

	public int getHandStrength() {
		return HandStrength;
	}

	public void setHandStrength(int handStrength) {
		HandStrength = handStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public ArrayList<Card> getKickers() {
		return Kickers;
	}

	public void setKickers(ArrayList<Card> kickers) {
		Kickers = kickers;
	}


	
	
}
