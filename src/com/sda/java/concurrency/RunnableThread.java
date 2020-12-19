package com.sda.java.concurrency;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside RunnableThread");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
