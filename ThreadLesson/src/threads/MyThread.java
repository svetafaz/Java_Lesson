package threads;

public class MyThread implements Runnable {

    @Override
    public void run() {
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
    }
}
