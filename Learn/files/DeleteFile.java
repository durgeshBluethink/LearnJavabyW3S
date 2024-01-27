package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try {



            // this is foldr delete
            File myObj = new File("E:\\upwork\\file");
            if (myObj.delete()) {
                System.out.println("Deleted the folder: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the folder.");
            }
            //  this is file delete
//            File file = new File ( "myFile.text" );
//            if(file.delete ()){
//                System.out.println ("This file delete: " + file.getName ());
//            }
//            else {
//                System.out.println("Failed to delete the file.");
//            }
        } catch (Exception e) {
            throw new RuntimeException ( e );
        }


    }
}
