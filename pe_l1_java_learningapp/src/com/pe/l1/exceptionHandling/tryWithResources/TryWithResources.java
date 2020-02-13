package com.pe.l1.exceptionHandling.tryWithResources;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class TryWithResources {

    public static void intro(){
        System.out.println(" Try-with-resources allows us to declare resources to be used in a try block with the " +
                "assurance that the resources will be closed after execution of that block. Prior to " +
                "try-with-resources, a resource was checked in a finally block if it was not null and closed. However, " +
                "there was no guarantee that resource would close, which could cause additional problems. Multiple " +
                "resources can be declared in a try-with-resources block and any declared resources must implement" +
                " the AutoCloseable interface.\nExample:\n\tprivate static void printFile() throws IOException " +
                "{\n\t\ttry(FileInputStream input = new FileInputStream(\"file.txt\")) {\n\t\t\t // do stuff\n\t\t}\n\t}\n");
        ExitModule.pressEnterToExit();
    }
}
