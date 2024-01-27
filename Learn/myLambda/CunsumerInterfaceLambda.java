package myLambda;



 interface StringFunction{
     String run(String var);
 }
public class CunsumerInterfaceLambda {
    public static void main(String[] args) {
        StringFunction var3 = n->n+"!";
        StringFunction var4 = n -> n + "?";
        printFormatted ( "hello",var3 );
        printFormatted ( "Hello",var4 );

    }
public  static void printFormatted(String var, StringFunction var1){
        String result = var1.run ( var );
    System.out.println (result);
}
}
