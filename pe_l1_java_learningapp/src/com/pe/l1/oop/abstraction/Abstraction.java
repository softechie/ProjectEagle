
package com.pe.l1.oop.abstraction;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class Abstraction {

    public static void into(){
        System.out.println(" In Object-oriented programming, abstraction is a process of hiding the implementation " +
                "details from the user, only the functionality will be provided to the user. In other words, the user " +
                "will have the information on what the object does instead of how it does it." +
                "\n In Java, abstraction is achieved using abstract classes and interfaces.");
        System.out.println("Example:\n\n\tinterface Runner {\n\t\tvoid run();\n\t}\n");
        System.out.println("\tpublic class Person implements Runner {\n\t\t@Override\n\t\tpublic void run() {\n\t\t \\\\do " +
                "running stuff\n\t }\n");
        System.out.println(" The Person class implements the Runner interface and is told the object should run, but not " +
                "how it should be done. The Person class has to define what run should do.\n");
        ExitModule.pressEnterToExit();
    }
}
