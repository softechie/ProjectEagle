package com.pe.l1.designPatterns.template;

// This class extends the HouseTemplate class and @Overrides the abstract methods
public class GlassHouse extends HouseTemplate{
	//IDIOM:Item-0010: Use reasonable defaults, but allow them to be overridden
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");	
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

}
