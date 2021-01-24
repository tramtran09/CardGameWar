package FinalJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private String[] suitsString = {"Clubs", "Diamonds", "Hearts", "Spades"};
	List<Card> cards = new ArrayList<Card>();

	public Deck() {

		for (int i = 2; i < 15; i++) {
			for (String suit : suitsString) {
				cards.add(new Card(i, suit));
			}
		} 
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(cards.size() - 1); // not 0
	}

}	
