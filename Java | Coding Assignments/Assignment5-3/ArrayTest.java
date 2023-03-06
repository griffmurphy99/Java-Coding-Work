/**
 * Griffin Murphy
 * CSC 104B
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
public class ArrayTest {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = keyboard.next();
        boolean correct = false; 
        boolean end = false; 
        try {
            ArrayTest.readData(fileName);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        while(correct = true) {
            System.out.println("Enter Index: ");
            int index = keyboard.nextInt();
            if(index == 999) {
                correct = false;
                break;
            }
            find(index, fileName);
        }
    }
    
    public static String readData(String fileName) throws FileNotFoundException {
        int i = 0;
        String[] names = new String[10];
        File inFile = new File(fileName);
        Scanner input = new Scanner(inFile);
        while(input.hasNext()) {
            names[i] = input.nextLine();
            i++; 
        }
        input.close();
        String fill = "";
        return fill;
    }

    public static String find(int index, String fileName) throws IOException {
        File inFile = new File(fileName);
        Scanner input = new Scanner(inFile);
        String[] names = new String[10];
        int i = 0;
        boolean correct = false;
        String test = "";
        while(input.hasNext()) {
            names[i] = input.nextLine();
            i++;
        }
        input.close();
        while(!correct) {
            try {
                if(index > 0 || index < 10) {
                    System.out.println(names[index]);
                    correct = true;           
                }
            }
            catch(Exception e) {  
                System.out.println("Index out of bounds.");
                correct = true;
            }
        }
        String fill = "";
        return fill;
    }
}