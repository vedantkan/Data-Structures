package lecture9;

import java.util.Arrays;

public class Radix {
    public static void main(String[] args) {
        int[] a = {85,3,19,43,20,55,42,21,91,85,73,29};
        int n = a.length;
        //Print unsorted array.
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        double start = System.nanoTime();
        //Sort the array.
        radixSort(a);
        double elapsed = (System.nanoTime()-start)/1000000000;
        
        //Print sorted array.
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }   //End Main
    
    // A utility function to get maximum value in arr[]
    public static int Max(int a[], int n){
    
        int m = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        return m;
    }
    
    public static void radixSort(int[] a){
        //IMPLEMENT ME
        int max = Max(a, a.length);    // Get the max number from the array
        
        int d = 1;                      // Set the int d to the ones digit 
        for(d=1; (max/d)>0; d*=10){
            
            int temp[] = new int[a.length];     //Temp array to store numbers
            int i;
            int place[] = new int[10];              // 10 dirre
            Arrays.fill(place,0);
            
            
            // Storing the number of counts in each place
            for(i=0; i<a.length; i++){
                place[(a[i]/d) % 10]++;
            }
            
            // Change count[i] so that count[i] now contains
            // actual position of this digit in output[]
            for(i=1; i<10; i++){
                place[i] += place[i-1];
            }
            
            // Build the output array
            for (i = (a.length) - 1; i >= 0; i--) {
            temp[place[(a[i] / d) % 10] - 1] = a[i];
            place[(a[i] / d) % 10]--;
            }
 
            // Copy the output array to arr[], so that arr[] now
            // contains sorted numbers according to current digit
            for (i = 0; i < a.length; i++){
            a[i] = temp[i];
            }
        
        }
    }   //End radixSort
}   //End Class