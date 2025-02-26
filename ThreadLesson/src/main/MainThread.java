package main;

import threads.MyThread;
import threads.MyThreadWhile;

import java.util.concurrent.locks.ReentrantLock;

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
        System.out.println(t + " приоритет myThread2: " + myThread2.getPriority());



//        for(int i=1; i < 6; i++)
//            new Thread(new MyThread(), "MyThread " + i).start();


        MyThreadWhile myThreadWhile = new MyThreadWhile();
        Thread myThread3 = new Thread(myThreadWhile,"MyThread");
        myThread3.start();

        try{
            Thread.sleep(1100);

            myThreadWhile.disable();

            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }


        CommonResource commonResource= new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++){

            Thread tCount = new Thread(new CountThread(commonResource, locker));
            tCount.setName("Thread "+ i);
            tCount.start();
        }



        try{
            myThread1.join();
            myThread2.join();
            myThread3.join();
        }
        catch(InterruptedException e){

            System.out.printf("%s has been interrupted", t.getName());
        }

        System.out.printf("%s finished... \n", Thread.currentThread().getName());


    }
}

class CommonResource{

    int x = 0;

//    synchronized void increment(){
//        x = 1;
//        for (int i = 1; i < 5; i++) {
//            System.out.printf("%s x: %d \n", Thread.currentThread().getName(), x);
//            x++;
//            System.out.println("x: " + x + " " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
}

class CountThread implements Runnable{

    ReentrantLock locker;
    CommonResource res;
    CountThread(CommonResource res, ReentrantLock locker){
        this.res=res;
        this.locker = locker;
    }
    public void run(){
        locker.lock();
        res.x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
            res.x++;
        }
        locker.unlock();
    }
}