package collection;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        // 1 add() method

        cars.add("car");
        cars.add("car1");
        cars.add("car2");
        cars.add("car3");

        // loop
        for ( String i: cars
             ) {
            System.out.println(i);
        }
        System.out.println(cars);
        // 2 size() method check for size of my   HashSet contain object

        System.out.println(cars.size());

        //Check If an Item Exists
        // 3 contains() method

        System.out.println(cars.contains("car3"));

        // 4 remove() method

        System.out.println(cars.remove("car3"));

        System.out.println(cars.size());


         String car = ( cars.contains ( "cars3" ))? "this is available":"this is  not available";
        System.out.println (car);
    }
}
