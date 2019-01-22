package com.pe.l1.exceptionHandling.exceptions;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class Exceptions {

    public static void intro(){
        System.out.println(" An exception (or exceptional event) is a problem that arises during the execution of a " +
                "program. When an Exception occurs the normal flow of the program is disrupted and the program/Application " +
                "terminates abnormally, which is not recommended, therefore, these exceptions are to be handled. Exceptions handling " +
                "is discussed in other modules, but you should have an understanding of the different types of exceptions.");
        System.out.println("******Exception Hierarchy******\n\n");
        System.out.println("\t\t\t\t\t\t ----------Throwable-----------\n\t\t\t\t\t\t |\t\t\t\t\t\t\t  |\n\t\t\t\t  ---Exception---\t\t\t\t\tError");
        System.out.println("\t\t\t\t |\t\t\t\t|\n\t  Checked Exception\tUnchecked Exception\n\t  (Compile time)\t(Runtime)\n");
        System.out.println("Examples of checked exceptions: ClassNotFoundException, EOFException, FileNotFoundException");
        System.out.println("Examples of unchecked exceptions: IndexOutOfBoundsException, ArithmeticException, NullPointerException");
        System.out.println("Checked and unchecked exceptions are recoverable with handling. It is not recommended to handle error exceptions.\n");
        ExitModule.pressEnterToExit();
    }
}
