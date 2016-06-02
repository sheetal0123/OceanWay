package testng.listners;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * 
 * 
 * @author sheetalsingh, June 2016
 */
public class TestClass {
	int i = 0;
	
	/**
	 * This test will fail 3 times but 4th time it will pass
	 * As we set maxRetryCount = 10, but if in 4th time test will pass then test will not execute again
	 */
	@Test
	public void one(){
		i++;
		if (i == 4 ){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);			
		}
	}

	
	@Test
	public void two(){
		Assert.assertTrue(100>50);
	}
	
	
	@Test
	public void three(){
		Assert.assertTrue(10>5);
	}
	
	
	@Test
	public void four(){
		Assert.assertTrue(10>5);
	}
}
