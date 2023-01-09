package ie.atu.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("Students.txt"));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        while (inputFile.hasNext())
        {
            String str = inputFile.nextLine();
            System.out.println(str);
        }
    }
}