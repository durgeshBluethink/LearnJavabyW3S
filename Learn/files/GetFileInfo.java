package files;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        try {
            File file = new File ( "myFile.txt" );
            if (file.exists()){
                System.out.println ( "Readable " + file.getName () );
                System.out.println ( "Readable " + file.getAbsolutePath () );
                System.out.println ( "File size in bytes " + file.length () );
                System.out.println ( "Readable " + file.canRead () );
                System.out.println ( "Readable " + file.canWrite () );
            }else {
                System.out.println("The file does not exist.");
            }
        }catch (Exception e){
            e.fillInStackTrace ();
            System.out.println (" kucch kharab hai!");
        }
    }
}
