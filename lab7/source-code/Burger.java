public class Burger extends LeafDecorator
{
    private String[] options ;
    
    
    public Burger( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Organic Bison*".equals(options[i]) ) this.price += 4.0;
            else if ( "1/3lb.".equals(options[i]) ) this.price += 9.0 ;
            else if ( "1/2lb.".equals(options[i]) ) this.price += 12 ;
            else if ( "1lb.".equals(options[i]) ) this.price += 18 ;
            else if ( "In A Bowl".equals(options[i]) ) this.price += 1.0 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
