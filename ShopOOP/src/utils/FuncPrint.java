package utils;

import model.User;

import static java.lang.System.currentTimeMillis;

public class FuncPrint extends Logger {

    public static void print (User mes) {
        System.out.println(mes);
    }
    public static void print (String mes) {
        System.out.println(mes);
    }
    public static void print (int mes) {
        System.out.println(mes);
    }

    @Override
    public void log() {
        print(String.valueOf(currentTimeMillis()));
    }
}
