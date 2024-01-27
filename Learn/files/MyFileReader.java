package files;

import java.io.*;
import java.util.Scanner;

public class MyFileReader {
    public static void main(String[] args) {
        // Assuming the file is created using the CreateAndWrite class
        try {
            File file = new File ( "myFile.txt" );
            System.out.println("File size in bytes " + file.length());
            System.out.println("Readable " + file.canRead());
            System.out.println("Readable " + file.canWrite ());

            Scanner fileScanner = new Scanner ( file );
            while (fileScanner.hasNextLine ()){
                String myReader = fileScanner.nextLine ();
                System.out.println (myReader);
            }

            fileScanner.close ();
        } catch (FileNotFoundException e) {
            System.out.println (" Something is wrong!");
            throw new RuntimeException ( e );
        }


    }
}
