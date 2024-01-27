package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWrite {
    public static void main(String[] args) {
        try {
            String directoryPath = "E:\\upwork\\file";
            File directory = new File(directoryPath);

            // Creating the directory
            System.out.println ("\" 1st task directory create \"  Creating the directory");
            System.out.println (" ");
            boolean isDirectoryCreated = directory.mkdir();
            if (isDirectoryCreated) {
                System.out.println("Directory Created: " + directory.getAbsolutePath());
            } else {
                System.out.println(" Directory already exists or could not be created.");
            }

            // Creating the file within the directory
            System.out.println (" ");
            System.out.println (" \" 2nd task file create \" Creating the file within the directory");
            File myFile = new File(directory, "myFile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File Created: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
            } else {
                System.out.println("File is already exists!");
            }

            // wrote in the file
            System.out.println (" ");
            System.out.println (" \" 3rd task file wrote \" after Creating the file then  wrote in the file");
            FileWriter fileWrite  = new FileWriter ( "myFile.txt" );
           // System.out.println("Absolute path: " + myFile.getAbsolutePath());
            //wrote on file by write() method
            fileWrite.write ( "this is my file i wrote something but don't have time for wrote  so wait !" );
            fileWrite.close ();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
