package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyer {
	WebDriver driver;
	
	buyer b;
	public buyer (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public buyer() {
	}

	@FindBy(xpath="//a[text()='For Buyers']")
	WebElement forBuyer;
	public void clickForBuyer() {
		forBuyer.click();
	}
	
	@FindBy(xpath="//a[text()='Property in Hyderabad']")
	WebElement property ;
	public void clickProperty () {
		property.click();
	}
	
	@FindBy(xpath="//span[text()='Under construction']")
	WebElement underCons;
	public void clickUnderCons() { 
		underCons.click();
	}
	
	@FindBy(xpath="//div[text()='Arkala Life']")
	WebElement flat;
	public void clickFlat() {
		flat.click();
	}

	
	
}
