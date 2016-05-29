package factorysamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SendKeys {
  @Test
  public void f() {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  
	  WebElement webElement = driver.findElementByName("q");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  //for sendKeys
	  js.executeScript("arguments[0].setAttribute('value','facebook')",webElement);
	  
	  //for making border red color
	  js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;')",webElement);
	  
	  webElement.getAttribute("value");
	  
	  
	  
  }
}
