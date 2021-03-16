package Rivershop.Utility;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	
	public static void browserLaunch(String bname)	
	{
		try
		{
		String browsername=bname;
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Maven_Project\\Rivershop\\chromedriver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
		}		
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void openURL(String websiteURL)
	{	
		try
		{
		String URL=websiteURL;
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
	public static void sendkeys(String xpath, String Value )
	{
		try
		{
		String variableXpath=xpath;
		String VariableValue=Value;
		WebElement obj = driver.findElement(By.xpath(variableXpath));
		obj.clear();
		obj.sendKeys(VariableValue);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
	public static void click(String Xpath)
	{
		try
		{
		String clickxpath=Xpath;
		driver.findElement(By.xpath(clickxpath)).click();	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void selectdropdown(String xpath, String value)
	{
		try
		{
		String dropdownXpath=xpath;
		String dropdownValue=value;
		Select dropdownselect= new Select(driver.findElement(By.xpath(dropdownXpath)));
		dropdownselect.selectByVisibleText(dropdownValue);	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
	public static void Validate_pages(String Text, String elementxpath, String Textcases_name) 
	{
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String validationtext=Text;
			String xpathofpage=elementxpath; 
			String Textcasename=Textcases_name;
			String value=driver.findElement(By.xpath(xpathofpage)).getText();	

			
			if(validationtext.equals(value))
			{
				System.out.println(Textcasename+ " : Test Case Passed");
			}
			else
			{
				System.out.println(Textcasename+ " : Test Case Failed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
	}
	public static void browserClose()
	{
		try
		{		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.close();
		
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
