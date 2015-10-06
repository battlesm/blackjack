package blackjack;

public class Player {
	
	private Player me;
	private int money;
	private Hand hand;
	
	private Player(){
		money = 500;
	}
	
	public Player getPlayer(){
		if(me == null){
			me = new Player();
		}
		
		return me;
	}
	
	public void gainMoney(int gains){
		money += gains;
	}
	
	public void loseMoney(int losses){
		money -= losses;
	}
	
	public int getMoney(){
		return money;
	}
}
