package Package1;

import org.testng.Assert;
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

public class Sample5 {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Sample5 before suite");
	}


	//called after the BeforeTest method
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample5 before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample5  Before test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Sample5  Before method");
	}
	

	@Test()
	public void Test1() {
		Assert.fail("test");
		System.out.println("Sample5  First Testcase execution");
	}

	@Test(dependsOnMethods = "Test1", alwaysRun = false)
	public void Test2() {
		System.out.println("Sample5  Second Testcase execution");
	}

	@Test(dependsOnMethods = "Test1", alwaysRun = true)
	public void Test3() {
		System.out.println("Sample5  Third Testcase execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Sample5  After test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Sample5  After method");
	}

	//very important
	//its called after displaying test results passed or failed
	//where as rest calls comes in sequence
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample5 after suite");
	}
	
	//called before the AfterTest annotation
	@AfterClass
	public void afterClass() {
		System.out.println("Sample5 after class");
	}
}
