package collection;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap< String, String> car = new HashMap<>();

        // 1 put() method use for add value in our HashMap object contains
        car.put("car","car1");
        car.put("car1","car2");
        car.put("car2","car3");
        car.put("car3","car4");

        //Access an Item
   // Loop Through a HashMap and 2 get() method we get our values also keys
        for (String i : car.keySet()
                ) {
            System.out.println("key: "+ i +" value: "+ car.get(i));
        }

        // check our size by 3 size() method
        System.out.println(car.size());

        // Remove an Item
        // 4 remove() method use for remove aur element
        car.remove("car1");

        System.out.println(car.size());

        for (String i: car.keySet()
             ) {
            System.out.println(i);
        }
    }


}
