package ThreadPractice;

import java.util.Collection;

public class TestThread extends Thread{


    public static void main(String[] args) {

        System.out.println("This is a thread itself");

        TestThread th = new TestThread();
        Thread t = new Thread(th);
        t.start();



    }

    @Override
    public void run() {
        System.out.println("This code will be executed in a separate thread");
    }
}
