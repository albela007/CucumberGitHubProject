import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;

public class SdetTraining_TestCases {

	private WebDriver driver;
	private String baseUrl;
	
	
	
	//Create new member
	
	@Ignore
	@Test
	public void tc_newmember() throws InterruptedException{
		//1.Open Browser(WHICH ???) and navigate to the AUT
		//2.Click on the login button on the sdettraining.com site(on the right hand side)
		//3. Click on Create New Account
		//4.Enter user details
		
		//For Firefox		
		System.setProperty("webdriver.gecko.driver", "C:\\071717\\All Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//For IE
	//	System.setProperty("webdriver.ie.driver", "C:\\071717\\All Jars\\IEDriverServer.exe");
	//	driver = new InternetExplorerDriver();
	
		baseUrl ="http://sdettraining.com" ;
		driver.get(baseUrl + "/trguitransactions/Register.aspx");
		driver.findElement(By.id("MainContent_txtFirstName")).clear();
	    driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("LP");
	    driver.findElement(By.id("MainContent_txtLastName")).clear();
	    driver.findElement(By.id("MainContent_txtLastName")).sendKeys("stu716");
	    driver.findElement(By.id("MainContent_Male")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("MainContent_txtEmail")).clear();
	    driver.findElement(By.id("MainContent_txtEmail")).sendKeys("sdet716@sdettraining.com");
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).clear();
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtHomePhone")).clear();
	    driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("703-123-1234");
	    driver.findElement(By.id("MainContent_txtCellPhone")).clear();
	    driver.findElement(By.id("MainContent_txtCellPhone")).sendKeys("703-123-1235");
	    driver.findElement(By.id("MainContent_txtInstructions")).clear();
	    driver.findElement(By.id("MainContent_txtInstructions")).sendKeys("SDET Training");
	    driver.findElement(By.id("MainContent_btnSubmit")).click();
	    
	    Thread.sleep(3000);
	    
	//	Assert.assertEquals("Customer information added successfully", driver.findElement(arg0));
	}
	
	
	@Ignore
	@Test
	public void tc_login () throws InterruptedException{ {
		
		System.setProperty("webdriver.gecko.driver", "C:\\071717\\All Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	
		
		
		//For IE
		//	System.setProperty("webdriver.ie.driver", "C:\\071717\\All Jars\\IEDriverServer.exe");
		//	driver = new InternetExplorerDriver();
		
		
			baseUrl ="http://sdettraining.com" ;
		
		
		driver.get(baseUrl + "/trguitransactions/default.aspx?id=new");
		
	    driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("MainContent_txtUserName")).clear();
	    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet716@sdettraining.com");
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_btnLogin")).click();	
	    Thread.sleep(3000);
	}
	}
	
	
	@Test
	public void tc_logn_wd() throws InterruptedException {
		
		//Chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\071717\\All Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		
			//Firefox
		//	System.setProperty("webdriver.gecko.driver", "C:\\071717\\All Jars\\geckodriver.exe");
		//	driver = new FirefoxDriver();
		
			
			
			//For IE
			//	System.setProperty("webdriver.ie.driver", "C:\\071717\\All Jars\\IEDriverServer.exe");
			//	driver = new InternetExplorerDriver();
			
			
				baseUrl ="http://sdettraining.com/trguitransactions/default.aspx?id=new" ;
			
			
		//	driver.get(baseUrl + "/trguitransactions/default.aspx?id=new");
			driver.get(baseUrl);
			
		    driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
		    
		    //finding element using xpath
		    driver.findElement(By.xpath("//*[@id='MainContent_txtUserName']")).sendKeys("sdet716@sdettraining.com");
		    
		    //finding element using name field on firebug
		    driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("Password");
		    
		    driver.findElement((By.xpath("//*[@id='MainContent_btnLogin']"))).click();
		    Thread.sleep(3000);
		    
		    String vExpected ="Welcome back!";
		    String vActual ;
		    
		    vActual = driver.findElement(By.id("MainContent_lblid")).getText();
		    
		    System.out.println("Value we are reading is.." +vActual);
		    
		    Assert.assertEquals(vExpected, vActual);
		    
		    if (vExpected.equals(vActual)) {
		    	System.out.println("All Good...Test passed");
		    		    	
		    }
		    else {
		    	System.out.println("Something went wrong");
		    }
		    
		    
		    
		   /* Thread.sleep(3000);
		    driver.findElement(By.id("MainContent_txtUserName")).clear();
		    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet716@sdettraining.com");
		    
		    driver.findElement(By.id("MainContent_txtPassword")).clear();
		    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
		    driver.findElement(By.id("MainContent_btnLogin")).click();	
		    Thread.sleep(3000);*/
		
	}


	private Object xpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}