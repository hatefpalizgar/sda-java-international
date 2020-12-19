package com.sda.java.concurrency.synchronization;

public class SeatTakerThread extends Thread {
    private Bench bench;

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }

    @Override
    public void run() {
        try {
            bench.takeASeat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
