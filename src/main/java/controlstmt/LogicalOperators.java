package controlstmt;

public class LogicalOperators {
	
	//Both should be true to go inside IF loop
	public void DoubleAnd(){
		
		boolean a = false;
		boolean b = true;
		
		if(a && b){
			System.out.println("Hello");
		}else{
			System.out.println("Else");
		}
		
	}
	
	
	
	//Both should be true to go inside IF loop
	public void SingleAnd(){
		
		boolean a = false;
		boolean b = true;
		
		if(a & b){
			System.out.println("Hello");
		}else{
			System.out.println("Else");
		}
		
	}
	
	public static void main(String [] args){
		LogicalOperators obj = new LogicalOperators();
		//obj.DoubleAnd();
		obj.SingleAnd();
	}

}
