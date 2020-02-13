package com.pe.l1.designPatterns.template;


public class HousingClient {
	
	public static void build(){
		// build a WoodenHouse using the template
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		System.out.println("************\n");

		// build a GlassHouse using the template
		houseType = new GlassHouse();
		houseType.buildHouse();
	}
}
