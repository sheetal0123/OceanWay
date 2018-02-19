package classes.general;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumbers {

	//Here we pass max digit a random number can have, no. can be 0 to max digit
	public void getRandomNumberInDigits(int digits){
		String rdStr = RandomStringUtils.randomNumeric(digits);
		int rdNum = Integer.parseInt(rdStr);
		System.out.println("Any number between 0 to 9999: "+rdNum);
	}
	
	//Here we pass max number random can have, number can be 0 to max number
	public void getAnyRandomNumberBelowANumber(int number) {
		Random random = new Random();
		System.out.println("Any number between 0 to 1000 : "+random.nextInt(number));
	}
	
	
	//To get fix digits in random number
	public void getFixDigitsInRandomNumbers(int range) {
		Random random = new Random();
		String randomNumber = String.format("%04d",random.nextInt(range));
		
		if (randomNumber.charAt(0) == '0') {
			randomNumber = randomNumber.replace(randomNumber.charAt(0), '1');
		}
		
		System.out.println("Fix digit number: "+randomNumber);
	}
	
	
	
	

	public static void main(String[] args) {
		RandomNumbers obj = new RandomNumbers();
		//obj.getRandomNumberInDigits(4);
		//obj.getAnyRandomNumberBelowANumber(1000);
		obj.getFixDigitsInRandomNumbers(10000);
	}

}
