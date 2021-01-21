package org.pom;

import java.util.Set;

public class Task3 extends Base_class{
	
	public static void main(String[] args) throws InterruptedException {
		
		chromeBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maximizeWindow();
		HomePagePojo3 h=new HomePagePojo3();
		
		upAndDown(h.getSdown());
		
		String txt2 = text(h.getSdown());
		System.out.println(txt2);
		
		upAndDown(h.getSup());
		
		String txt1 = text(h.getPrintNo1());
		System.out.println(txt1);
		
		btnClick(h.getClkCertify());
		btnClick(h.getClkSeleniumCourse());
		
		String txt3 = text(h.getPrintSelenium());
		System.out.println(txt3);
		
		mousehover(h.getMoverCourse());
		mousehover(h.getMoverJTraining());
		btnClick(h.getClickCoreJava());
		Thread.sleep(3000);
		
		upAndDown(h.getSdownReview());
		String txt4 = text(h.getSdownReview());
		System.out.println(txt4);
		upAndDown(h.getSup());
		
		btnClick(h.getClkTestimonial());
		String txt6 = text(h.getPrintMnum());
		System.out.println(txt6);
		
		btnClick(h.getClkCareers());
		upAndDown(h.getdownPrintAddres());
		String txt5 = text(h.getdownPrintAddres());
		System.out.println(txt5);
		
		upAndDown(h.getClkContactus());
		btnClick(h.getClkContactus());
		String txt7 = text(h.getPrintMainBranch());
		System.out.println(txt7);
		
		

		
		
		
	}

}
