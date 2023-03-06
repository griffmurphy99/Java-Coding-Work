
public class TestPointAndCircle {

public static void main(String[] args) {

    Point a = new Point (3,4);
    Point b = new Point(3,4);
    Point c = new Point();
    Point d = new Point (0,5);

    System.out.println("a = " +a.getPoint()); 
    System.out.println("b = " +b.getPoint());
    System.out.println("c = " +c.getPoint());
    System.out.println("d = " +d.getPoint());
    System.out.println("Distance between "+a.getPoint() +" and "+c.getPoint()+ " is "+ a.distance(c));
    System.out.println("Sum of "+ a.getPoint() +" and " + d.getPoint() +" is "+ (a.add(d)).getPoint());
    System.out.println("Point a equals Point b: "+ a.equals(b));
    System.out.println("Point a equals Point d: "+ a.equals(d));
    System.out.println();

    Circle x = new Circle(1,a);
    Circle y = new Circle( 1, new Point()); // notice the second argument
    Circle z = new Circle(2,a);


    System.out.println("Circle x: " + x.getCircle());
    System.out.println("Circle y: "+ y.getCircle());
    System.out.println("Circle z: "+ z.getCircle());
    System.out.println("Circle x equals Circle y --> "+ x.equals(y));
    System.out.println("Circle x equals Circle z --> "+ x.equals(z));
}
}