package com.pe.l1.designPatterns.mediator;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/11/2018.
 */
public class Mediator {

    public static void intro(){
        System.out.println(" Mediator design pattern is used to provide a centralized communication medium between " +
                "different objects in a system. Mediator design pattern is very helpful in an enterprise application " +
                "where multiple objects are interacting with each other. If the objects interact with each other " +
                "directly, the system components are tightly-coupled with each other that makes maintainability cost " +
                "higher and not flexible to extend easily. Mediator pattern focuses on provide a mediator between " +
                "objects for communication and help in implementing lose-coupling between objects.\n Below is an " +
                "example of chat application and a mediator is used for people to communicate with each other.\nExample:");
        ChatClient.runClient();
        ExitModule.pressEnterToExit();
    }
}
