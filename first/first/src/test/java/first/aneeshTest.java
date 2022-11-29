package first;

import org.testng.Assert;
import org.testng.annotations.Test;


import first.aneesh.aneesh;



public class aneeshTest {
	public void testlogin1()  
	{
		aneesh myapp=new aneesh();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
		
	}
	
	@Test
	public void testlogin2() {
		aneesh myapp =new aneesh();
		Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
	}
}
