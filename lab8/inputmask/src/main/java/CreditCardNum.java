/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private String number = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
        next.setPrev(this);
    }   
    
    // not used
    public void setPrev(IKeyEventHandler prev) {
    };

    public String display() {
        if ( number.equals("") )
            return "[4444 4444 4444 4444]" + "  " ;
        else {
            String display = "[";
            for (int i = 0; i < number.length(); i++) {
                if (i % 4 == 0 && i > 0) {
                    display += " ";
                }
                display += number.charAt(i);
            }
            display += "]  ";
            return display;
        }
    }   

    public void key(String ch, int cnt) {
        if ( cnt <= 16 ) {
            if (ch.matches("x|X")) {
                number = number.substring(0, number.length() - 1 );
            } else {
                number += ch ;
            }
        }
        else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }   

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}