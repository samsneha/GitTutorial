package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class thirdDay {
	
	@Test
	public void WebloginCarLoan() {
		System.out.println("web car loan");
		
	}
@Test
public void MobileLoginCarLoan() {
	System.out.println("mobile car loan");
	
	
}
@Test(groups= {"smoke"})
public void LoginApiCarLoan() {
	System.out.println("api car laon");
	
}
@AfterTest
public void afterTest() {
	System.out.println("i will execute after test");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("i will execute before method");
}
}



