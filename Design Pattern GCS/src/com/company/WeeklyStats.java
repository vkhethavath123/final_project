package com.company;

public class WeeklyStats implements Stats {
    @Override
    public void calculateGarbageCollectionStats() {
        System.out.println("Weekly " + 7 * (100) + " tons of garbage has been collected!");
    }
}
