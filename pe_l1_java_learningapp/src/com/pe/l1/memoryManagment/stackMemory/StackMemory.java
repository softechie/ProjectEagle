package com.pe.l1.memoryManagment.stackMemory;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class StackMemory {

    public static void intro(){
        System.out.println("Stack memory is responsible for holding references to heap objects and for storing " +
                "value types (also known in Java as \nprimitive types), which hold the value itself rather than a " +
                "reference to an object from the heap.\n");
        ExitModule.pressEnterToExit();
    }
}
