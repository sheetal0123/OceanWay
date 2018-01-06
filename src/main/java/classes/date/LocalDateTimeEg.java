package classes.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDateTimeEg {

	static Logger logger = LoggerFactory.getLogger(LocalDateTimeEg.class);
	static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDate = dtf.format(localDateTime);
		logger.info(formattedDate);
	}

}
