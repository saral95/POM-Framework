package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePojo3 extends Base_class{
	
	public HomePagePojo3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//font[@face='Arial']")
	private WebElement sdown;
	
	@FindBy(id="client-logo")
	private WebElement sup;
	
	@FindBy(xpath="//h1[@style='font-size:22px;']")
	private WebElement printNo1;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement clkCertify;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement clkSeleniumCourse;
	
	@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
	private WebElement printSelenium;
	
	@FindBy(xpath="//a[@class='activeLink']")
    private WebElement moverCourse;
	
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement moverJTraining;
	
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement clickCoreJava;
	
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement sdownReview;
	
    @FindBy(xpath="//a[text()='TESTIMONIALS']")
    private WebElement clkTestimonial;
    
    @FindBy(xpath="//a[text()='+91 8939 915 577 / +91 6385 149 793']")
    private WebElement printMnum;
	
    @FindBy(xpath="(//a[text()='Careers'])[1]")
    private WebElement clkCareers;
    
    @FindBy(xpath="(//h6[text()='Greens Technology '])[2]")
    private WebElement downPrintAddres;
    
    @FindBy(xpath="//a[@class='login-myact contactus']")
    private WebElement clkContactus;
    
    @FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
    private WebElement printMainBranch;
    
    @FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
    private WebElement downAndprint;

	public WebElement getSdown() {
		return sdown;
	}

	public WebElement getSup() {
		return sup;
	}
	
	public WebElement getPrintNo1() {
		return printNo1;
	}

	public WebElement getClkCertify() {
		return clkCertify;
	}

	public WebElement getClkSeleniumCourse() {
		return clkSeleniumCourse;
	}

	public WebElement getPrintSelenium() {
		return printSelenium;
	}

	public WebElement getMoverCourse() {
		return moverCourse;
	}

	public WebElement getMoverJTraining() {
		return moverJTraining;
	}

	public WebElement getClickCoreJava() {
		return clickCoreJava;
	}

	public WebElement getSdownReview() {
		return sdownReview;
	}
	
	public WebElement getClkTestimonial() {
		return clkTestimonial;
	}

	public WebElement getPrintMnum() {
		return printMnum;
	}

	public WebElement getClkCareers() {
		return clkCareers;
	}

	public WebElement getdownPrintAddres() {
		return downPrintAddres;
	}

	public WebElement getClkContactus() {
		return clkContactus;
	}

	public WebElement getPrintMainBranch() {
		return printMainBranch;
	}

	public WebElement getDownAndprint() {
		return downAndprint;
	}
    
    
}
