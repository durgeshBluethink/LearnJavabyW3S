package basic_java;

public class InnerClass {

   // private InnerClass.MyClass MyClass;

    public  class MyClass{
     //   public  void print(){
     //       System.out.println ("this is inner class!");
     //   }
     public  static void print(){
         System.out.println ("this is inner class!");
     }

    }

    public static void main(String[] args) {

      // InnerClass myClass = new InnerClass ();
        InnerClass innerClass = new InnerClass ();
      // InnerClass.MyClass my = new MyClass ();
        // static inner class then
       // MyClass my = new MyClass ();

        //innerClass.print();
    }
}
