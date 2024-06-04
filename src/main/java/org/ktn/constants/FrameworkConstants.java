package org.ktn.constants;

import java.time.Duration;


public final class FrameworkConstants {
	
	
	private FrameworkConstants() {}
	
	private static final Duration EXPLICITWAIT = Duration.ofSeconds(25);
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
	private static final String EXCELPATH = RESOURCESPATH+"/excel/testdata.xlsx";
	

	
	public static String getExcelpath() {
		return EXCELPATH;
	}


	public static Duration getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}


}
