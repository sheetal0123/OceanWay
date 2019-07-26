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
	

	

	@DataProvider(name = "multiParam")
	public Object[][] multParam() {
		Object[][] objArray = new Object[4][3];
		objArray[0][0] = 1;
		objArray[0][1] = "Delhi";
		objArray[0][2] = "Ind";
		
		objArray[1][0] = 2;
		objArray[1][1] = "Lahore";
		objArray[1][2] = "Pak";

		objArray[2][0] = 3;
		objArray[2][1] = "Bejing";
		objArray[2][2] = "Chn";

		objArray[3][0] = 4;
		objArray[3][1] = "Colombo";
		objArray[3][2] = "SL";
		
		return objArray;
	}
	

	@DataProvider(name = "multiParam2")
	public Object[][] multParam2() {
		return new Object[][] {
	      new Object[] { 1, "Delhi", "India" },
	      new Object[] { 2, "Lahore", "Pak" },
	      new Object[] { 3, "Bejing", "China" },
	      new Object[] { 4, "Colombo", "SriLanka" },
	    };
	}

	
	
	@DataProvider(name = "listPram")
	public Object[][] listParam() {
		Object[][] objArray = new Object[1][3];
		objArray[0][0] = 1;
		objArray[0][1] = "Delhi";
		objArray[0][2] = "Ind";
		
//		objArray[1][0] = 2;
//		objArray[1][1] = "Lahore";
//		objArray[1][2] = "Pak";
//
//		objArray[2][0] = 3;
//		objArray[2][1] = "Bejing";
//		objArray[2][2] = "Chn";
//
//		objArray[3][0] = 4;
//		objArray[3][1] = "Colombo";
//		objArray[3][2] = "SL";
		
		return objArray;
	}
	
	
	
	
}
