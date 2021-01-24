package FinalJava;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player Tram = new Player("1");
		Player Calvin = new Player("2");
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				Tram.draw(deck);
			} else {
				Calvin.draw(deck);
			}
				
		}
		
		for(int i = 0; i < 26; i++) {
			Card cardForTram = Tram.flip();
			Card cardForCalvin = Calvin.flip();
			if(cardForTram.getValue() > cardForCalvin.getValue()) {
				Tram.incrementScore();
			} else if (cardForTram.getValue() < cardForCalvin.getValue()){
				Calvin.incrementScore();
			}
			
		}
		
		System.out.println("Tram has a score of " + Tram.getScore());
		System.out.println("Calvin has a score of " + Calvin.getScore());
			if(Tram.getScore() > Calvin.getScore()) {
				System.out.println("Tram wins");
			} else if (Tram.getScore() < Calvin.getScore()) {
				System.out.println("Calvin wins");
			} else {
				System.out.println("Draw");
			}
		
	}

}
