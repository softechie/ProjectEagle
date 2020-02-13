//IDIOM:Item-0368: Use underscore to separate words in package names
package com.pe.l1.exception_Handling.throwVsThrows;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class ThrowVsThrows {

    public static void intro() {
        System.out.println(" You can throw an exception, either a newly instantiated one or an exception that you just " +
                "caught, by using the \"throw\" keyword.\n Example:\n\tpublic class Calc {\n\t\tpublic " +
                "void divide(int a, int b) {\n\t\t\tif(b==0)\n\t\t\t\tthrow new ArithmeticException(\"/ by zero\");\n\t\t}\n\t}");
        System.out.println(" If a method does not handle a checked exception, the method must declare it using the " +
                "\"throws\" keyword. The throws keyword appears at the end of a method's signature.\nExample:\n\tpublic " +
                "class FileUtility {\n\t\tpublic List<Person> readFile() throws FileNotFoundException {\n\t\t\t// do stuff\n\t\t" +
                "}\n\t}\n");
        ExitModule.pressEnterToExit();
    }
}
