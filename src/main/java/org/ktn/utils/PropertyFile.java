package org.ktn.utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.ktn.base.MainBase;

import java.io.*;

public class PropertyFile extends MainBase {
	
	public PropertyFile() {}
		
	public static Properties prop;
	
	public Properties getProp() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"./src/test/resources/Properties/userdata.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
