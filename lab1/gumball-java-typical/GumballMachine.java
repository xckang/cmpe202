
    
public class GumballMachine
{

    private int num_gumballs;
    private boolean ready;
    private int cost;              // price for a gumball
    private int insert_cost;       // the cost of coins that have been inserted
    private boolean only_quarter;  // true: accepts quarters; 
                                   // false: accepts nickles, dims & quarters;
    private String accept_coin;

    public GumballMachine( int size, int cost, boolean type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost;
        this.insert_cost = 0;
        this.only_quarter = type;
        this.accept_coin = type ? "Quarters." : "Nickles, Dimes & Quarters.";
        this.ready = false;
    }

    public void insertCoin(int coin)
    {
        System.out.println("> inserting coin：" + coin);
        if (this.only_quarter){
            if (coin == 25) {
                this.insert_cost += coin; // do nothing
            }
        } else {
            if (coin == 5 || coin == 10 || coin == 25) {
                this.insert_cost += coin;
            }
        }
            
        if (this.insert_cost >= this.cost) {
            this.ready = true;
        }
    }
    
    public void turnCrank()
    {
        System.out.print("> Crank Turned\n[ Machine ]: ");
        if ( this.ready )
        {
            this.insert_cost = 0;
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs--;
                this.ready = false;
                System.out.println( "Thanks for your coins. Gumball Ejected!" );
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." );
            }
        }
        else 
        {
            System.out.println( "Please insert more coins. Accepts " + this.accept_coin );
        }        
    }
    
    public String toString() {
        return "\n-----------------------------------\n"
                + "Gumball Machine Price: " + this.cost + "cents.\nAccept: " + this.accept_coin
                + "\n-----------------------------------";
    }
}
