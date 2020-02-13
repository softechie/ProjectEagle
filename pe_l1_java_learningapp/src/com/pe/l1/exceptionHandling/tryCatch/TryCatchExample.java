package com.pe.l1.exceptionHandling.tryCatch;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class TryCatchExample {

    public static void intro(){
        System.out.println(" A method catches an exception using a combination of the try and catch keywords. A try/catch " +
                "block is placed around the code that might generate an exception. After the catch keyword the exception " +
                "type is defined and a variable name in parentheses. When an exception occurs an object of that exception class is created." +
                "");
        System.out.println("Example:\n\tint i = new int[5];\n\ttry {\n\t\tSystem.out.println(\"Index value at 5 is \" " +
                "+i[5]);\n\t} catch (ArrayIndexOutOfBoundsException e) {\n\t\te.printStackTrace;\n\t}");
        System.out.println(" The following code has an error when accessing the Array index of [5]. An ArrayIndexOutOfBound exceptions " +
                "is created and caught by the catch block. Then the statement e.printStackTrace displays the stacktrace.\n");
        System.out.println(" One thing to add is a \"finally\" block can be added to a try/catch statement. A finally " +
                "block is ran no matter if an exception is produced or not. The only time the finally block does not " +
                "execute is when the JVM exits or the thread of the try/catch has ended. The finally block is a good " +
                "place to close resources if needed.\n");
        ExitModule.pressEnterToExit();
    }
}
