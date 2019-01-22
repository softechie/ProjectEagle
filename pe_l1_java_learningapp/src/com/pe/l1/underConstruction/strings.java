package com.pe.l1.underConstruction;

/**
 *
 */
public class strings {
    public static void main(String[] args) {
        String mystring = "This is a string";
        System.out.println("mystring equal " + mystring);
        mystring = mystring + ", this is more.";
        System.out.println("mystring equal " + mystring);
        mystring = mystring + "\u00A9 2015";
        System.out.println("mystring equal " + mystring);

        String numberstring = "250.55";
        numberstring = numberstring + "49.55";
        System.out.println("the result is " + numberstring);

        String laststring = "10";
        int myint = 50;
        laststring = laststring + myint;
        System.out.println("laststring equals " + laststring);
    }
}
