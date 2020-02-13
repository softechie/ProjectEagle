package com.pe.l1.oop.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		// creating instance of Account class
		EncapsExample acc = new EncapsExample();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("ABCD");
		acc.setEmail("ABCD@gmail.com");
		acc.setAmount(500000f);
		
		// getting values through getter methods
		System.out.println("Account Number:"+acc.getAcc_no()  + "\n" +"Account HolderName:"+ acc.getName() +"\n"
		+ "Email:"+ acc.getEmail() + "\n" + "Balance:"+acc.getAmount());
	}
}
