/**
 * Griffin Murphy & Aiden Wilde
 */
public class tube extends Container {
    protected double radius;
    public tube() {
        radius=1.00; 
    }

    public tube(double length, double r) {
        super(length);
        radius=r; 
    }

    public double getSize() {
        return 2*(3.14)*(radius)+(length);
    }

    public double getCost() {
        double area=getSize();
        double cost=area*(0.25);
        return Math.round(100*cost)/100.00;
    }

    public String toString() {
        return "Tube, Size= "+getSize()+" inches squared Cost= $"+getCost();
    }
}