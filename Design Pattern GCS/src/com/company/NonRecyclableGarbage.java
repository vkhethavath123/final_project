package com.company;

public class NonRecyclableGarbage implements GarbageType {
    @Override
    public void dumpGarbage() {
        System.out.println("Non recyclable garbage has been dumped!");
    }
}
