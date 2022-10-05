package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemoClass {

	
	
	private static Logger logg = LogManager.getLogger(LogDemoClass.class);
	
	
	public static void main(String[] args) {
		
		System.out.println("test");
	logg.info("this is for testing");
		
		
	}

}
