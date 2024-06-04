package org.ktn.seleniumfunctions;
import org.ktn.enums.WaitStrategy;
import org.ktn.waits.ExplicitWaitFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.ktn.base.MainBase;

public class SeleniumFunctions extends MainBase {
	
		protected void click(WebElement element, WaitStrategy waitstrategy, String elementname) {
			WebElement element1 = ExplicitWaitFactory.performExplicitWait(waitstrategy, element);
			element1.click();
		}

		
		protected void sendKeys(WebElement element, String value, WaitStrategy waitstrategy, String elementname) {
			WebElement element1 = ExplicitWaitFactory.performExplicitWait(waitstrategy, element);
			element1.sendKeys(value);
		}

		String getPageTitle() {
			return driver.getTitle();
		}

		protected String getElementText(WebElement element, WaitStrategy waitstrategy, String elementname) {
			WebElement element1 = ExplicitWaitFactory.performExplicitWait(waitstrategy, element);

			String text = element1.getText();
			return text;
		}

		Actions act = new Actions(driver);

		public void moveToWebElementElement(WebElement element, String elementname) {
			act.moveToElement(element).build().perform();
		}

		public void scrollToELement(WebElement element, WaitStrategy waitstrategy, String elementname) {
			WebElement element1 = ExplicitWaitFactory.performExplicitWait(waitstrategy, element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element1);
		}

		public void moveToElementClick(WebElement element, String elementname) {
			act.moveToElement(element).click().perform();
		}

		public void sleep(int time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void selectFromDropDown(WebElement element, String strategy, WaitStrategy waitstrategy,  Object value) {
			Select select = new Select (element);
			if(strategy.equalsIgnoreCase("index")) {
				select.selectByIndex((int)value);
			}else if(strategy.equalsIgnoreCase("visibleText")) {
				select.selectByVisibleText((String) value);
			}else if(strategy.equalsIgnoreCase("visibleValue")) {
				select.selectByValue((String) value);
			}
		
		}



}
