package com.company;

public class Context {
    private Stats stats;

    public Context(Stats stats) {
        this.stats = stats;
    }

    public void displayStats() {
        stats.calculateGarbageCollectionStats();
    }
}
