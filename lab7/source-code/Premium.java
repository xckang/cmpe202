public class Premium extends LeafDecorator
{
    private String[] options ;
    
    
    public Premium( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i < options.length; i++ ) {
            if ( options[i].equals("Marinated Tomatoes") ) {
                this.price += 3.0;
            } else {
                this.price += 1.0;
            }
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