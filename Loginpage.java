package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	
		
		public static WebDriver driver = null;
			public static WebDriver chromeOptions = null;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
//				ChromeOptions option=new chromeOptions();
				
				driver = new ChromeDriver();
//				option.addArguments("--remote allow-origin");
				driver.manage().window().maximize();
				
			
				driver.get("https://www.w3schools.com/");
				System.out.println(driver.getTitle());
				
//				driver.findElement(By.linkText("create an account")).click();
				
				
		 
			}
		 
	}


