package com.pe.l1.java8.lambda;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/11/2018.
 */
public class Lambda {

    public static void intro() {
        System.out.println(" Lambda expressions are introduced in Java 8 and are touted to be the biggest feature of " +
                "Java 8. Lambda expression facilitates functional programming, and simplifies the development a lot.");
        System.out.println(" Lambda expression syntax is \"parameter -> expression body\"");
        System.out.println(" The following are the important characteristics of a lambda expression;\n\t1) Type " +
                "definition of parameters is optional.\n\t2) Parenthesis around a single parameter is optional. " +
                "Multiple parameters must have parenthesis.\n\t3) Curly braces in the expression body is optional if " +
                "only one statement.\n\t4) The keyword \"return\" is optional.\n A Lambda object can be assigned to a " +
                "variable. The variable type would be the functional interface with the method you want to implement. A " +
                "functional interface is an interface with only one abstract method.");
        System.out.println("Example:\n\tinterface MyInterface {\n\t\tString add(int a, int b);\n\t}\n\tpublic " +
                "class myClass {\n\t\tpublic static void main(String[] args) {\n\t\tMyInterface mi = (a,b) -> a+b;" +
                "\n\t\tSystem.out.println(mi.add(2,2));\n\t\t}\n\t}");
        System.out.println(" You don't have to always write a functional interface, the Java library has many to choose " +
                "from. In the next example we use the Consumer interface provided by the Java library.");
        System.out.println("Example:\n\t\tConsumer<String> c = s -> System.out.println(s);\n\t\tc.accept(\"lambda\");\n");
        ExitModule.pressEnterToExit();
    }
}
