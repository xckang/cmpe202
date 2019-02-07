public class NotEnoughCoinState implements State
{
    GumballMachine gumballMachine;

    public NotEnoughCoinState(GumballMachine m)
    {
        this.gumballMachine = m;
    }
    
    public void insertCoin(int coin) {
        System.out.println("Coin received.");
    	if (this.gumballMachine.hasEnoughCoin()) {
    	    gumballMachine.setState(gumballMachine.getEnoughCoinState()); 
    	} 
    }
    
    public void ejectCoin() {
    	System.out.println("Coins returned.");
    	gumballMachine.setState(gumballMachine.getNoCoinState());
    }
    
    public void turnCrank() {
    	System.out.println("> You turned...");
    	System.out.println("You need to insert more coins...");
     }
    
    public void dispense() {
    	System.out.println("You need to finish payment first...");
    } 
    
    public String toString() {
    	return "waiting for more coins";
    }

}
