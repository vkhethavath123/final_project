package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Testing {

    @Test
    public void testFactoryDesignPattern(){
        GarbageTypeFactory garbageTypeFactory=new GarbageTypeFactory();
        GarbageType garbageType=garbageTypeFactory.getInstance("Recyclable");

        assertNotEquals(garbageType,null);
    }

    @Test
    public void testSingletonDesignPattern(){
        Garbage g1=Garbage.getInstance();
        Garbage g2=Garbage.getInstance();

        assertEquals(g1,g2);
    }

}
