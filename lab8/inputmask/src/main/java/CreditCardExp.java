/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{
    private IKeyEventHandler nextHandler ;  
    private IKeyEventHandler prevHandler;
    private String date = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
        next.setPrev(this);
    }   
    
    public void setPrev( IKeyEventHandler prev) {
        prevHandler = prev;
    }

    public String display() {
        if ( date.equals("") )
            return "[MM/YY]" + "  " ;
        else {
            if (date.length() <= 2 ) {
                return "[" + date + "]" + "  " ;
            } else {
                return "[" + date.substring(0,2) + "/" + date.substring(2) + "]  ";
            }
        }
    }   

    public void key(String ch, int cnt) {
        if ( cnt >= 17 && cnt <= 20  ) {
            if (ch.matches("x|X")) {
                date = date.substring(0, date.length() - 1 );
            } else {
                date += ch ;
            }
        }
        else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }   

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

}