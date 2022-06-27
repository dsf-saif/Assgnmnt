package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hclass 
{
	public static WebDriver d;
	

@Before
public void ini()
{
	System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
	d=new ChromeDriver();
	System.out.println("Webdriver is initialised.");
	
}

@After
public void quit()
{
	d.quit();
	System.out.println("Driver is closed");
}


}
