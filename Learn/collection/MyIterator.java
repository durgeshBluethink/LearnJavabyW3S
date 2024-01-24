package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // get  the iterator
        Iterator<String> iterator = cars.iterator ();

        // Print the first item
        for (String i:cars
             ) {
            System.out.println (i);
        }

        // while loop iterator

        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
    }
}
