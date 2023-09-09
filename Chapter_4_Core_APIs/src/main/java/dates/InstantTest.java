package dates;

import java.time.*;
import java.time.temporal.*;

public class InstantTest {

	public static void main(String args[]) throws Exception{
		
		var now = Instant.now();
		
		Thread.sleep(500);
		
		var later = Instant.now();
		
		var duration = Duration.between(now, later);
		
		System.out.println(duration.toMillis());
		
		
		var date = LocalDate.of(2023, 1, 15);
		var time = LocalTime.of(6, 10, 55);
		var zone = ZoneId.of("US/Eastern");
		
		var zoned1 = ZonedDateTime.of(date, time, zone);  
		var instant = zoned1.toInstant(); //Subtracts time from zone time that gives GMT equivalant time
		
		System.out.println(zoned1); //2023-01-15T06:10:55-05:00[US/Eastern]
		System.out.println(instant); //2023-01-15T11:10:55Z
		
	}

}