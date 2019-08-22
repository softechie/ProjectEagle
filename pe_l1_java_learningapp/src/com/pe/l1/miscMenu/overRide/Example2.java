package com.pe.l1.miscMenu.overRide;

//IDIOM:Item-0030: Use final on classes
public final class Example2  {   
    private double re, im; 
  
    public Example2 (double re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
      
  /*   Returns the string representation of this Complex number. 
       The format of string is "Re + iIm" where Re is real part 
       and Im is imagenary part.*/
    @Override
    public String toString() { 
        return String.format(re + " + i" + im); 
    } 
} 