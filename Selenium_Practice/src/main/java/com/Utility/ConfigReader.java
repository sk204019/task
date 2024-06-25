package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties properties;

	public ConfigReader() {
		try {
			FileInputStream file = new FileInputStream("config.properties");
			properties = new Properties();                                  
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
