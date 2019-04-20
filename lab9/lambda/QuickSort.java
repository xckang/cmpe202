
/**
 * Write a description of class QuickSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSort implements SortingStrategy
{
   
    public QuickSort()
    {
    }

    public void sort(int a[]) throws Exception {
        quicksort(a, 0, a.length-1);
    }
    
    private void quicksort(int a[], int low, int high) {
         if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(a, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quicksort(a, low, pi-1); 
            quicksort(a, pi+1, high); 
        } 
    }
    
    private int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
   
}
