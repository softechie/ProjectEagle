package com.pe.l1.memoryManagment.garbageCollection;


import com.pe.l1.utility.ExitModule;

public class GarbageCollection {

  public static void intro() {
    System.out.println(" Garbage Collection is process of reclaiming the runtime unused memory automatically. In other " +
            "words, it is a way to destroy the unused objects. Java handles this automatically through the JVM. Garbage " +
            "collection is performed by a daemon thread. If you want to invoke the Garbage Collector you can call " +
            "\"System.gc()\". The gc thread calls the finalize() method before object is garbage collected.\nExample:");

    new TestGC().startGC();
    System.out.println("\tGarbage Collector scheduled and back in main method\n\n\tTestGC@---- is the address" +
            " to the object.");
    ExitModule.pressEnterToExit();
  }
}

class TestGC {
  private long time;

  @Override
  public void finalize(){
    System.out.println("\t\t"+this.toString());
    System.out.println("\t\tTime to complete: " + (System.currentTimeMillis() - time) + " ms");
  }
  public void startGC(){
    TestGC s1=new TestGC();
    System.out.println("\tObject s1 created");
    TestGC s2=new TestGC();
    System.out.println("\tObject s2 created");
    time = System.currentTimeMillis();
    s1=null;
    s2=null;
    System.out.println("\ts1 and s2 set to null");
    System.out.println("\tCall System.gc() and schedule garbage collection");
    System.gc();
  }
}
