package com.company;

public class GarbageTypeFactory {
    public GarbageType getInstance(String type) {
        if (type.equals("recycle")) {
            return new RecyclableGarbage();
        } else {
            return new NonRecyclableGarbage();
        }
    }
}
