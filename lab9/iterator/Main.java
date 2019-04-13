
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
    public Main()
    {
    }

    public static void main(){
        // java version
        System.out.println( "java version");
        QueryResults resultSet = new QueryResultsImpl();
        resultSet.fetchData();
        QueryResultsIterator iter = resultSet.createIterator();
        while ( !iter.isDone() ) {
            System.out.println( iter.currentItem() );
            iter.next();
        }
        // lambda version
        System.out.println( "lambda version" );
        ((QueryResultsImpl)resultSet).lambdaIterator();
    }
}
