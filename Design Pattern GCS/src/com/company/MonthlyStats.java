package com.company;

public class MonthlyStats implements Stats {
    @Override
    public void calculateGarbageCollectionStats() {
        System.out.println("Monthly " + 30 * (100) + " tons of garbage has been collected!");
    }
}
