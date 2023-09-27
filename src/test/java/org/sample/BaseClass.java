package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[] args) {
		System.out.println("java");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
