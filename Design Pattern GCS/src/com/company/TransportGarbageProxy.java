package com.company;

public class TransportGarbageProxy implements TransportGarbage {
    private boolean isAdmin;
    private TransportGarbageImplementation transportGarbageImplementation;

    public TransportGarbageProxy(String name, String pass) {
        if (name.equals("Admin") && pass.equals("123")) {
            isAdmin = true;
            transportGarbageImplementation = new TransportGarbageImplementation();
        }
    }

    @Override
    public void transportGarbage() {
        if (isAdmin) {
            transportGarbageImplementation.transportGarbage();
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}
