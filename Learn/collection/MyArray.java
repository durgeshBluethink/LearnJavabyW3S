package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArray {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("car1");
        car.add("car2");
        car.add("car3");
        car.add("car4");
        System.out.println(car);

        // 1 access item
        //by get()  method
        //car.get(1);
        System.out.println(car.get(1));

        // 2 set method

        // car.set(1,"car5")
        System.out.println(car.set(1, "car5"));

        // 3 remove() method
        System.out.println(car.remove(2));
        System.out.println(car);
        // 4  size() method
        System.out.println(car.size());

        // 5 sort() method
        Collections.sort(car);

        for ( String i: car
             ) {
            System.out.println(i);
        }
        // clear() method they are clear all object in the arrayList.
        car.clear();
        System.out.println(car);

    }
}
