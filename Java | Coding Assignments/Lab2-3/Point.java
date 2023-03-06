// Aidan Griffin Thomas
import java.util.*;
public class Point {
  public int x;
  public int y;
  private Circle c;
  
  public Point() {
    x=1;
    y=5;
  }
  
  public Point(int x, int y) {
    this.x=x;
    this.y=y;
    
  }
  
  public int getX() {
    return x;
  }
  
  public void setX(int x) {
    x = x;
  }
  
  public int getY() {
      return y;
  }
   
  public void setY(int y) {
    this.y=y;
  }
  
  public double distance(Point P) {
    double xsq= Math.pow((this.x-P.getX()), 2);
    double ysq= Math.pow((this.y-P.getY()), 2);
    return Math.sqrt(xsq+ysq);
  }
  
  public Point add(Point P) {
    int xsum=this.x+P.getX();
    int ysum=this.y+P.getY();
    Point c= new Point(xsum, ysum);
    return c;
  }
  
  public boolean equals(Point P) {
    if (this.x==P.getX() && this.y==P.getY())
    {
      return true;
    }
    else 
    {
      return false;
    }
  }
  
  public String getPoint() {
    String display="("+x+","+y+")";
    return display;
  }
}