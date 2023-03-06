/**
 * Griffin Murphy
 * CSC 104B
 */
public class FIFO {
    private int [] data = new int[10];
    private int i = 0;
    private int counter = -1;
    public int remove() {
        return data[getSize()];
    }
    
    public void insert(int x) {
        data[i] = x;
        i++;
    }
    
    public int getSize() {
        counter++;
        return counter;
    }
}