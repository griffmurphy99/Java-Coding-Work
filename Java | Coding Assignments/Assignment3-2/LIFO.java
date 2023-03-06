/**
 * Griffin Murphy
 * CSC 104B
 */
public class LIFO {
    private int [] data = new int[10];
    private int i = 0;
    public int remove() {
        return data[getSize()];
    }

    public void insert(int x) {
        data[i] = x;
        i++;
    }

    public int getSize() {
        data[i] = data[i] - data[i];
        i--;
        return i;
    }
   }

