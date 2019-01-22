package com.pe.l1.oop.inheritance;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class Inheritance {

    public static void intro(){
        System.out.println(" Inheritance is the mechanism that permits new classes to be created " +
                "out of existing classes by extending and refining its capabilities. The existing classes" +
                " are called the base classes/parent classes/super-classes, and the new classes are called " +
                "the derived classes/child classes/subclasses. The subclass can inherit or derive the attributes and " +
                "methods of the super-class(es) provided that the super-class allows so. Besides, the subclass may add " +
                "its own attributes and methods and may modify any of the super-class methods. Inheritance defines an " +
                "\"is – a\" relationship.\n");
        System.out.println("Example:\n\tpublic class Parent{\n\t\tString name;\n\t\tpublic void behavior(){\n\t}\n");
        System.out.println("\tclass Child extends Parent {\n\t\t}\n");
        System.out.println(" Here the Child class \"extends\" the Parent class and inherits the attributes and methods " +
                "of the Parent class.\n");
        ExitModule.pressEnterToExit();
    }
}
