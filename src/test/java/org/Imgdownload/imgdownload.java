package org.Imgdownload;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imgdownload {
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//selenium 3
  ChromeOptions cc=new ChromeOptions();
		String ss= System.getProperty("user.dir")+"src\\test\\resources";
		 Map<String, Object>mp=new LinkedHashMap<String, Object>();
		   mp.put("profile.default_content_settings.popups", 0); 
		   mp.put("download.default_directory", ss);
		
		cc.setExperimentalOption("prefs", mp);
		
	WebDriver driver =new ChromeDriver(cc);		
	driver.get("https://samplelib.com/sample-jpeg.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  driver.findElement(By.xpath("//a[@href='https://download.samplelib.com/jpeg/sample-clouds-400x300.jpg']")).click();	  
	  
//  "C:\Users\riyazuddin\Downloads\sample-clouds-400x300 (1).jpg"
	  
	  
	  
	  
	  
	  
	  
	  
}
}