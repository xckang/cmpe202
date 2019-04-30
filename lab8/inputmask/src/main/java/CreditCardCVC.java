/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

    private IKeyEventHandler nextHandler ;
    private IKeyEventHandler prevHandler;
    private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
        next.setPrev(this);
    }   
    
    public void setPrev(IKeyEventHandler prev) {
        this.prevHandler = prev;
    }

    public String display() {
        if ( cvc.equals("") )
            return "[123]" + "  " ;
        else
            return "[" + cvc + "]" + "  " ;
    }   

    public void key(String ch, int cnt) {
        if ( cnt >= 21 && cnt <= 23) {
            if (ch.matches("x|X")) {
                cvc = cvc.substring(0, cvc.length() - 1 );
            } else {
                cvc += ch ;
            }
        } else if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }   

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}