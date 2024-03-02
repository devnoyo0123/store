package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 스레드가 실행할 코드
                System.out.println("스레드 실행");
            }
        });

        t1.start();
        t1.join();
        System.out.println("스레드 상태: "+ t1.getState());
    }
}