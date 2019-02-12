package apis.json.samplecode2;

import com.google.gson.Gson;

/**
 * Here we initialize java obj with constructor rather getter setter
 */

public class TestCode {

	public static void main(String[] args) {
		UserAddress userAddress = new UserAddress("Main Street", "42A",
				"Magdeburg", "Germany");

		UserNested userObject = new UserNested("Norman",
				"norman@futurestud.io", true, 26, userAddress);

		Gson gson = new Gson();
		String userWithAddressJson = gson.toJson(userObject);

		System.out.print(userWithAddressJson);
		
	}

}
