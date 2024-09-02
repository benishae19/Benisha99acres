package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class commercial {
	@FindBy(xpath="//a[text()='For Buyers']")
	WebElement forBuyer;
	public void forBuyer() {
		forBuyer.click();
	}
	
	@FindBy(xpath="(//span[@class='pageComponent'])[3]")
	WebElement commercial;
	public void commercial () {
		commercial.click();
	}
	@FindBy(xpath="//a[@data-custominfo='{\"custom_object\":{\"url\":\"/commercial-shops-in-hyderabad-ffid\",\"tab\":\"For Buyers\"}}']")
	WebElement shops;
	public void shops() {
		shops.click();
	}
	@FindBy(xpath="//*[@id=\"7171\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/a")
	WebElement shopAvailable;
	public void shopAvailable() {
		shopAvailable.click();
}
}
