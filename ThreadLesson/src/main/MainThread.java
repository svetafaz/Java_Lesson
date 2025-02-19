package main;

import threads.MyThread;

public class MainThread {
    public static void main(String[] args) {
        // Создаём поток через MyThread extends Thread
        // Thread myThread1 = new MyThread("Thread1"));

        // Создаём поток через MyThread implements Runnable
        Thread myThread1 = new Thread(new MyThread(), "Thread1");
        myThread1.setPriority(7);

        Runnable rThread = () -> {
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            Thread t = Thread.currentThread();
            System.out.println(t);
            try{
                System.out.println(Thread.currentThread().getName() + " уснул");
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };

        Thread myThread2 = new Thread(rThread, "Thread2");
        myThread2.setPriority(7);

        System.out.printf("%s started... \n", Thread.currentThread().getName());

        Thread t = Thread.currentThread();
        System.out.println(t);

        myThread1.start();


        System.out.println(t + " приоритет myThread1: " +  myThread1.getPriority());

        myThread2.start();
        System.out.println(t + " приоритет myThread2 " + myThread2.getPriority());



        for(int i=1; i < 6; i++)
            new Thread(new MyThread(), "MyThread " + i).start();



        try{
            myThread1.join();
            myThread2.join();
        }
        catch(InterruptedException e){

            System.out.printf("%s has been interrupted", t.getName());
        }


        System.out.printf("%s finished... \n", Thread.currentThread().getName());

    }
}