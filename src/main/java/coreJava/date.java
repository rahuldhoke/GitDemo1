package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		
		
		//Date print current date and current time
		Date dt =new  Date(); // import from DAte java util
		System.out.println(dt.toString()); // convert the date into string and then perform operation - Tue Apr 25 12:17:20 IST 2023
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy"); // import from java.textone more class to print date in our format
		System.out.println(sdf.format(dt)); // find our the webiste for dateformats and format your date
		
	}

}
