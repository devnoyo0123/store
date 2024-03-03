package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            try {
//                System.out.println("Sleeping for 2 seconds");
//                Thread.sleep(2000);
//                System.out.println("Done sleeping");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        Thread thread1 = new Thread(() -> {
//                        try {
//                System.out.println("Sleeping for 1 seconds");
//                Thread.sleep(1000);
//                System.out.println("Done sleeping");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//                        try {
//                System.out.println("Sleeping for 2 seconds");
//                Thread.sleep(2000);
//                System.out.println("Done sleeping");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        thread1.start();
//        thread2.start();

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Sleeping for 20 seconds");
                Thread.sleep(20000);
                System.out.println("Done sleeping");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        });

        thread.start();

        Thread.sleep(1000);

        thread.interrupt();

    }
}