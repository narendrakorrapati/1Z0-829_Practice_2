package dates;

import java.time.*;

public class ManipulateDate {

	public static void main(String... args) {
		
		manipulateDate();
		manipulateDateTime();
		
	}
	
	static void manipulateDate() {
		
		var localDate = LocalDate.of(2023, Month.JANUARY, 15);
		System.out.println(localDate);
		localDate = localDate.plusDays(1);
		System.out.println(localDate);
		localDate = localDate.plusWeeks(2);
		System.out.println(localDate);
		localDate = localDate.plusMonths(3);
		System.out.println(localDate);
		localDate = localDate.plusYears(4);
		System.out.println(localDate);
	}
	
	static void manipulateDateTime() {
		
		var date = LocalDate.of(2023, 1, 15);
		var time = LocalTime.of(6, 10, 55, 999999999);
		var datetime = LocalDateTime.of(date, time);
		System.out.println(datetime);
		datetime = datetime.minusDays(1);
		System.out.println(datetime);
		datetime = datetime.minusHours(24);
		System.out.println(datetime);
		datetime = datetime.minusSeconds(60);
		System.out.println(datetime);
		datetime = datetime.minusMinutes(1);
		System.out.println(datetime);
		datetime = datetime.minusNanos(100);
		System.out.println(datetime);
	}

}