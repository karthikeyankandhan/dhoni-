package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Lanuch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\Sample\\driver\\geckodriver23.exe");

		WebDriver a = new FirefoxDriver();

		a.get("https://www.facebook.com/");
		String title = a.getTitle();
		System.out.println(title);
		String currentUrl = a.getCurrentUrl();
		System.out.println(currentUrl);

		WebElement findElement = a.findElement(By.id("email"));
		findElement.sendKeys("abc@gmailcom");
		WebElement findEle = a.findElement(By.id("pass"));

		findEle.sendKeys("12345");
	}
}
