package smpl_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WindowType;

public class TrendMicroLogs_Status {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Documents//chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		// Solutions1 Server
		driver.get("http://103.3.62.145:14942");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("tfPassword")).sendKeys("Baryons@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='SUBMIT']")).click();
		Thread.sleep(7000);
		
		// Old IWEB 
		driver.navigate().to("http://45.79.121.105:14942");
		driver.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
		driver.findElement(By.xpath("//*[@type='SUBMIT']")).click();
		Thread.sleep(7000);
		
		driver.close();
		
		
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver1=new ChromeDriver(option);
		// Solutions 2 Server
		
				driver1.get("https://solutions2.baryons.net:14943");
				driver1.manage().window().maximize();
				Thread.sleep(5000);
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// Sales gig
				driver1.navigate().to("https://47.91.105.178:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// Pos Staging
				driver1.navigate().to("https://47.91.125.151:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				
				// Groosh New
				driver1.navigate().to("https://47.91.127.165:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				
				// Solutions3 Server
				driver1.navigate().to("https://solutions3.baryons.net:14943");
				Thread.sleep(7000);
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				// Staging Server
				driver1.navigate().to("https://staging.baryons.net:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				Thread.sleep(5000);
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
//				// Hosting Server
				driver1.navigate().to("https://hosting.baryons.net:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// DellProduct Selector Server
				driver1.navigate().to("https://staging2.baryons.net:14943");
				//Thread.sleep(350);
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// DellMboConnect Server
				driver1.navigate().to("https://dellmboconnect.co.in:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// DesConnect Server
				driver1.navigate().to("https://139.162.32.246:14943/");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// Dell Service tag server
				driver1.navigate().to("https://192.46.210.212:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// GreyCaps server
				driver1.navigate().to("https://172.104.41.238:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// GreyCaps Jam
				driver1.navigate().to("https://139.162.43.200:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// GreyCaps GFFTE
				driver1.navigate().to("https://172.105.39.56:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);
				
				// CCRH UAT Server
				driver1.navigate().to("https://172.104.45.181:14943");
				driver1.findElement(By.xpath("//*[@class='BUTTON']")).sendKeys("Baryons@123");
				driver1.findElement(By.xpath("//*[@type='SUBMIT']")).click();
				Thread.sleep(7000);			
				
				driver1.close();	
		
	}

}
