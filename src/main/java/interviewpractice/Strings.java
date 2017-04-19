package interviewpractice;

import java.util.Scanner;

/*
 * How to prove that String are immutable
 */
public class Strings {
	
	public void howToProveStringsAreImmutable(){
		String a = "KAAVYA";
		String b = a.replace("K", "N");
		
		System.out.println(a); // KAAVYA
		System.out.println(b); // NAAVYA
	}
	
	
	
	
	public static void main(String[] args) {
		Strings s = new Strings();
		s.howToProveStringsAreImmutable();
		
	}

}
