/**
 * Griffin Murphy & Aiden Wilde
 */
import java.util.Scanner;
public class TestContainer {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Container [] containers= new Container[10];
        for (int i=0;i<10;i++)
        {
            int answer = 0;
            System.out.println("Enter containers, 1 for box and 2 for tube");
            answer=input.nextInt();
            if (answer==1) {
                System.out.println("Enter length, width and height");
                double l=input.nextDouble();
                double w=input.nextDouble();
                double h=input.nextDouble();
                containers[i]=new Box(l,w,h);
            }
            if (answer==2) {
                System.out.println("Enter height, radius");
                double l=input.nextDouble();
                double r=input.nextDouble();
                containers[i]=new tube(l,r); 
            }
        }
        SelectionSort.sort(containers, 10);
        for (int n=0;n<10;n++) {
            Container x=containers[n];
            if(x instanceof tube) {
                System.out.println(((tube)x).toString());
            }
            if(x instanceof Box) {
                System.out.println(((Box)x).toString());
            }
        }
    } 
}