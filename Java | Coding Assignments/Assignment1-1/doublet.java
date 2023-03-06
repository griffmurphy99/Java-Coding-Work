/**
 * Griffin Murphy
 * CSC 104B
 */
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
public class doublet {
    public static void main(String[] args) throws IOException {
        File doubletFile = new File("doubletFile.txt");
        File doubletOut = new File ("doubletOut.txt");
        PrintWriter pw = new PrintWriter(doubletOut);
        Scanner input = new Scanner(doubletFile);
        if (!doubletFile.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        } 
        String str1 = new String();
        String str2 = new String();
        int counter = 0;
        while (input.hasNext()) {
            String cut = input.nextLine();
            String words[] = cut.split(" ");
            str1 = str1 + " " + words[1];
            str2 = str2 + " " + words[0];
        }
        String space = new String(" ");
        for (int i=1; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                pw.print(str1.charAt(i));
                pw.print(str2.charAt(i));
                pw.println();
                counter++;
            }
            else {
                pw.print(str1.charAt(i));
                pw.print(str2.charAt(i));
                pw.println();
                if (counter > 1 && str1.charAt(i) == space.charAt(0)) {
                    pw.println(" Not Doublet");
                    pw.println("--------------------------");
                    pw.println();
                    counter = 0;
                }
                else if(str1.charAt(i) == space.charAt(0)) {
                    pw.println(" Doublet");
                    pw.println("--------------------------");
                    pw.println();
                    counter = 0;
                }
            }
        }
        input.close();
        pw.close();
    }
}