package com.pe.l1.oop.abstraction;


abstract class AbstractExample 
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public AbstractExample(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 