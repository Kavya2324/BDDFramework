package org.ktn.base;

import org.ktn.utils.PropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBase {
	
	public static PropertyFile prop = new PropertyFile();
	
	public static WebDriver driver;
	
	public static void launchBroswer() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}

}
