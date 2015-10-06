package blackjack;

public class Dealer {
	
	private Dealer dealer;
	private Hand hand;
	
	public Dealer getDealer(){
		if(dealer == null){
			dealer = new Dealer();
		}
		
		return dealer;
	}

}
