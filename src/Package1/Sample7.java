package Package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
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

public class Sample7 {

	private static int count =0;
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Sample7 before suite");
		count++;
	}


	//called after the BeforeTest method
	@BeforeClass
	public void beforeClass() {
		System.out.println("Sample7 before class");
		count++;
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Sample7  Before test");
		count++;
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Sample7  Before method");
		count++;
	}
	
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Sample7 Before group");
		count++;
	}

	@Test(groups = {"group1"})
	public void Test1() {
		System.out.println("Sample7  First Testcase execution "+count);
	}
	
	

	@Test(groups = {"group2"}, dependsOnGroups = {"group1"})
	public void Test2() {
		System.out.println("Sample7  Second Testcase execution "+count);
	}

	

	@AfterTest()
	public void afterTest() {
		System.out.println("Sample7  After test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Sample7  After method");
	}

	//very important
	//its called after displaying test results passed or failed
	//where as rest calls comes in sequence
	@AfterSuite
	public void afterSuite() {
		System.out.println("Sample7 after suite");
	}
	
	//called before the AfterTest annotation
	@AfterClass
	public void afterClass() {
		System.out.println("Sample7 after class");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("Sample7 after group");
	}
}
