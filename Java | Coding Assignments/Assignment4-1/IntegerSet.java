/**
 * Griffin Murphy
 * CSC 104B
 */
public class IntegerSet implements Mergeable {
    private int[] set;
    private int[] inputSet;
    private int x;
    private int y;
    private int size;
    public IntegerSet() {
        int x = 0;
        int y = 0;
        int size = 0;
        int[] set = new int [101];
    }

    public IntegerSet(int[] inputSet, int size) {
        inputSet = new int[size];
        for(int i = 0; i <= inputSet.length; i++) {
            if(inputSet[i] == inputSet[i+1]) {
                inputSet[i] = inputSet[0];
            }
            merge(inputSet);
            i++;
        }
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < inputSet.length; i++) {
            output += inputSet[i] + ", ";
        }
        return output;
    }

    public Object merge(Object x) {
        x = new IntegerSet[100];
        Object y = new IntegerSet[100];
        Object z = new IntegerSet[0];
        return z;
    }

    public int getSize() {
        return size;
    }

    public boolean elementOf(int x) {  // is x a member of the set?
        boolean[] array = new boolean[100];
        int[] inputSet = new int[x];
        for(int i = 0; i < inputSet.length; i++) {
            if(set[i] == inputSet[i]) {
                array[i] = true;
                return true;
            }
            else {
                array[i] = false;
                return false;
            }
        }
        return true;
    }
    
    public void printElements() {
        System.out.println();
    }
    

    public void add(int x) {  // adds x to a set,  set has no duplicate items
        int[] test = new int[x];
    }

}