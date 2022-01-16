package com.bilelTrabelsi.Week5Assign;

//9
public class Ap {

	public static void main(String[] args) {
//#10	
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
//#11
		
		AsteriskLogger.log("HELLO");
		AsteriskLogger.error("HI");
		
		
		SpacedLogger.log("SPACE");
		SpacedLogger.error("SPACECRAFT");
	}

}
