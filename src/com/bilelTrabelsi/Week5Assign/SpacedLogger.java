package com.bilelTrabelsi.Week5Assign;

//#3
	//b
public class SpacedLogger implements Logger {

	
//#6 #7
	@Override
	public void log(String str) {
		
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
	}
	
//8

	@Override
	public void error(String str) {
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
	}
	


}
