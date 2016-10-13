package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *  List ['beer','apple','orange','grapes']
 *  reverse it ['reeb','elppa','egnaro','separg']
 *
 */
public class QuesSet4 {

	
	public void reverseAListContent(){
		
		List<String> ls = new ArrayList<>();
		ls.add("beer");
		ls.add("apple");
		ls.add("prange");
		ls.add("grapes");
		
		System.out.println(ls); // [beer, apple, prange, grapes]
		
		
		List<String> ls2 = new ArrayList<>();
		for(String str : ls){
			System.out.println(str);
			
			
		}
		
		
	}

	public static void main(String[] args) {
		QuesSet4 obj = new QuesSet4();
		obj.reverseAListContent();
	}
}
