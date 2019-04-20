
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort implements SortingStrategy
{
    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {
       
    }

    public void sort(int a[]) throws Exception {
        for(int i = a.length; --i > 0; ) {
            boolean flipped = false;
            for (int j = 0; j < i; j ++ ) {
                if (a[j]>a[j+1]) {
                    int T = a[j];
                    a[j] = a[j+1];
                    a[j+1] = T;
                    flipped = true;
                }
            }
            if (!flipped) {
                return;
            }
        }
    }
}