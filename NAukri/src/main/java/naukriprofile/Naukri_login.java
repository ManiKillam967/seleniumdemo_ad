package naukriprofile;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri_login 
{
	WebDriver d1 = null;
	@Test(priority = 1)	
	public void open_browser()
	{
		WebDriverManager.chromedriver().setup();
		d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d1.manage().window().maximize();		
	}
	@Test(priority = 2 )
	public void login_naukri() throws InterruptedException
	{
		d1.get("https://www.naukri.com/nlogin/login");
		WebElement U_name = d1.findElement(By.xpath("//input[@type='text' and @id='usernameField']"));
	    U_name.sendKeys("manikillam0308@gmail.com"); 
	    Thread.sleep(2000);
	    WebElement P_name = d1.findElement(By.id("passwordField"));
	    P_name.sendKeys("Mani@Naukri@0308"); 
	    Thread.sleep(2000);
	    WebElement L_button = d1.findElement(By.xpath("//button[@type ='submit'][1]"));
	    L_button.click();
	}
	@Test(priority=3)
	public void  search()
	{
	    Set <String> k1 = d1.getWindowHandles();
	    Iterator p1 = k1.iterator();
	    while(p1.hasNext())
	    {
	    	String w1 = (String) p1.next(); 
	    	System.out.println(w1);
	    }
        // d1.findElement(By.xpath("//*[@id=\"_d65qmvwuuNavbar\"]/div")).click();
		//d1.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]")).click();
	//	d1.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/span")).click();
		String s1= d1.getWindowHandle();
		System.out.println(s1);
		d1.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/button")).click();
	
	}	
	}

