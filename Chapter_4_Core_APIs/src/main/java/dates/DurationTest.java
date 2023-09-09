package dates;

import java.time.*;
import java.time.temporal.*;

public class DurationTest {

	public static void main(String args[]) {
		
		var daily = Duration.ofDays(1);   //PT24H                  
		var hourly = Duration.ofHours(1); //PT1H
		var everyMinute = Duration.ofMinutes(1); //PT1M
		var everyTenSeconds = Duration.ofSeconds(10); //PT10S
		var everyMilli = Duration.ofMillis(1); //PT0.001S
		var everyNano = Duration.ofNanos(1); //PT0.000000001S
		
		//Above can be rewritten using ChronoUnit which is the implemntation of TemporalUnit interface

		var daily1 = Duration.of(1, ChronoUnit.DAYS);
		var hourly1 = Duration.of(1, ChronoUnit.HOURS);
		var everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
		var everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
		var everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);
		var everyNano1 = Duration.of(1, ChronoUnit.NANOS);

		//ChronoUnit for Differences
		
		var date1 = LocalDate.now();
		var date2 = LocalDate.now().minusMonths(5);
		
		System.out.println(ChronoUnit.MONTHS.between(date1, date2));
		System.out.println(ChronoUnit.YEARS.between(date1, date2));
		//System.out.println(ChronoUnit.MINUTES.between(date1, date2)); //Exception unsupported Unit
		
		var time1 = LocalTime.now();
		var time2 = LocalTime.now().plusHours(5);
		
		System.out.println(ChronoUnit.MINUTES.between(time1, time2));
		
		var time3 = LocalTime.of(6, 10, 55, 999999);
		time3 = time3.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(time3);
	}

}