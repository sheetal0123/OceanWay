package collections;

import java.util.LinkedList;

/*
 * LL with User Defined Classes
 */

class Address{
	String houseNo,street,state;
	
	Address(String a,String b,String c){
		this.houseNo=a;
		this.street=b;
		this.state=c;
	}
	
	public String toString(){
		return houseNo+","+street+","+state;
	}
}


public class LinkedListUDC {

	public static void main(String[] args) {
		LinkedList<Address> ll=new LinkedList<Address>();
		ll.add(new Address("HNO43","Street 6","Delhi"));
		ll.add(new Address("10","Down Town","London"));
		ll.add(new Address("50","Wall Street","NY"));
		
		for(Address obj:ll){
			System.out.println(obj); // internally call - obj.toString()
		}
	}
}

//output
//HNO43 Street 6 Delhi
//10 Down Town London
//50 Wall Street NY

//commented part will give same result as well - need to check how