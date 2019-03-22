  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Beef", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Danish Blue Cheese", "Horseradish Cheddar" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Applewood Smoked Bacon" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Appricot Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }
    
    public static Component getOrder1() {
        Composite order = new Composite("Order\n\n");
        CustomBurger customBurger = new CustomBurger("Build Your Own Burger");
        
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PreCheese pc = new PreCheese( "Premium Cheese Options" );
        String[] pco = {"Danish Blue Cheese"};
        pc.setOptions( pco );
        pc.wrapDecorator( c );
        
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Black Olives", "Dill Pickle Chips", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;

        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
       
        Bun bun = new Bun("Bun Options");
        String[] buno = {"Ciabatta (Vegan)"};
        bun.setOptions(buno);
        bun.wrapDecorator(p);
        
        Side side = new Side("Side Options");
        String[] sideo = {"Shoestring Fries"};
        side.setOptions(sideo);
        side.wrapDecorator(bun);
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc );
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        
        CustomBurger customBurger1 = new CustomBurger("Build Your Own Burger");
        
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Smoked Gouda","Greek Feta" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        
        PreCheese pc1 = new PreCheese( "Premium Cheese Options" );
        String[] pco1 = {"Fresh Mozzarella"};
        pc1.setOptions( pco1 );
        pc1.wrapDecorator( c1);

        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Habanero Salsa" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( pc1 ) ;

        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Crushed Peanuts" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( s1 ) ;
        
        // premium topping +1.50
        Premium p1 = new Premium( "Premium Options" ) ;
        String[] po1 = { "Marinated Tomatoes","Sunny Side Up Egg*" };
        p1.setOptions( po1 ) ;
        p1.wrapDecorator( t1 ) ;
        
        Bun bun1 = new Bun("Bun Options");
        String[] buno1 = {"Gluten-Free Bun"};
        bun1.setOptions(buno1);
        bun1.wrapDecorator(p1);
        
        Side side1 = new Side("Side Options");
        String[] sideo1 = {"Shoestring Fries"};
        side1.setOptions(sideo1);
        side1.wrapDecorator(bun1);
        
        customBurger1.setDecorator( side1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 );
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1 ) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( side1 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        return order;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/