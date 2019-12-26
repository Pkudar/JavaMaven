package DriverFactory;

import org.testng.annotations.Test;


public class AppTest {

	@Test
	
	public void startTest()
	{
	
	
		DriverScript ds= new DriverScript();
		try{
		ds.ERP_Test();
		
		} catch (Throwable e) {
			
		System.out.println(e.getMessage());
		}
	}
	
}
