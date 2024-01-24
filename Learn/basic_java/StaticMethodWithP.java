package basic_java;

public class StaticMethodWithP {

        // Static method
        public static void myStaticMethod(int x) {

            System.out.println("Static methods can be called without creating objects " + x);
        }

        // Public method
        public void myPublicMethod() {
            System.out.println("Public methods must be called by creating objects");
        }

        // Main method
        public static void main(String[] args) {
            myStaticMethod(5); // Call the static method

            StaticMethodWithP myObj = new StaticMethodWithP(); // Create an object of MyClass
            myObj.myPublicMethod(); // Call the public method
        }
}
