package blackjack;

import java.util.Random;

import cards.Card;
import cards.Two;

public class Shoe {
	
	private static Shoe shoe;
	
	public static Shoe getShoe(){
		if(shoe == null){
			shoe = new Shoe();
		}
		
		return shoe;
	}
	
	public Card dealCard(){
		Random rand = new Random();
		int type = rand.nextInt(13);
		switch (type){
		case 0:
			return new Two();
		default:
			return null;
		}
	}

}
