package com.pe.l1.utility;

import java.io.IOException;

/**
 * Created by rlawtonj on 5/9/2018.
 */
public class ExitModule {

    public static void pressEnterToExit()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
