package threads;

import java.util.concurrent.Exchanger;

public class ThirdThread implements Runnable{
    Exchanger<String> exchanger;
    String message;

    public ThirdThread(Exchanger<String> ex){

        this.exchanger=ex;
        message = "Hello Thread 3!";
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("ThirdThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
