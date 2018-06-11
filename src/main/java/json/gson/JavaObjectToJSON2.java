package json.gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Convert Java Object to Json File
public class JavaObjectToJSON2 {

	//Initialize Employee Object
	public EmployeesPojo initEmployeePojo() {
		EmployeesPojo obj = new EmployeesPojo();
		obj.seteID("E102");
		obj.seteName("Dan");
		obj.setePosition("Mgr");
		obj.seteSalary(new BigDecimal("200000"));
		obj.seteDept("Tech");
		obj.seteLocation("Delhi");
		
		List<String> ls = new ArrayList<>();
		ls.add("Powerpoint");
		ls.add("Excels");
		ls.add("Word");
		obj.setSkills(ls);
		
		return obj;
	}

	public static void main(String[] args) {
		JavaObjectToJSON2 javaObjectToJSON = new JavaObjectToJSON2();

		// initialize Employee obj with data
		EmployeesPojo obj = javaObjectToJSON.initEmployeePojo();

		// convert Java obj to String
		Gson gson = new Gson();

		// file writer
		String file = ".\\src\\main\\java\\json\\gson\\emp.json";
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			gson.toJson(obj, fw);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created succesfully");

	}

}
