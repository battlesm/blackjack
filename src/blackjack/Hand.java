package blackjack;

import java.util.ArrayList;
import java.util.List;

import cards.Card;

public class Hand {
	private List<Card> cards;
	private boolean busted;
	
	public Hand(){
		cards = new ArrayList<Card>();
		busted = false;
		deal();
	}
	
	private void deal(){
		for(int i = 0; i < 2; i++){
			hit();
		}
	}
	
	public int getCurrentScore(){
		int score = 0;
		
		for(Card c : cards){
			score += c.getValue();
		}
		return score;
	}

	private void hit() {
		cards.add(Shoe.getShoe().dealCard());
		if(getCurrentScore() > 21){
			 busted = true;
		}
	}
}
