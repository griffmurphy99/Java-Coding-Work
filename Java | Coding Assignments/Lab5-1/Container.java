/**
 * Griffin Murphy & Aiden Wilde
 */
public abstract class Container implements Comparable {
    protected double length;
    public Container() {
        length=1.00; 
    }

    public Container(double l) {
        length=l;
    }

    double getLength() {
        return length;
    }

    public abstract double getSize();

    public abstract double getCost();

    public int compareTo(Object o) { 
        if (this.getCost() < ((Container)o).getCost())
            return -1;
        else if (this.getCost() > ((Container)o).getCost())
            return 1;
        else return 0;
    }
}