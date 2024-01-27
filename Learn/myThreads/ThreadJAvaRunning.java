package myThreads;
class MyRunnable implements Runnable {
    public void run() {
        // Your thread's code goes here
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}
public class ThreadJAvaRunning {
    public static void main(String[] args) {
        // Create an instance() of your class
        MyRunnable myRunnable = new MyRunnable();
        // Wrap it with a Thread
        /*
        Now, create a Thread object and give your object (the instance of MyRunnable) to the Thread's constructor.
        At this point, your Thread object knows what task it should run (because it's associated with your MyRunnable object).
         */
        Thread thread = new Thread(myRunnable);
        //start thread
        thread.start();


    }
}
