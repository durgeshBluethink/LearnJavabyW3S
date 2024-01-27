package myThreads;

public class MyConcurrency  extends Thread{
    public static int var = 1;

    public static void main(String[] args) {

        MyConcurrency myConcurrency = new MyConcurrency();

        myConcurrency.start();
        while (myConcurrency.isAlive()){
            System.out.println("waiting...!");
        }
        System.out.println("this is start!"+var);
        var++;
        System.out.println("this is 2nd: "+ var);
    }

    @Override
    public void run() {
        var++;
    }
}