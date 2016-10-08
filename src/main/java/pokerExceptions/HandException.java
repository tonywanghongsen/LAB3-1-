package pokerExceptions;

import pokerBase.Hand;

public class HandException extends Exception {

	private Hand h;

	public HandException( Hand h, String strMessage) {
		super(strMessage);
		this.h = h;
	}

	public Hand getH() {
		return h;
	}
	
	
}
