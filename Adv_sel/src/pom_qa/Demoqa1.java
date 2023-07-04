package pom_qa;

import org.testng.annotations.Test;

import frameWork28_june.generic_forqa;

public class Demoqa1 extends generic_forqa {
	@Test
	public void test1() throws InterruptedException {
		pom_forQA p=new pom_forQA(driver);
		p.firstname();
		p.lastname();
		p.email1();
		p.radiobutton1();
		p.mobilenumber1();
		Thread.sleep(1000);
		p.dob1();
		p.date1();
		p.year1();
		p.month1();
		
	}

}
