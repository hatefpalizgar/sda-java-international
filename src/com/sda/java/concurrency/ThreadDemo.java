package com.sda.java.concurrency;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Main thread starts: " + Thread.currentThread().getName());
//        Thread.sleep(5000);
//        System.out.println("Main thread is still running");
//        Thread.sleep(5000);
//        System.out.println("Main thread ends");

        StopWatchThread myStopWatch = new StopWatchThread();
        StopWatchThread myStopWatch2 = new StopWatchThread();

        // NEVER call run() of threads yourself
        // A thread is started only by calling its start() method
        // order of execution is NOT guaranteed
//        myStopWatch.start();
//        myStopWatch2.start();

        Runnable myRunnableThread = new RunnableThread();
//          myRunnableThread.run();

        Thread myRunnableThreadUsingThreadClass = new Thread(myRunnableThread);
        myRunnableThreadUsingThreadClass.start();
    }
}

