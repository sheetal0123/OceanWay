package classes.innerclasses;

/**
 * Here we re defined parent class and override the same method with new feature
 * w/o creating a new class, extend and then override
 * 
 * Following file will be created:
 * AnonymousClass$1.class
 * ParentYou.class
 */

public class AnonymousClass {
	
	public static void main(String [] args){
		
		ParentYou obj = new ParentYou(){
			public void show(){
				System.out.println("show me videos");
			}
		};
		
		
		obj.show(); // show me videos
	}

}


class ParentYou{
	public void show(){
		System.out.println("show pictures");
	}
}
