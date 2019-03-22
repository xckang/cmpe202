public class Bun extends LeafDecorator
{
    private String option;
    
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] option )
    {
        this.option = option[0] ;
        if ( "Gluten-Free Bun".equals(option[0]) ) this.price += 1.0;
        else if ( "Pretzel Bun".equals(option[0]) ) this.price += 0.50 ;
        else if ( "Hawaiian Bun".equals(option[0]) ) this.price += 1 ;
    }
    
    public String getDescription() 
    {        
        return option;
    }
    
}
