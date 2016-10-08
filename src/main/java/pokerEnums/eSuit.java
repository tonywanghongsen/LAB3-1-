package pokerEnums;

public enum eSuit {

	HEARTS(1), SPADES(2), CLUBS(3), DIAMONDS(4), JOKER(99);
	//TODO - Lab 3 Add Joker(99) as a new suit
	//I added Joker(99) as a new eSuit
	
	private int iSuitNbr;

	private eSuit(int iSuitNbr) {
		this.iSuitNbr = iSuitNbr;
	}

	public int getiSuitNbr() {
		return iSuitNbr;
	}
	
	
}
