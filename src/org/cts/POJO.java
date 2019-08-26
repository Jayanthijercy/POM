package org.cts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO extends BaseClass {
	
	
	
	public POJO() {

	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	   private WebElement username;

	@FindBy(id="password")
	   private WebElement password;
	
	@FindBy(id="login")
	   private WebElement login;

	@FindBy(id="location")
	   private WebElement location;
	
	@FindBy(id="hotels")
	 private WebElement hotels;
	
	@FindBy(id="room_type")
	  private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	    private WebElement Roomno;
	
	@FindBy(id="adult_room")
	 private WebElement Adult;
	
	@FindBy(id="child_room")
	  private WebElement Child;
	
	@FindBy(xpath="//input[@id='Submit']")
	  private WebElement summit;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	 private WebElement radio;
	
	@FindBy(xpath="//input[@id='continue']")
	  private WebElement Con;
	
	@FindBy(xpath="//input[@id='first_name']")
	 private WebElement fname;
	
	@FindBy(id="last_name")
	  private WebElement lname;
	
	@FindBy(xpath="//textarea[@id='address']")
	 private List<WebElement> add;
	
	@FindBy(id="cc_num")
	 private WebElement creditcard;
	
	@FindBy(id="cc_type")
	 private WebElement cardtype;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	   private WebElement expyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	   private WebElement cvv;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	  private WebElement expmonth;
	
	@FindBy(id="book_now")
	 private WebElement book;
	
	@FindBy(xpath="//input[@name='order_no']")
	 private WebElement orderno;
	
	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	
	
	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public List<WebElement> getAdd() {
		return add;
	}

	public WebElement getCon() {
		return Con;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSummit() {
		return summit;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return Roomno;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}

}
