package com.pe.l1.miscMenu.overRide;

class Example1 {

	    
	    String name; 
	    int id; 
	      
	    Example1(String name, int id) 
	    { 
	          
	        this.name = name; 
	        this.id = id; 
	    } 
	      
	    @Override
	    public boolean equals(Object obj) 
	    { 
	          
	    // if both the object references are  
	    // referring to the same object. 
	    if(this == obj) 
	            return true; 
	          
	        // it checks if the argument is of the  
	        // type 'example' by comparing the classes  
	        // of the passed argument and this object. 
	       
	        if(obj == null || obj.getClass()!= this.getClass()) 
	            return false; 
	          
	        // type casting of the argument.  
	        Example1 example = (Example1) obj; 
	          
	        // comparing the state of argument with  
	        // the state of 'this' Object. 
	        return (example.name.equals(this.name)  && example.id == this.id); 
	    } 
	      
	    @Override
	    public int hashCode() 
	    { 
	          
	        // We are returning the example_id  
	        // as a hashcode value. 
	        // we can also return some  
	        // other calculated value or may 
	        // be memory address of the  
	        // Object on which it is invoked.  
	        // it depends on how you implement  
	        // hashCode() method. 
	        return this.id; 
	    } 
	      
	} 














