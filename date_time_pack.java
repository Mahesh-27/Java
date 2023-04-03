package javaudemy;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class date_time_pack {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date d=new Date();Date d1=new Date("27/11/2002");
		System.out.println(d);
		System.out.println(d1.getDay());
		
		GregorianCalendar d2=new GregorianCalendar();
		TimeZone tz=d2.getTimeZone();
		System.out.println(d2.isLeapYear(2002));
		System.out.println(tz.getDisplayName());

		
		
		LocalDate sa=LocalDate.now();
		LocalTime sa1=LocalTime.now();
		LocalDateTime sa2=LocalDateTime.now();
		System.out.println(sa);System.out.println(sa1);System.out.println(sa2);
	}

}
