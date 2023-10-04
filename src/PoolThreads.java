import java.util.ArrayList;

import java.util.Random;

class MyThread extends Thread{

    MyThread(String name){

        super(name);

    }

    public void run(){

        System.out.printf("%s started...\n", Thread.currentThread().getName());

        try {

            Thread.sleep(new Random().nextInt(50000));

        } catch (InterruptedException e) {

            System.out.printf("%s interrupted... \n", Thread.currentThread().getName());

        }

        System.out.printf("%s fiished... \n", Thread.currentThread().getName());

    }

}

public class PoolThreads{

    ArrayList<MyThread> myThreads;

    public PoolThreads(int n) {

        myThreads = new ArrayList<>();

        for(int i = 0; i < n; i++)

            myThreads.add(new MyThread("MyThread" + i));

    }

    public void startAll(){

        for (MyThread myThread:myThreads) {

            myThread.start();

        }

    }

}