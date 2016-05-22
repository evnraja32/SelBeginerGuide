package wrappers;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface BrowserInspect {
	
	/**
	 * 
	 * @param locatorType- {@value - id, name, classname, linktext, partiallinktext, tagname, xpath, cssselector}
	 * @param locatorValue
	 * @return
	 */

	WebElement getWebElementBy(String locatorType, String locatorValue);
	
	List<WebElement> getListOfWebElementsBy(String locatorType, String locatorValue);

	



}
