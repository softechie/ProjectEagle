package com.pe.l1.java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
    
public class MainClass {

	public static void main(String[] args) {
	     
		ArrayList<Student> al=new ArrayList<Student>();    
		 al.add(new Student(101,"Vijay",23));    
		 al.add(new Student(106,"Ajay",27));    
		 al.add(new Student(105,null,21));  
		 
		 System.out.println("Following example demonsrates the use of Comparator");
		 System.out.println("It sorts the list of elements based on Student name,roll no and Age\n");
		 System.out.println("---OUTPUT---");
		 
		 //IDIOM:Item-0042: Explicitly decide where nulls go (eg. first or last)
		//IDIOM:Item-0043: Prefer Comparator over "implements Comparable"
		 Comparator<Student> cm1=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));  
		  Collections.sort(al,cm1);  
		  System.out.println("Considers null to be less than non-null");  
		  for(Student st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }
		  
		 //IDIOM:Item-0040: Comparators should be named after the field(s) they compare
		 //IDIOM:Item-0041: Prefer Java8 Comparator.comparing to legacy approaches or Guava ordering
		  Comparator<Student> cm2=Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));  
		  Collections.sort(al,cm2);  
		  System.out.println("Considers null to be greater than non-null");  
		  for(Student st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		
		     }  

	

}
}