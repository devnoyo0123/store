package org.example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
        System.out.println("스레드 상태: "+ t1.getState());
    }
}