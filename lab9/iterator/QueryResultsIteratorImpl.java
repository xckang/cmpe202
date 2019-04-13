import java.util.ArrayList;
/**
 * Write a description of class QueryResultsIteratorImpl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueryResultsIteratorImpl implements QueryResultsIterator
{
    private ArrayList<String> results;
    private int cursor;
    private int max;

    /**
     * Constructor for objects of class QueryResultsIteratorImpl
     */
    public QueryResultsIteratorImpl(ArrayList<String> r)
    {
        results = r;
        cursor = 0;
        max = r.size();
    }

    public String first() {
        return results.get(0);
    }
    
    public String next() {
        cursor++;
        if(!isDone()) 
            return results.get(cursor);
        else
            return "<end>";
    }
    
    public String currentItem() {
        return results.get(cursor);
    }
    
    public boolean isDone() {
        return (cursor==max);
    }
}
