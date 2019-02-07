
/**
 * Write a description of class EnoughCoinState here.
 *
 * @author xckang
 * @version 02/06/2019
 */
public class EnoughCoinState implements State
{
    private GumballMachine gumballMachine;

    public EnoughCoinState(GumballMachine m)
    {
        this.gumballMachine = m;
    }

    public void insertCoin(int coin) {
    	System.out.println("You've already inserted enough coins.");
    }
    
    public void ejectCoin() {
    	System.out.println("Coins returned.");
    	gumballMachine.setState(gumballMachine.getNoCoinState());
    }
    
    public void turnCrank() {
    	System.out.println("> You turned...");
    	gumballMachine.setState(gumballMachine.getSoldState());
     }
    
    public void dispense() {
    	System.out.println("No gumball dispensed");
    } 
    
    public String toString() {
    	return "Waiting for turn of crank";
    }

}
