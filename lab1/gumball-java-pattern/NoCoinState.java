
/**
 * Write a description of class NoCoinState here.
 *
 * @author xckang
 * @version 02/06/2019
 */
public class NoCoinState implements State
{
     GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("Coin received.");
    	State nextState;
    	if (this.gumballMachine.hasEnoughCoin()) {
    	    nextState = gumballMachine.getEnoughCoinState();
    	} else {
    	    nextState = gumballMachine.getNotEnoughCoinState();
    	}
    	gumballMachine.setState(nextState);
    }
    
    public void ejectCoin() {
    	System.out.println("You haven't inserted a coin.");
    }
    
    public void turnCrank() {
    	System.out.println("> You turned...");
    	System.out.println("You haven't inserted a coin...");
     }
    
    public void dispense() {
    	System.out.println("You need to pay first...");
    } 
    
    public String toString() {
    	return "waiting for coins...";
    }

}
