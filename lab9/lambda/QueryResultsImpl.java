import java.util.ArrayList;
/**
 * Write a description of class QueryResultsImpl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueryResultsImpl implements QueryResults
{
    private ArrayList<String> results = new ArrayList<String>();
   
    public QueryResultsImpl()
    {
    }
    
    public void fetchData() {
        results.add("Item 1");
        results.add("Item 2");
        results.add("Item 3");
        results.add("Item 4");
        results.add("Item 5");
        results.add("Item 6");
        results.add("Item 7");
        results.add("Item 8");
        results.add("Item 9");
        results.add("Item 10");
    }
    
    public QueryResultsIterator createIterator() {
        return new QueryResultsIteratorImpl(results);
    }
    
    public void lambdaIterator() {
        results.forEach((item) -> System.out.println(item));
        
    }
}
