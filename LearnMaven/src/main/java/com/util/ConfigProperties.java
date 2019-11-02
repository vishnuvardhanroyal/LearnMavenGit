package com.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.logs.GenLog;

public class ConfigProperties {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("username"));
	}

	public static String readProperty(String data) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		GenLog.genLog("info", "property file is loaded");
		return pro.getProperty(data);
	}
}
