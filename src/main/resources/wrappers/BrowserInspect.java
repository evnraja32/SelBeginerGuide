package wrappers;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface BrowserInspect {
	
	/**
	 * This method return the expected web element in the web page
	 * 
	 * @param locatorType- {@value - id, name, classname, linktext, partiallinktext, tagname, xpath, cssselector}
	 * @param locatorValue
	 * @return
	 */

	WebElement getWebElementBy(String locatorType, String locatorValue);
	
	/**
	 * This method returns list of expected web elements in the web page
	 * 
	 * @param locatorType- {@value - id, name, classname, linktext, partiallinktext, tagname, xpath, cssselector}
	 * @param locatorValue
	 * @return
	 */
	
	List<WebElement> getListOfWebElementsBy(String locatorType, String locatorValue);

	



}
