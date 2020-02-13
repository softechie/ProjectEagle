package com.pe.l1.underConstruction;

/**
 *
 */
public class ReadPrintHeapSize {
    public static void main(String[]args)

    {
        //Read Heap Size
        long heapsize=Runtime.getRuntime().totalMemory();

        //Print Heap Size
        System.out.println("HeapSize=" +heapsize);
    }
}
