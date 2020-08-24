import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
/* this is 
 * my name 
 *  jjjjj
 *  */
public class test001 {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Driver\\chromedriver.exe"); 
	   WebDriver driver=new ChromeDriver();  
	   driver.navigate().to("http://www.javatpoint.com/");  
   
   }

}
