/**
 * Griffin Murphy & Aiden Wilde
 */
public class Box extends Container {
    protected double width;
    protected double height; 
    public Box() {
        width=1.00;
        height=1.00;
    }

    public Box(double length, double w, double h) {
        super(length);
        width=w;
        height=h;
    }

    public double getCost() {
        double area=getSize();
        double cost=area*(0.35);
        return Math.round(100*cost)/100.00;
    }

    public double getSize() {
        return length*width*height;
    }

    public String toString() {
        return "Box, Size= "+getSize()+" inches squared Cost= $"+getCost();
    }
}