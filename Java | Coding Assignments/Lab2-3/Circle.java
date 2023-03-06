// Aidan Griffin Thomas
import java.util.*;
public class Circle {
  private int radius;
  private double area;
  private int x2;
  private int y2;
  public char point;
  public Circle(int x, int y) {
    radius=0;
    x2=x;
    y2=y;
  }
  
  public Circle(int r, Point x) {
    radius = r;
    point = x;
  }
  
  public int getRadius() {
    return radius;
  }
  
  public void setRadius(int r) {
    radius = r;
    
  }
  
  public void getPoint() {
      return point;
    }
  
  public int getX2() {
    return x2;
  }
  
  public int getY2() {
    return y2;
  }
  
  public void setX(int x) {
    x = x;
  }
  
  public void setY(int y) {
    y = y;
  }
  
  public double area() {
    area = Math.PI * (radius * radius);
    return area;
  }
  
  public boolean equals(Circle c) {
    if (this.area==c.area) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public String getCircle() {
    String display= "Radius: "+radius+" Center: "+x2+", "+y2+ " Area: "+ area;
    return display;
    }
}