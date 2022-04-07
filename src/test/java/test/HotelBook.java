package test;

import org.testng.annotations.Test;
import pages.booking;

public class HotelBook extends BaseClass {
	
	
	@Test(priority=1)
	public void hotelClick() throws InterruptedException {
		
		booking booking = new booking(driver);
		booking.click_Hotel();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void searchPlace() throws InterruptedException{
		booking booking = new booking(driver);
		booking.search_Hotel("Switzerland");
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void selectPlace() throws InterruptedException {
		booking booking = new booking(driver);
		booking.select_Place();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void calenderClick() throws InterruptedException {
		booking booking = new booking(driver);
		booking.calender_Click();
		Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void checkInDate() throws InterruptedException {
		booking booking = new booking(driver);
		booking.checkIn_Date();
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void checkOutDate() throws InterruptedException {
		booking booking = new booking(driver);
		booking.checkOut_Date();
		Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void childSelect() throws InterruptedException {
		booking booking = new booking(driver);
		booking.child_Select();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void childAgeSelect() throws InterruptedException {
		booking booking = new booking(driver);
		booking.childAge_Select();
		Thread.sleep(2000);
	}
	
	@Test(priority=9)
	public void childYearSelect() throws InterruptedException {
		booking booking = new booking(driver);
		booking.childAge_Year();
		Thread.sleep(2000);
	}
	
	@Test(priority=10)
	public void childConfirm() throws InterruptedException {
		booking booking = new booking(driver);
		booking.child_Confirm();
		Thread.sleep(2000);
	}
	
	@Test(priority=11)
	public void checkBox() throws InterruptedException {
		booking booking = new booking(driver);
		booking.check_Box();
		Thread.sleep(3000);
	}
	
	@Test(priority=12)
	public void title() throws InterruptedException {
		booking booking = new booking(driver);
		booking.get_Title();
		Thread.sleep(3000);
	}

}
