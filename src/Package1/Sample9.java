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

public class Sample9 {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Sample8 before suite");
	}


	//called after the BeforeTest method
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample8 before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample8  Before test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Sample8  Before method");
	}
	

	@Test(enabled = false)
	public void Test1() {
		System.out.println("Sample8  First Testcase execution");
	}

	@Test
	public void Test2() {
		System.out.println("Sample8  Second Testcase execution");
	}

	@Test
	public void Test3() {
		System.out.println("Sample8  Third Testcase execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Sample8  After test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Sample8  After method");
	}

	//very important
	//its called after displaying test results passed or failed
	//where as rest calls comes in sequence
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample8 after suite");
	}
	
	//called before the AfterTest annotation
	@AfterClass
	public void afterClass() {
		System.out.println("Sample8 after class");
	}
}
