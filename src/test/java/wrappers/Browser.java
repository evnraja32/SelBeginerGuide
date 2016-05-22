package wrappers;

public interface Browser {
	/**
	 * The method loadObjects should load the object properties saved in object.properties file
	 * contents of object.properties file are the locators which we should be using 
	 * for locating the web elements should be saved in this properties file
	 * 
	 * @author E V N Raja
	 * {@value
	 * Login.UserName.Id=username
	 * Login.Password.Id=password
	 * Login.LoginButton.Class=decorativeSubmit
	 * }
	 * 
	 */
	void loadObjects();
	/**
	 * The launchBrowser method should launch the desired browser
	 * with DesiredCapabilities followed by loading the Url
	 * and then maximises the window, prepares the WindowHandle() of the parent window
	 * and stores it for future use returns a boolean value - true after successful  launch of site
	 *  
	 * 
	 * @see DesiredCapabilites
	 * @param browser
	 * @return boolean
	 */
	boolean launchBrowser(String browser);
	void browserWait(int timeInSec);
	void closeTheWindow();
	void quitTheBrowser();

}
