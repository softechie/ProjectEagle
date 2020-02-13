package com.pe.l1.miscMenu.enumerations;

import java.util.HashMap;
import java.util.Map;

public enum Example2EnumLookup {
	PROD("https://prod.domain/"), SIT("https://sit.domain/"), DEV("https://dev.domain/");
	private String url;

	// IDIOM:Item-0173: Use singular name (not plural)
	Example2EnumLookup(String envUrl) {
		this.url = envUrl;
	}

	public String getUrl() {
		return url;
	}

	// Lookup table
	private static final Map<String, Example2EnumLookup> lookup = new HashMap<>();

	// Populate the lookup table on loading time
	static {
		for (Example2EnumLookup env : Example2EnumLookup.values()) {
			// IDIOM: Item-9002: Remove unnecessary parentheses
			lookup.put(env.getUrl(), env);
		}
	}
	// IDIOM:Item-0172: Add a static lookup method

	// This method can be used for lookup purpose
	public static Example2EnumLookup get(String url) {
		return lookup.get(url);

	}
}
