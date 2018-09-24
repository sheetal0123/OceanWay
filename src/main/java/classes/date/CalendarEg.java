package classes.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalendarEg {
	
	static Logger logger = LoggerFactory.getLogger(CalendarEg.class);
	
	public static void getDateTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		logger.info("Date Time: "+sdf.format(cal.getTime()));
	}
	
	
	public static void getDateDDMMYY() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("DDMMYY");
		logger.info("Date: "+sdf.format(cal.getTime()));
	}

	public static void getTimeHHMMSS() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HHMMSS");
		logger.info("Time: "+ sdf.format(cal.getTime()));
	}

	
	public static void main(String [] args){
		getDateTime();
		getDateDDMMYY();
		getTimeHHMMSS();
	}

}
