package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class popularArea {
	@FindBy(xpath="//a[text()='For Buyers']")
	WebElement forBuyer;
	public void clickForBuyer() {
		forBuyer.click();
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[4]/span")
	WebElement popularAreas ;
	public void clickPopularAreas() {
		popularAreas.click();
	}
	@FindBy(xpath="//a[@data-custominfo='{\"custom_object\":{\"url\":\"/property-in-kondapur-hyderabad-ffid\",\"tab\":\"For Buyers\"}}']")
	WebElement prop;
	public void clickProp() {
		prop.click();
	}
	@FindBy(xpath="//*[@id=\"336827\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/a")
	WebElement apartment;
	public void clickApartment() {
		apartment.click();
	}
}
