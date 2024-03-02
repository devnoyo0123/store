package org.example;

public class Main {
    public static void main(String[] args) {


            for(int i = 0; i < 3; i++) {
                Thread t = new Thread(new MyRunnable(i));
                t.start();
            }
            System.out.println("Main thread is ending");
    }
}

class MyRunnable implements Runnable {

    private final int threadId;

    public MyRunnable(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        firstMethod(threadId);
    }

    private void firstMethod(int threadId) {
        int localValue = threadId + 100;
        secondMethod(localValue);
    }

    private void secondMethod(int localValue) {
        String objectReference = "The value is " + localValue;
        System.out.println(Thread.currentThread().getName() + " is running" + " 스레드 ID: " + threadId + " 로컬 값: " + localValue);
    }
}
