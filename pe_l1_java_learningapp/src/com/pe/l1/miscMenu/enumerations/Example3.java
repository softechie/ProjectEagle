package com.pe.l1.miscMenu.enumerations;

class  Example3 { 
    public enum Day { MON, 
                      TUE, 
                      WED, 
                      THU, 
                      FRI, 
                      SAT, 
                      SUN } 
    public static void main(String[] args) 
    { 
        Day d = null; 
  
     
       System.out.println("---EXAMPLE3---");
       System.out.println("Here is an example to demonstrate :Constant value should always come first in comparison\n");
       System.out.println("---OUTPUT---");
  
        // Comparing an enum member with null 
        // using .equals() method 
       
        //IDIOM:Item-9001:Move Constant on left side of equals expression
        System.out.println((Day.MON).equals(d)); 
    } 
} 
