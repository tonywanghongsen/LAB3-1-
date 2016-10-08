package pokerExceptions;

import pokerBase.Deck;

public class DeckException extends Exception {

		private Deck deck;
		public DeckException(Deck D){
				this.deck= D;
		}
		public Deck getDeck(){
				return deck;
		}
}
