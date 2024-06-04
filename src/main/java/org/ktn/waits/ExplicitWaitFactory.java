package org.ktn.waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.ktn.base.MainBase;
import org.ktn.constants.FrameworkConstants;
import org.ktn.enums.WaitStrategy;
public final class ExplicitWaitFactory extends MainBase {
	
	private ExplicitWaitFactory() {}

	
	public static WebElement performExplicitWait(WaitStrategy waitstrategy, WebElement element1) {
		WebElement element = null;
		if(waitstrategy == WaitStrategy.CLICKABLE) {
			element = 	new WebDriverWait(driver, FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(element1));
		}
		else if(waitstrategy == WaitStrategy.PRESENCE) {
			element =	new WebDriverWait(driver, FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOf(element1));
		}
		else if(waitstrategy == WaitStrategy.VISIBLE) {
			element =new WebDriverWait(driver, FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOf(element1));
		}
		else if(waitstrategy == WaitStrategy.NONE) {
			element = element1;
		}
		return element;
	}
	
	
	

}
