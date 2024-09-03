package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calculateEmi {
	@FindBy(xpath="//a[text()='For Buyers']")
	WebElement forBuyer;
	public void ClickForBuyer() {
		forBuyer.click();
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/ul/li[5]/span")
	WebElement insights;
	public void clickInsights() {
		insights.click();
	}
	@FindBy(xpath="//a[@data-custominfo='{\"custom_object\":{\"url\":\"/apply-for-home-loan-hlpg\",\"tab\":\"For Buyers\"}}']")
	WebElement homeloan;
	public void clickHomeloan() {
		homeloan.click();
	}
	@FindBy(xpath="(//div[@class='hamList']//div)[2]")
	WebElement calculateEmi;
	public void clickCalculateEmi() {
		calculateEmi.click();
	}
	
	@FindBy(xpath="(//span[@class='phnCodeValue']/following-sibling::input)[2]")
	WebElement loanAmount;
	
	public void clickLoanAmount(String amount) {
		loanAmount.clear();
		loanAmount.sendKeys(amount);
	}
	@FindBy(xpath="(//div[@data-attr='inputWrapper']/following-sibling::div)[3]")
	WebElement Tenure;
	
	public void clickTenure(String year) {
		Tenure.clear();
		Tenure.sendKeys(year);
	}
	@FindBy(xpath="(//div[@class='eoiLyr_inpWrap unvalidatedField'])[2]")
	WebElement ROI;
	
	public void clickROI(String interest) {
		ROI.clear();
		ROI.sendKeys(interest);
	}
}
