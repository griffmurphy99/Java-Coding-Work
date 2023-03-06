/**
 * Griffin Murphy
 * CSC 104B
 */
import java.lang.Math;
import java.io.*;
import java.util.*;
import java.io.IOException;
public class grades {
    public static void main(String[] args) throws IOException {
        File courseFile = new File("Courses.txt");
        Scanner input = new Scanner(courseFile);
        if (!courseFile.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        } 
        int counter = 0;
        double points = 0;
        String str = new String();
        while (input.hasNext()) {
            String cut = input.nextLine();
            String words[] = cut.split(" ");
            counter++;
            str = str + words[1];
        }
        String grades = new String("ABCDF");
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == grades.charAt(0)) {
                points = points + 4.0;
            }
            else if (str.charAt(i) == grades.charAt(1)) {
                points = points + 3.0;
            }
            else if (str.charAt(i) == grades.charAt(2)) {
                points = points + 2.0;
            }
            else if (str.charAt(i) == grades.charAt(3)) {
                points = points + 1.0;
            }
            else if (str.charAt(i) == grades.charAt(4)) {
                points = points + 0.0;
            }
        }
        double gpa = points/counter * 100;
        float gpaFinal = Math.round(gpa);
        System.out.print("The Final GPA is: ");
        System.out.println(gpaFinal/100);
    }
}