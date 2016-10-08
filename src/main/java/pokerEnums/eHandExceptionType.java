package pokerEnums;

public enum eHandExceptionType {

	ShortHand {
		public String toString() {
			return "Hand does not have right amount of cards.";
		}
	}

}
