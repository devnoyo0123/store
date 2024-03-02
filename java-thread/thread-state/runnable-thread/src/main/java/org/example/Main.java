package org.example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    for(int i = 0; i< Integer.MAX_VALUE; i++)
                        if( i % 100000000 == 0)
                            System.out.println(Thread.currentThread().getName() + " is running");
                }
            }
        });

        t1.start();
    }
}