package classes.date;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalendarEg {
	
	static Logger logger = LoggerFactory.getLogger(CalendarEg.class);
	static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public static void main(String [] args){
		Calendar calendar = Calendar.getInstance();
		String formattedDate = sdf.format(calendar.getTime()); 
		logger.info(formattedDate);  //2018/01/05 12:50:02
	}

}
