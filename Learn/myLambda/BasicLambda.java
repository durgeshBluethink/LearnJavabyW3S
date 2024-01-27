package myLambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BasicLambda {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<> ();

        num.add ( 78 );
        num.add ( 45 );
        num.add ( 56 );
        num.add ( 89 );
        num.add ( 15 );
        num.forEach ( integer -> { System.out.println (integer); } );
        System.out.println ("or");
        //or
        num.forEach ( x -> System.out.println ( x ) );

        System.out.println ("+++++++++++++++++++++++++++ Consumer Interface +++++++++++++++++++++++++++++++++++++");

        Consumer<Integer> integerConsumer = var -> System.out.println (var);
        num.forEach ( integerConsumer );


    }
}
