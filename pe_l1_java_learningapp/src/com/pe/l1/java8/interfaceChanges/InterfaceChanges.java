package com.pe.l1.java8.interfaceChanges;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/11/2018.
 */
public class InterfaceChanges {

    public static void intro(){
        System.out.println(" Java 8 interface changes include static methods and default methods in interfaces. Prior " +
                "to Java 8, we could have only method declarations in the interfaces. But from Java 8, we can have " +
                "default methods and static methods in the interfaces.");
        System.out.println("Example:\n\tinterface MyInterface {\n" +
                "\t\t// all methods public by default\n\t\t// needs to be overridden\n\t\tvoid myMethod();\n\t\t\n" +
                "\t\t// does not need to be overridden\n\t\tdefault void otherMethod(){\n\t\t\tSystem.out.println(\"" +
                "This is from default interface method\");\n\t\t}\n\n\t\t// static, does not need to be overridden" +
                "\n\t\tstatic void staticMethod(){\n\t\t\tSystem.out.println(\"This is from static interface method" +
                "\");\n\t\t}\n\t}\n");
        ExitModule.pressEnterToExit();
    }
}
