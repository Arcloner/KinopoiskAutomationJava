package automationFramework.Waiters;


import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Waiter {
	
	private WebDriver driver;
	
	private FluentWait<WebDriver> wait;
	
	public Waiter(WebDriver driver)
	{
		this.driver=driver;	
		this.wait=new FluentWait<WebDriver>(this.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);		
	}
	
	public void WaitForElementIsClickable(WebElement element)
    {       
		wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	public void WaitForDOMLoad() {				
		
	}
}
