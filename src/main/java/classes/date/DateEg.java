package classes.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateEg {

	static Logger logger = LoggerFactory.getLogger(DateEg.class);
	//static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	static final SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
	
	public static void main(String[] args) {
		Date date = new Date();
		String formattedDate = sdf.format(date);
		logger.info(formattedDate);  			//	2018/01/05 12:57:48
	}
}
