package collection;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        // there are also same method of array and linkList
         // 1  set() method

        cars.add("car1");
        cars.add("car2");
        cars.add("car3");
        cars.add("car4");
        System.out.println(cars);

        // 2 size() method

        System.out.println(cars.size());

        // 3 getFirst() method

        System.out.println(cars.getFirst());

        // 4 getLast() method

        System.out.println(cars.getLast());

        // 5  addFirst() method
        cars.addFirst("car6");

        // 6  addLast() method
        cars.addLast("car7");


        // use foreach loop
        for ( String i: cars
             ) {
            System.out.println(i);
        }

       // 7 removeLast() method
        cars.removeLast();
        System.out.println(cars);


        // 8 removeFirst() method

        cars.removeFirst();
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }
}
