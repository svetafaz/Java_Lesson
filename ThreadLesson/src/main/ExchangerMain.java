package main;

import threads.FourthThread;
import threads.GetThread;
import threads.PutThread;
import threads.ThirdThread;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<String>();
        new Thread(new PutThread(ex)).start();
        new Thread(new ThirdThread(ex)).start();
        new Thread(new GetThread(ex)).start();
        new Thread(new FourthThread(ex)).start();
    }
}
