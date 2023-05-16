package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {

		//Calendar has some unique more features which date dosent have
		Calendar cal = Calendar.getInstance();// import from havautil
		SimpleDateFormat sd = new SimpleDateFormat("M/dd?yyy hh:mm:ss"); //import java.txt // new object to play with calendar
		System.out.println(sd.format(cal.getTime()));
		cal.get(Calendar.DAY_OF_MONTH);
		//weekofmonth and many more
		//check am or pm //mintue of hour	

	}

}
