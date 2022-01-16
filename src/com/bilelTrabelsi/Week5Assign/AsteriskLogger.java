package com.bilelTrabelsi.Week5Assign;

//#3
	//a

public class AsteriskLogger implements Logger {

//#4
	@Override
	public void log(String str) {
		System.out.println("*** " + str + " ***");
		}

//#5
	

	@Override
	public void error(String str) {
	System.out.println("*******************"+ "\n*** ERROR:  " + str + "***" + "\n**************" );
	
		
	}

}
