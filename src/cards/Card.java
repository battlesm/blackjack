package cards;

public abstract class Card {
	private int value;
	private char type;
	
	public Card(int value, char type){
		this.value = value;
		this.type = type;
	}
	
	public int getValue(){
		return value;
	}
	
	public char getType(){
		return type;
	}
	
	
}
