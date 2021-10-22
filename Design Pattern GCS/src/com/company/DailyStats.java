package com.company;

public class DailyStats implements Stats {
    @Override
    public void calculateGarbageCollectionStats() {
        System.out.println("Daily " + 100 + " tons of garbage has been collected!");
    }
}
