package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fourthDay {
	
	@Test
	public void WebloginHomeLoan() {
		System.out.println("web home loan");
		
	}
@Test
public void MobileLoginHomeLoan() {
	System.out.println("mobile home loan");
	
}
@Test
public void LoginApiHomeLoan() {
	System.out.println("api home loan");
	Assert.assertTrue(false);
	
}
@BeforeClass
public void beforeClass() {
	System.out.println("i will execute before class");
}
@BeforeTest
public void beforeTest() {
	System.out.println("i execute before class");
}
@AfterMethod
public void afterMethod() {

System.out.println("i will execute after each method");
}
@AfterTest
public void afterTest() {
	System.out.println("i execute after class");
}
}


