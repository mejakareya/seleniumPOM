package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booking {
	
	public booking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Hotels") WebElement hotel;
	public void click_Hotel() {
		hotel.click();
		}
	
	@FindBy(xpath = "//body/div[3]/div[1]/form[1]/input[1]") WebElement search;
	public void search_Hotel(String placeName) {
		//search.click();
		search.sendKeys(placeName);
		
	}
	
	@FindBy(xpath = "//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]") WebElement selectPlace;
	public void select_Place() {
		selectPlace.click();
	}
	
	@FindBy(xpath = "//div[contains(@aria-label,'Mon Sep 12 2022')]") WebElement checkInDate;
	public void checkIn_Date() {
		checkInDate.click();
	}
	
	@FindBy(xpath = "//div[contains(@aria-label,'Wed Sep 14 2022')]") WebElement checkOutDate;
	public void checkOut_Date() {
		checkOutDate.click();
	}
	
	@FindBy(css = "#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span") WebElement childSelect;
	public void child_Select() {
		childSelect.click();
		
	}
	
	@FindBy(css = "#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button") WebElement childAgeSelect;
	public void childAge_Select() {
		childAgeSelect.click();
	}
	
	@FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[1]/div[2]/button[3]/span[1]") WebElement childAgeYear;
	public void childAge_Year() {
		childAgeYear.click();
	}
	
	@FindBy(css = "#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button") WebElement childConfirm;
	public void child_Confirm() {
		childConfirm.click();
	}
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[6]/div[2]/div[4]/div[1]/label[1]") WebElement checkBox;
	public void check_Box() {
		checkBox.click();
	}
	
	@FindBy(css = "#property_264882") WebElement getTitle;
	public void get_Title() {
		System.out.println(getTitle.getText());
	}

}
