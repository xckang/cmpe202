

public class GumballMachine  {
 
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State notEnoughCoinState;
    State enoughCoinState;
    State noCoinState;
 
    private State state = soldOutState;
    private int count = 0;
    private int price = 0;
    private int accValue = 0;
    boolean onlyQuarters = false;
    
    /**
     * Constructor for a gumball machine.
     * @param numberGumballs Number of gumballs that the machine has.
     * @param Price the price for one gumball.
     * @param onlyQuarters If this value is true, the machine accepts only 
     * quarters. If false, nikles, dimes & quarters.
     */
    public GumballMachine(int numberGumballs, int price, boolean onlyQuarters) {
            soldOutState = new SoldOutState(this);
            noCoinState = new NoCoinState(this);
            notEnoughCoinState = new NotEnoughCoinState(this);
            enoughCoinState = new EnoughCoinState(this);
            soldState = new SoldState(this);
            this.count = numberGumballs;
            this.price = price;
            this.onlyQuarters = onlyQuarters;
        if (numberGumballs > 0) {
            this.state = noCoinState;
        } 
    }
 
    public void insertCoin(int coin) {
        // validate the coin
    	System.out.println("> You inserted " + coin + " cents.");
        if (this.onlyQuarters && coin != 25) {
            System.out.println("Coin rejected. This machine only accepts quarters.");
            return;
        }
        if (!this.onlyQuarters && coin != 5 && coin != 10 && coin != 25) {
            System.out.println("Coin rejected."
              + " This machine only accepts nikles, dimes & quarters.");
            return;
        }
        this.accValue += coin;
        this.state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        this.state.ejectCoin();
    }
 
    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }
 
    public void releaseBall() {
        System.out.println(">>> A gumball comes rolling out the slot. <<<");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    public int getCount() {
        return count;
    }
    
    public void resetValue() {
        this.accValue = 0;
    };
 
    public void refill(int count) {
        System.out.println("!!! Refill operation will cause "
            + "cancelling of the current purchase.\n"
            + "!!! Inserted coins can't be returned now.");
        this.count = count;
        this.accValue = 0;
        this.state = noCoinState;
    }

    public boolean hasEnoughCoin() {
        return (this.accValue >= this.price) && (this.accValue > 0);
    }
    
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }
    
    public State getEnoughCoinState() {
        return enoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n-----------------------------------------------");
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Machine");
        result.append("\nInventory: " + this.count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Price: " + this.price + " cents\n");
        result.append("Accepts: " + (this.onlyQuarters ? "Quarters" 
                            : " Dimes, Nickles & Quarters") + "\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
