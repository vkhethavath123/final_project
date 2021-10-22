package com.company;

public class Garbage {
    private static Garbage garbage = new Garbage();

    private Garbage() {

    }

    public static Garbage getInstance() {
        return garbage;
    }

    public void printMenu() {
        System.out.println("1. Dump garbage");
        System.out.println("2. State garbage collection figures");
        System.out.println("3. Transport garbage");
        System.out.println("4. Exit");
    }

    public void dumpGarbage(String type) {
        GarbageTypeFactory garbageTypeFactory = new GarbageTypeFactory();
        GarbageType garbageType = garbageTypeFactory.getInstance(type);
        garbageType.dumpGarbage();
    }

    public void displayStats(int which) {
        if (which == 1) {
            Context context = new Context(new DailyStats());
            context.displayStats();
        }
        if (which == 2) {
            Context context = new Context(new WeeklyStats());
            context.displayStats();
        }
        if (which == 3) {
            Context context = new Context(new MonthlyStats());
            context.displayStats();
        }
    }

    public void transportGarbage(String name, String pass) {
        TransportGarbageProxy transportGarbageProxy = new TransportGarbageProxy(name, pass);
        transportGarbageProxy.transportGarbage();
    }
}
