/**
 * Griffin Murphy
 * CSC 104B
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
public class Roster {
    private static String lastName = "";
    private static String firstName = "";
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Student[] c = new Student[34];
        
        File StudentFile = new File("Students.txt");
        Scanner in = new Scanner(StudentFile);
        if (!StudentFile.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        } 
        while (input.hasNext()) {
            String names = in.nextLine();
            c = c + names;
        }
        String choice;
        do {
            menu();
           choice = input.nextLine();
            performAction(choice);  
            System.out.println();
        } while (!choice.equals("E"));
    }

    public static Student[] sort(Student[] c) {   // sorts by lastName + " "+ firstName, you can just call the generic/utility sort from class (SelectionSort.sort(...))
         Student[] newlist = new Student[c.length];
        for(int i=0;i<c.length;i++){
            String next = c[i].getfirstName();
            int insert = 0;
            int k =i;
            while(k>0 && insert == 0)
            {
                if(next.compareTo( newlist[k-1].getlastName() ) > 0)
                {
                    insert = k;
                }
                else
                {
                    newlist[k] = newlist[k-1];
                }
                k--;
            }
            newlist[insert]=c[i];
        }
        return newlist;
    }

        public static int search(Student[] c, String lastName ){
        int high = c.length;
        int low = -1;
        int probe;
        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( c[probe].getlastName().compareTo(lastName) > 0)
            {    
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        if ( (low >= 0) && (c[low].getlastName().compareTo(lastName) == 0 ))
        {
            return low;
        }
        else
        {
            return -1;
        }
    }
    

    //public static int addStudent(Student s)  {// make sure to sort after an addition
        
    //}

    public static void printClass(Student[] c) { //prints all data for each student in the class, 
        System.out.println("---------------------------------------------------------");
        for(int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
        System.out.println();
    }

    public static void menu() {
        System.out.println("S : search for a student");
        System.out.println("A : add a student");
        System.out.println("P : print all students");
        System.out.println("E : exit");
        System.out.print("Choice: ");
    }

    public static void performAction(String choice) {
        int test = 0;
        Scanner input = new Scanner(System.in);
        if (choice.equals("A")) {
            
            
            // ask for the data for a student, last name, first name, gpa etc
            // creat a student object s
            // call add(s);
        }
        else if (choice.equals("S")) {
            // ask for the last name and first name
            // pass this to search and search() returns an int ( -1 if not found)
            // the int returned is the place in the array, so print the data or say "not found"
            System.out.println("Last Name: ");
            lastName = input.nextLine();
             System.out.println("First Name: ");
             firstName = input.nextLine();
            // sort();
        test = search(c, lastName);
        if (test != -1)
        {
            System.out.println("Found:" + Student[test].toString());
        }
        else
        {   
            System.out.println("Not found.");
        }
        }   

        else if (choice.equals("P")) {
            printClass();
            // print all the data in the array  
        }
    }

}
