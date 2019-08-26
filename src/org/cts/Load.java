package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Load extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		lauch();
		pushurl("https://adactin.com/HotelApp/index.php");
		
		POJO p=new POJO();
		fill(p.getUsername(),"karthi47");
		fill(p.getPassword(),"4MLB3Q");
		clk(p.getLogin());
		dropdown(p.getLocation(),"London");
		dropdown(p.getHotels(),"Hotel Cornice");
		dropdown(p.getRoomtype(),"Standard");
		dropdown(p.getRoomno(),"3 - Three");
		dropdown(p.getAdult(),"2 - Two");
		dropdown(p.getChild(),"2 - Two");
		clk(p.getSummit());
		clk(p.getRadio());
		clk(p.getCon());
		fill(p.getFname(),"Jayanthi");
		fill(p.getLname(),"JayanthiVenkat");
		fill(p.getAdd().get(0),"Mountains Queens hostel,Porur");
		fill(p.getCreditcard(),"6597561296547562");
		dropdown(p.getCardtype(),"Master Card");
		dropdown(p.getExpmonth(),"November");
		dropdown(p.getExpyear(),"2019");
		fill(p.getCvv(),"562");
		clk(p.getBook());
		txt(p.getOrderno());
		
		
	}
}
