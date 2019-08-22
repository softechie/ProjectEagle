package com.pe.l1.underConstruction1;

/**
 *
 */
public class testgarbage {
    public static void main(String[] args) {
        int SIZE = 100;
        for (int i = 0; i < SIZE; i++) {
        }
        System.out.println("Garbage Collection started");
        long time = System.currentTimeMillis();
        System.gc();
        System.out.println("Took " + (System.currentTimeMillis()-time) + " ms");
    }


}
