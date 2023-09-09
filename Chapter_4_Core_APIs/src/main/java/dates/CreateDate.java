package dates;

import java.time.*;

public class CreateDate {

	public static void main(String args[]) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		var date1 = LocalDate.of(2023, Month.JANUARY, 15);
		var date2 = LocalDate.of(2023, 1, 15);
		
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println(date1 == date2);
		System.out.println(date1.equals(date2));
		
		var time1 = LocalTime.of(6, 10);
		var time2 = LocalTime.of(6, 10, 55);
		var time3 = LocalTime.of(6, 10, 55, 999999999);
		
		var datetime1 = LocalDateTime.of(2023, Month.JANUARY, 15, 6, 10);
		var datetime2 = LocalDateTime.of(2023, 1, 15, 6, 10);
		var datetime3 = LocalDateTime.of(2023, Month.JANUARY, 15, 6, 10, 55);
		var datetime4 = LocalDateTime.of(2023, Month.JANUARY, 15, 6, 10, 55, 999999999);
		var datetime5 = LocalDateTime.of(date1, time1);
		
		var zone = ZoneId.of("US/Easterns");
		var zoned1 = ZonedDateTime.of(2023, 1, 15, 6, 10, 55, 999999999, zone);
		var zoned2 = ZonedDateTime.of(date1, time1, zone);
		var zoned3 = ZonedDateTime.of(datetime1, zone);
		
	}

}