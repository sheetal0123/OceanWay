package classes.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDateEg {
	
	static Logger logger = LoggerFactory.getLogger(LocalDateEg.class);
	
	public static void main(String[] args) {
		//Eg 1
		LocalDate localDate = LocalDate.now();
		String formattedDate = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate);
		logger.info(formattedDate);
		
		
	
		//Eg 2
		String futureDate = LocalDate.now().plusDays(10).toString();
		String backDate = LocalDate.now().minusDays(10).toString();

		boolean futureFlag = LocalDate.parse(futureDate).isAfter(LocalDate.now());
		boolean backFlag = LocalDate.parse(backDate).isBefore(LocalDate.now());
		
		logger.info("Future: {}",futureFlag);
		logger.info("Back: {}",backFlag);
		
		
		//Eg 3
		String strDate=LocalDate.now().toString();
		logger.info("Date in string: {} ",strDate);
	}

}
