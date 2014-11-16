package Package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * BeforeSuite
 * BeforeTest
 * BeforeClass
 * 
 * BeforeMethod
 * Test1
 * AfetrMethod
 * 
 * BeforeMethod
 * Test2
 * AfterMethod
 * 
 * AfterClass
 * AfterTest
 * AfterSuite 
 * 
 */

public class Sample6 {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Sample2 before suite");
	}


	//called after the BeforeTest method
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample2 before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample2  Before test");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("Sample2  Before method");
	}
	

	
	@AfterTest
	public void afterTest() {
		System.out.println("Sample2  After test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Sample2  After method");
	}

	//very important
	//its called after displaying test results passed or failed
	//where as rest calls comes in sequence
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample2 after suite");
	}
	
	//called before the AfterTest annotation
	@AfterClass
	public void afterClass() {
		System.out.println("Sample2 after class");
	}
}
