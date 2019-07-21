package testng.dp;

import org.testng.annotations.DataProvider;

public class MyDP {

	/**
	 * Object [][] o = new Object [5][2]
	 * we are sending 5 rows and 2 columns
	 * 	
	 * Data will be sent row wise i.e. 
	 * [0,0][0,1] will be sent first
 	 * [1,0][1,1] will be sent second
 	 * *
 	 * [4,0][4,1] will be sent last
	 */
	@DataProvider(name = "intString")
	public Object[][] intStringDP() {
		return new Object[][] {
	      new Object[] { 1, "alpha" },
	      new Object[] { 2, "bravo" },
	      new Object[] { 3, "charli" },
	      new Object[] { 4, "delta" },
	      new Object[] { 5, "ele" },
	    };
	}
	

	
	/**
	 * We can specify data index to be sent 
	 * 
	 * Now in this case alpha, ele will only be sent
	 */
	@DataProvider(name = "intStringWithIndex", indices = {0,4})
	public Object[][] indicesDP() {
		return new Object[][] {
	      new Object[] { 1, "alpha" },
	      new Object[] { 2, "bravo" },
	      new Object[] { 3, "charli" },
	      new Object[] { 4, "delta" },
	      new Object[] { 5, "ele" },
	    };
	}

	
	
	
	/**
	 * Data will be sent parallel rather sequentially
	 */
	@DataProvider(name = "intStringWithParallel",parallel = true)
	public Object[][] parallelDP() {
		return new Object[][] {
	      new Object[] { 1, "alpha" },
	      new Object[] { 2, "bravo" },
	      new Object[] { 3, "charli" },
	      new Object[] { 4, "delta" },
	      new Object[] { 5, "ele" },
	    };
	}
	
	
	
	/**
	 * DP should return array of objects it can be 1D, 2D or 3D
	 * 
	 * 
	 * 
	 */
	@DataProvider(name = "singleparam")
	public Object[] singleParam() {
		
		Object [] array = new Object[5];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		
		return array;
		
	}
	
	
}
