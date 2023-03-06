/**
 * Griffin Murphy & Aiden Wilde
 */
public class SelectionSort {
    public static void sort(Comparable[] x, int size) {
        Comparable max;
        int maxIndex;
        for (int i=size-1; i>=1; i--) {
            max = x[i];   
            maxIndex = i;    
            for (int j=i-1; j>=0; j--) {
                if (max.compareTo(x[j]) < 0) {
                    max = x[j]; 
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                x[maxIndex] = x[i];
                x[i] = max;
            }
        }
    }
}