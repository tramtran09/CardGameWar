package FinalJava;

public class Card {
	private int value;
	private String suits;
	private String name;
	
	private static final String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private static final String[] suitsString = {"Clubs", "Diamonds", "Hearts", "Spades"};


	public Card(int value, String suit) {
		this.value = value;
		this.suits = suit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuits() { //not really needed
		return suits;
	}
	public void setSuits(String suits) {
		this.suits = suits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static String[] getRanks() {
		return ranks;
	}

	public static String[] getSuitsstring() {
		return suitsString;
	}
	
	public void describe() {
		System.out.println("Card: " + ranks + suitsString);

	}
	
}
