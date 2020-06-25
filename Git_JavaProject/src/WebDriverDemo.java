import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\p71402\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://stdipxyvip01.aaa-acg.net/pc/PolicyCenter.do");
       driver.manage().window().maximize();
       driver.findElement(By.id("form-elem-3")).sendKeys("p77196");
       driver.findElement(By.id("form-elem-4")).sendKeys("password123");
      driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/input[2]")).click();
     String title= driver.getTitle();
      driver.close();
      System.out.println("title:"+title);
	}

}
