package Package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Sample10 {

	
	@DataProvider(name = "test1")
	public Object[][] twoDimensionalData() {
		String[][] arr1 = {{"5", "6"},{"8","10"}};
		return arr1;
	}
	
	@Test(dataProvider = "test1") 
	public void dataproviderdatausage(String key1, String key2){
		System.out.println(key1+":"+key2);
	}
	
	@DataProvider(name = "test2")
	public Iterator<Integer>[] iteratorData()  {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(6);
		list1.add(7);
		Iterator<Integer>[] itr = {list1.iterator()};

		return itr;
	}
	
	@Test(dataProvider = "test2") 
	public void onedimensionalData(Integer i1){
		System.out.println(i1);
	}
}
