package com.logs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GenLog {
	
	public static void main(String[] args) {
		
		Logger log1=Logger.getLogger("GenLog");
		PropertyConfigurator.configure("Log4j.properties");
		log1.info("hi welcome to log4j");
		log1.warn("hi this is warn message");
		log1.error("this is error message");
		log1.fatal("this is fatal message");
		log1.debug("this is debug message");
	}
	
	public static void genLog(String key, String message) {
		Logger log=Logger.getLogger("GenLog");
		PropertyConfigurator.configure("Log4j.properties");
		switch (key) {
		case "info":
			log.info(message);
			System.out.println(message);
			break;
		case "error":
			log.error(message);
			System.out.println(message);
			break;
		case "warn":
			log.warn(message);
			System.out.println(message);
			break;
		default:
			System.out.println(message);
			break;
		}
	}

}
