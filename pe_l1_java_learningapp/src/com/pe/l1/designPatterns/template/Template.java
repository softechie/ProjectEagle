package com.pe.l1.designPatterns.template;

import com.pe.l1.utility.ExitModule;

/**
 * Created by rlawtonj on 5/10/2018.
 */
public class Template {

    public static void intro(){
        System.out.println(" Template Method is a behavioral design pattern and it’s used to create a method stub and " +
                "deferring some of the steps of implementation to the subclasses. Template method defines the steps to " +
                "execute an algorithm and it can provide default implementation that might be common for all or some of " +
                "the subclasses.");
        System.out.println(" In the example below we have two abstract methods; public abstract void buildWalls(); " +
                "and public abstract void buildPillars();. Both methods are implemented and overridden by two concrete " +
                "classes (GlassHouse and WoodHouse). When the application is ran, the HouseTemplate is called and depending " +
                "on the object, the correct type of home will be built.\nExample:\n");

        HousingClient.build();
        ExitModule.pressEnterToExit();
    }
}
