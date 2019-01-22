package com.pe.l1.oop.encapsulation;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class Encapsulation {

    public static void into(){
        System.out.println(" Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on " +
                "the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden" +
                " from other classes, and can be accessed only through the methods of their current class. Therefore, " +
                "it is also known as data hiding.");
        System.out.println("Example:\n\n\tpublic class Dog {\n\t\tprivate String name;\n\t\tpublic void setName(String" +
                " name) {\n\t\t\tthis.name = name;\n\t\t}");
        System.out.println("\t\tpublic String getName() {\n\t\t\treturn name;\n\t\t}\n");
        ExitModule.pressEnterToExit();
    }
}
