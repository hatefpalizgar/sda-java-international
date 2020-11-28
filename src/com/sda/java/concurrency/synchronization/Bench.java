package com.sda.java.concurrency.synchronization;

public class Bench {
    private int availableSeats;

    public synchronized void takeASeat() throws InterruptedException {
        // critical section: a part which we don't want several threads to run at the same time
        if (availableSeats > 0) {
            Thread.sleep(100);
            this.availableSeats--;
            System.out.println("Taking a seat.");
            System.out.println("Free seats available: " + availableSeats);
        } else {
            System.out.println("No more free seats. All taken!");
        }
    }

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
