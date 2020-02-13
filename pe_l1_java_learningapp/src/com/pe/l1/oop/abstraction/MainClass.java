package com.pe.l1.oop.abstraction;

class MainClass extends AbstractExample
{ 
	//to find area of the circle
    double radius; 
      
    public MainClass(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
    public static void main(String[] args) 
    { 
    	AbstractExample s1 = new MainClass("Red", 2.2); 
    	
          
        System.out.println(s1.toString()); 
         
    }      
} 