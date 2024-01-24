package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BasicError {
    public static void main(String[] args) {
        ArrayList<Integer> var = new ArrayList<>();
        var.add(23);
        var.add(34);
        var.add(67);
        var.add(45);

        for (Integer age : var) {
            if(age <= 18){
                throw new ArithmeticException ( "You do not have access because you are not old." );
            } else{
                System.out.println ( "You have access because you are of old age." );
            }

        }

        // this error occur when code executed, so we handle this error when code executed  by try and catch
       // System.out.println (var.get ( 51 ));


        try{
            System.out.println (var.get ( 50 ) );
        }catch (Exception e)
        {
            System.out.println (" this is massage"+ e);
        }

        // this is for when your code is executed then we want my code  lets executed, so use "Finally block"
        finally {
            System.out.println ("my code is not ");

        }



        // throw  keyword  allow created a custom error



    }
}
