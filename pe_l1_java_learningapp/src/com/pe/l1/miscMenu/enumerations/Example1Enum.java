package com.pe.l1.miscMenu.enumerations;

public class Example1Enum {
	
//IDIOM:Item-0060: Prefer an Enum over a set of related constants
enum Environ{ 
	
	//IDIOM:Item-0065: Upper case naming
	PROD("https://prod.domain/"), SIT("https://sit.domain/"), DEV("https://dev.domain/");
	
	//IDIOM:Item-0170: Use final on enum properties
		private String url;
		 
	    Environ(String envUrl) {
	        this.url = envUrl;
	    }
	 
	    public String getUrl() {
	        return url;
	    }
	
}
}



