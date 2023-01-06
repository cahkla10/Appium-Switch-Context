package helpers;

public class GlobalVariables {
    public static final int TIMEOUT = 60;
    public static final String USERDIR = System.getProperty("user.dir");
    public static final String APPIUMURL = "http://0.0.0.0:4723/wd/hub";
    public static final String CHROMEDRIVER = USERDIR + "/src/test/resources/webdriver/chromedriver_242.exe";
    public static final String EGEDRIVER = USERDIR + "/src/test/resources/webdriver/msedgedriver.exe";
    public static final String FIREFOXDRIVER = USERDIR + "/src/test/resources/webdriver/geckodriver.exe";
}