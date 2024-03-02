package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while(true){

                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("락을 획득하려고 함");
                }
            }
        });

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        System.out.println("스레드 상태: "+ t2.getState());
    }
}