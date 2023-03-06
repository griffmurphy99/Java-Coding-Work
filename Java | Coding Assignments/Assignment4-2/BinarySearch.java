/**
 * Griffin Murphy
 * CSC 104B
 */
public class BinarySearch {
    public static int findName(Student[] c, String lastName ){
        int high = c.length;
        int low = -1;
        int probe;
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( c[probe].getlastName().compareTo(lastName) > 0)
            {    
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        if ( (low >= 0) && (c[low].getlastName().compareTo(lastName) == 0 ))
        {
            return low;
        }
        else
        {
            return -1;
        }
    }
}