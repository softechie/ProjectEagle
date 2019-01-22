package com.pe.l1.designPatterns.singleton;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/11/2018.
 */
public class Singleton {

    public static void intro(){
        System.out.println("Singleton pattern restricts the instantiation of a class and ensures that only one instance" +
                " of the class exists in the java virtual machine. To implement Singleton pattern, we have different " +
                "approaches but all of them have following common concepts.\n" +
                "\t\t1) Private constructor to restrict instantiation of the class from other classes.\n" +
                "\t\t2) Private static variable of the same class that is the only instance of the class.\n" +
                "\t\t3) Public static method that returns the instance of the class, this is the global access point " +
                "for outer world to get the instance of the singleton class.");
        System.out.println("Example:\n\t// A non thread safe singleton\n" +
                "\tclass NaiveSingleton {\n\t\tprivate static NaiveSingleton instance;\n\t\tprivate NaiveSingleton() {\n" +
                "\t\t}\n\t\tpublic static NaiveSingleton getInstance() {\n\t\t\tif (instance == null) {\n" +
                "\t\t\t\tinstance = new NaiveSingleton();\n\t\t\t}\n\t\t\treturn instance;\n\t\t}\n\t}");
        System.out.println("\t// thread safe non-lazy singleton\n\tclass EagerSingleton {\n\t\tprivate static final " +
                "EagerSingleton instance = new EagerSingleton();\n\t\tprivate EagerSingleton() {\n\t\t}\n\t\tpublic " +
                "static EagerSingleton getInstance() {\n\t\t\treturn instance;\n\t\t}\n\t}");
        System.out.println("\t// thread safe lazy singleton, only created when needed\n\tclass LazySingleton {\n" +
                "\t\tprivate static LazySingleton instance;\n\t\tprivate LazySingleton() {\n\t\t}\n\t\tpublic static " +
                "synchronized LazySingleton getInstance() {\n\t\t\tif (instance == null) {\n\t\t\t\tinstance = new " +
                "LazySingleton();\n\t\t\t}\n\t\t\treturn instance;\n\t\t}\n\t}\n");
        ExitModule.pressEnterToExit();
    }
}
