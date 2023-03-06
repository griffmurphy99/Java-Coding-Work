/**
 * Griffin Murphy
 * CSC 104B
 */
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class wordSearch {
    static Scanner input;
    static char[][] listArray;
    static char[][] gridArray;
    static char[][] output;
    static int Row;
    static int Column;
    static int Word;
    public static void main(String[] args) throws IOException {
        File grid = new File("wordGrid.txt");
        File list = new File("wordList.txt");
        Scanner input1 = new Scanner(grid);
        Scanner input2 = new Scanner(list);
        if (!grid.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        } 
        if (!list.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        } 
        listArray = new char[12][];
        gridArray = new char[8][11];
        input = new Scanner(list);
        for(int i = 0; i < listArray.length; i++) {
            listArray[i] = input.nextLine().toCharArray();
        }
        input = new Scanner(grid);
        for(int i = 0; i < gridArray.length; i++) {
            gridArray[i] = input.nextLine().toCharArray();
        }
        findFirstLetter();
    }  

    public static void findFirstLetter() {
        for(int k = 0; k < 12; k++) {
            for(int i = 0; i < gridArray.length-1; i++) {
                for(int j = 0; j < gridArray.length-1; j++) {
                    if(listArray[k][0] == gridArray[i][j]) {
                        Row = i;
                        Column = j;
                        Word = k;
                        searchHorizontal();
                    }
                }
            }
        }
    }

    public static void searchHorizontal() {
        for(int j = 1; j < listArray[Word].length-1; j++) { 
            if (Column + j > 10) {
                searchVertical();
                return;
            }
            if(listArray[Word][j] != gridArray[Row][Column+j]) {
                searchVertical();
                return;
            }
            else {
                System.out.print(gridArray[Row][Column+j]);
            }
        
        }
        System.out.println();
        System.out.println(Row + " row");
        System.out.println(Column + " col");
        System.out.println();
    }

    public static void searchVertical() {
        for(int j = 1; j < listArray[Word].length-1; j++) { 
            if (Row + j > 8) {
                return;
            }
            if(listArray[Word][j] != gridArray[Row+j][Column]) {
                return;
            }
            else {
                System.out.print(gridArray[Row+j][Column]);  
                }
            }
        System.out.println();
        System.out.println(Row + " row///");
        System.out.println(Column + " col///");
        System.out.println();
    }
}