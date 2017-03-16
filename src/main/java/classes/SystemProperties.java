package classes;

import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {

		// Generally Used
		System.out.println(System.getProperty("user.dir"));		  //  /Users/sheetalsingh/Documents/workspace/OceanWay
		System.out.println(System.getProperty("file.separator")); //  
		System.out.println(System.getProperty("os.name"));		  //  Mac OS X
		System.out.println("\n\n\n");


		
		// this will list the current system properties
		Properties p = System.getProperties();
		p.list(System.out);
	}

}
