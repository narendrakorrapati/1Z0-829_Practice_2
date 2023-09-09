package dates;

import java.time.*;

public class PeriodsTest {

	public static void main(String... args) {
		
		var date = LocalDate.now();
		
		var annually = Period.ofYears(1); // every 1 year
		var quarterly = Period.ofMonths(3); // every 3 months
		var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		var everyOtherDay = Period.ofDays(2); // every 2 days
		var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
		
		System.out.println(date.plus(annually));
		System.out.println(date.plus(quarterly));
		System.out.println(date.plus(everyThreeWeeks));
		System.out.println(date.plus(everyOtherDay));
		System.out.println(date.plus(everyYearAndAWeek));
		
		var wrong = Period.ofYears(1).ofWeeks(1); //every week
		
		var wrong1 = Period.ofYears(1);
		wrong1 = Period.ofWeeks(1);
		
		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(everyThreeWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndAWeek);
		
		var time = LocalTime.now();
		var period = Period.ofDays(1);
		
		//System.out.println(time.plus(period)); Can't use Period with LocalTime
		
	}

}