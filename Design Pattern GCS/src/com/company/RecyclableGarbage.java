package com.company;

public class RecyclableGarbage implements GarbageType {
    @Override
    public void dumpGarbage() {
        System.out.println("Recyclable garbage has been dumped!!");
    }
}
