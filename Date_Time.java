// Java Program to Display Current Date and Time
import java.util.*;
import java.time.*;
public class Date_Time {
	public static void main(String[] args)
	{
		Date date = new Date();

		LocalDateTime d = LocalDateTime.now();
		ZonedDateTime UTCtime = d.atZone(ZoneId.of("UTC"));
		ZonedDateTime ISTtime = UTCtime.withZoneSameInstant(
			ZoneId.of("Asia/Maharashtra"));
		
		System.out.println(ISTtime);
	}
}
