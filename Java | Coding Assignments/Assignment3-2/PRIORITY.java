/**
 * Griffin Murphy
 * CSC 104B
 */
public class PRIORITY {
    private int [] data = new int[10];
    private int i = 0;
    private int k = 0;
    public int remove() {
        int m = data[getSize()];
          data[k] = 0;
        return m;
    }
    
    public void insert(int x) {
        data[i] = x;
        i++;
    }

    public int getSize() {
        int j = 0;
        k = 0;
        for(k = 0; k <= i;) {
            for(j = 0; j <= i; j++) {
                if (data[j] > data[k]) {
                    k = j;
                    j = 0;
                }
                if(j == i) {
                    return k;
                }
            }
        }
        return k;
    }
}