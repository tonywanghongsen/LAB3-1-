package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;

public class Deck {

    private ArrayList<Card> deckCards = new ArrayList<Card>();

    public Deck() {
        int iCardNbr = 1;
        for (eSuit eSuit : eSuit.values()) {
            for (eRank eRank : eRank.values()) {
            
                if (eSuit != eSuit.JOKER) 
                {
                    deckCards.add(new Card(eSuit, eRank, iCardNbr++));
                }
            }
             
        }
        Collections.shuffle(deckCards);
    }
    
    public ArrayList<Card> getDeck(){
    	return deckCards;
    }
    public Deck(int NbrOfJokers) {

        
        this();
        int size = deckCards.size() + 1;
        for (int i=0; i<NbrOfJokers; i++){
            Card joker =new Card(eSuit.JOKER, eRank.JOKER, size++);
            deckCards.add(joker);
        }
        Collections.shuffle(deckCards);
    }
    
    
    public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {

        this(NbrOfJokers);
        for(Card wild : Wilds){
            if (deckCards.contains(wild)){
                int index = deckCards.indexOf(wild);
                deckCards.get(index).setbWild(true);
                
            }
        }
        
    }
    public Card Draw() throws DeckException {
        
        if (deckCards.size() == 0){
            throw new DeckException(this);
        }
        return deckCards.remove(0);
    }
}