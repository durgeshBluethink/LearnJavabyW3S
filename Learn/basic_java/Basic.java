package basic_java;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello Programer!");
        //Print Numbers
        System.out.println(3);
        System.out.println(33.0);
        System.out.println(846324783);
        //you can also calculate same number like
        // add
        System.out.println(3+4);
        // multiple
        System.out.println(3*5);

        //3rd
        //It is up to you which you want to use. Normally, we use // for short comments, and /* */ for longer.

        ///////////////////////////////variable//////////////////////////

        //they are three types
        /*

         local variable
         instance variable
        static variable
         */

        //loacl variable
        // string
        String name = "John";
        System.out.println(name);
        // int
        int myNum = 15;
        System.out.println(myNum);

        String name1 = "John";
        System.out.println("Hello " + name1);
        //Declare Many Variables
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);
        /*
        The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */


        //Java Data Types
        /*

        they are also two types
        1st is primitive data
        2nd is non-primitive data
        primitive is

         */

    }
}
