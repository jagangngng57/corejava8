package com.maersk.ssp;

import java.util.Properties;

public class PiralTalk {

	public static void main(String... arrrrgs) {
		
		Properties p = System.getProperties();
		p.setProperty("pirate", "value");
		String s = p.getProperty("argProp") + "";
		s += p.getProperty("pirate");
		System.out.println(s);
		
	}
}
