package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void facebooktest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actitle=driver.getTitle();
		System.out.println(actitle);
		
	}
}
