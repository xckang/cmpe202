

public class Main {
  
    public static void main(String[] args) {
        GumballMachine gumballMachine0 = new GumballMachine(5, 25, true);
        GumballMachine gumballMachine1 = new GumballMachine(5, 50, true);
        GumballMachine gumballMachine2 = new GumballMachine(1, 50, false);
        
        System.out.println(gumballMachine0);
        gumballMachine0.insertCoin(25);
        gumballMachine0.turnCrank();
    
        System.out.println(gumballMachine1);
        gumballMachine1.insertCoin(25);
        gumballMachine1.insertCoin(5);
        gumballMachine1.turnCrank();
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
    
        System.out.println(gumballMachine2);
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(5);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.refill(3);
        gumballMachine2.insertCoin(1);
        gumballMachine2.insertCoin(25);
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
    }
}
