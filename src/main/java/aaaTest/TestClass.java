package aaaTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;


public class TestClass {
	
	public String getInstitutionId(String completeInstitutionName){
		return completeInstitutionName.split("\\[")[1].replaceAll("\\]","").trim();
	}
	

    public static void main(String [] args){
    	
    	TestClass obj = new TestClass();
    	
    	System.out.println(obj.getInstitutionId("AutoFullDCC [204648]"));
    	
//    	String institution = "AutoFullDCC [204648]";
//		String[] str1= institution.split("\\[");
//		str1[1]=str1[1].replaceAll("\\]","");
//		System.out.println(str1[1].trim());
		
		
//		String institution = "AutoFullDCC [204648]";
//		String str1= institution.split("\\[")[1].replaceAll("\\]","").trim();
//		System.out.println(str1);
    	
    	
    	
    }

}
