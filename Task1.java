package org.pom;

import org.test.LoginPojo;
import org.test.Sample;

public class Task1 extends Base_class{
	
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		LoginPojo l=new LoginPojo();
		find(l.getEmail(),"asifsarams@gmail.com");
		
		find(l.getPass(),"saraldaisyanar");
		btnClick(l.getLoginbtn());
		
		
	}
	

}
