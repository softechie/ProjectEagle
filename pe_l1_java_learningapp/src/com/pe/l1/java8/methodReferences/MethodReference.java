package com.pe.l1.java8.methodReferences;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/11/2018.
 */
public class MethodReference {

    public static void intro(){
        System.out.println(" Java provides a new feature called method reference in Java 8. Method reference is used " +
                "to refer method of functional interface. It is compact and easy form of lambda expression. Each time " +
                "when you are using lambda expression to just referring a method, you can replace your lambda " +
                "expression with method reference. There are three types of method references; instance, static, and " +
                "constructor.");
        System.out.println("Example:\n\tpublic class StaticReference {\n\t\tpublic static void main(String[] args){\n" +
                "\t\t\tBiFunction<Integer, Integer, Integer> product = Multiplication::multiply;\n" +
                "\t\t\tSystem.out.println(\"Product of given number is: \"+product.apply(11, 5));\n" +
                "\t\t}\n\t}\n\tclass Multiplication{\n" +
                "\t\tpublic static int multiply(int a, int b){  \n" +
                "\t\t\treturn a*b;  \n" +
                "\t   }  \n" +
                "}  \n");
        ExitModule.pressEnterToExit();
    }
}
