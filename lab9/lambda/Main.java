import java.util.function.*;
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

    public static void main() {
        // java version
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        DataSet data = new DataSet();
        data.display();
        data.doSort();
        data.display();
        data.changeStrategy(quickSort);
        data.resetData();
        data.doSort();
        data.display();
        
        // lambda version
        BiFunction<int[], SortingStrategy, Void> doSort = (int[] list, SortingStrategy strategy) -> {
            try{ 
                System.out.println("List sorted with Lambda " + strategy.toString());
                strategy.sort(list);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            return null;
        };
        
        
        data.resetData();
        doSort.apply(data.getData(), bubbleSort);
        data.display();
        data.resetData();
        doSort.apply(data.getData(), quickSort);
        
        
    }
    
    public static void main1(){
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
