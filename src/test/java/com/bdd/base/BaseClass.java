package com.bdd.base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

	
	
	public class BaseClass {
		
		public static WebDriver driver;
		public static void initialize(String browser) {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
			}else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
			}else if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			driver.get("https://demo.openmrs.org/openmrs/");
			driver.manage().window().maximize();
		}
		public static void CaptureScreenShot(String filename) {
			try {
				File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(s, new File("C:\\Users\\Dell\\eclipse-workspace\\BDD_openmrs\\src\\test\\resources\\Screens"+filename+".png"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			
		}

	}



