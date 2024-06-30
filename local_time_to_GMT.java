// Java Program to convert local time to GMT

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;

class local_time_to_GMT {

	public static void main(String[] args)
	{
 
		Date localTime = new Date();
 
		DateFormat s = new SimpleDateFormat("dd/MM/yyyy"   + " "  + " HH:mm:ss");
		s.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("local Time:" + localTime);

		System.out.println("Time IN Gmt : "
						+ s.format(localTime));
	}
}
