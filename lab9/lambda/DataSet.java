import java.util.ArrayList;
/**
 * Write a description of class DataSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataSet
{
    private ArrayList<Integer> data = new ArrayList<Integer>();
    private SortingStrategy strategy;
    private int[] sortedList = new int[12];

    /**
     * Constructor for objects of class DataSet
     */
    public DataSet()
    {
        strategy = new BubbleSort();
        data.clear();
        data.add(198);
        data.add(56);
        data.add(12);
        data.add(34);
        data.add(62);
        data.add(99);
        data.add(145);
        data.add(87);
        data.add(26);
        data.add(37);
        data.add(16);
        data.add(13);
        for (int i = 0; i < data.size(); i++) {
            sortedList[i] = data.get(i);
        }
        
    }
    
    public int[] getData() {
        return sortedList;
    }
    
    public void doSort() {
        try{
            strategy.sort(sortedList);
            System.out.println("List sorted with " + strategy.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void display() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(sortedList[i]);
        }
    }
    
    public void resetData() {
        for (int i = 0; i < data.size(); i++) {
            sortedList[i] = data.get(i);
        }
        System.out.println("Data reset");
    }
    
    public void changeStrategy(SortingStrategy s) {
        strategy = s;
    }
}
