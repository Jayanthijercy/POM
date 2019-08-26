package org.cts;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;
	
	
public static WebDriver lauch() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Temn\\Jay\\Jay\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
}

public static void pushurl(String url) {
	driver.get(url);

}

public static void fill(WebElement e,String name) {

	e.sendKeys(name);
	
}


public static void clk(WebElement clic) {

	clic.click();
}

public static void dropdown(WebElement e,String txt) {

	Select s=new Select(e);
	s.selectByVisibleText(txt);
	
}

public static void txt(WebElement e) throws InterruptedException {
	Thread.sleep(7000);
	String name=e.getAttribute("value");
	System.out.println(name);

}

}
