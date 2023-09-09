package dates;

import java.time.*;
import java.time.temporal.*;

public class DayLight {


	public static void main(String args[]) {

		var date = LocalDate.of(2022, 11, 6);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var zoned = ZonedDateTime.of(date, time, zone);
		System.out.println(zoned);
		
		zoned = zoned.plusHours(1);
		System.out.println(zoned);
		
		zoned = zoned.plusHours(1);
		System.out.println(zoned);

	}		
	
	static void forward() {
		
		var date = LocalDate.of(2022, 3, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var zoned = ZonedDateTime.of(date, time, zone);
		System.out.println(zoned);
		System.out.println(zoned.getHour());
		System.out.println(zoned.getOffset());

		zoned = zoned.plusHours(1);
		System.out.println(zoned);
		System.out.println(zoned.getHour());
		System.out.println(zoned.getOffset());
		
	}

}