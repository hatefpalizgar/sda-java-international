package com.sda.java.concurrency.quiz;

public class Main {
    // 5 threads: main thread + line 6,7,8,9
    // what is the output?
    // 2X printing 1..100
    // 2X printing A..Z
    // 1X printing a..z

//   ** HomeWork: Try to print all items belonging to each run method in an ordered fashion
     // why using synchronized didn't fixed the issue?
    public static void main(String[] args) {
        new Thread(new R()).start();
        new T().start();
        new Thread(new R()).start();
        new T().start();
        for (char c = 'a'; c<'z';c++)
            System.out.println(c + " " + Thread.currentThread().getName());
    }
}

class T extends Thread {
    @Override
    public synchronized void run(){
        for(int i=1;i<100;i++)
            System.out.println(i);
    }
}

class R implements Runnable {
    @Override
    public synchronized void run() {
            for (char c = 'A'; c < 'Z'; c++)
                System.out.println(c);

    }
}

