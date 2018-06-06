package json.gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JavaObjectToJSON1 {

	//Initialize Employee Object
	public EmployeesPojo initEmployeePojo() {
		EmployeesPojo obj = new EmployeesPojo();
		obj.seteID("E101");
		obj.seteName("John");
		obj.setePosition("Lead QA");
		obj.seteSalary(new BigDecimal("100000"));
		obj.seteDept("Tech");
		obj.seteLocation("Pune");
		
		List<String> ls = new ArrayList<>();
		ls.add("Java");
		ls.add("Selenium");
		ls.add("API");
		obj.setSkills(ls);

		return obj;
	}

	public static void main(String[] args) {
		JavaObjectToJSON1 javaObjectToJSON = new JavaObjectToJSON1();

		// initialize Employee obj with data
		EmployeesPojo obj = javaObjectToJSON.initEmployeePojo();

		
		// convert Java obj to String
		Gson gson = new Gson();
		String str = gson.toJson(obj);
		
		System.out.println(str);
	}

}
