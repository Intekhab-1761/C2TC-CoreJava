package day_27_date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		//Getting current date and Time
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);

		Clock clock = Clock.systemDefaultZone();
		
		//Getting current Date and Time
		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(clock), LocalTime.now());
		System.out.println(localDateTime2);

		//Getting the day of the week
		DayOfWeek dayOfWeek = LocalDate.parse("2022-01-30").getDayOfWeek();
		System.out.println(dayOfWeek);

		//Getting day of the month
		int dayOfMonth = LocalDate.parse("2022-01-30").getDayOfMonth();
		System.out.println(dayOfMonth);
		
		//Checking if the specific year is leap year or not
		LocalDate thisYear=LocalDate.now();
		System.out.println(thisYear.isLeapYear());
		
		//Commonly used methods
		int previousYear=LocalDate.now().minusYears(2).getYear();
		System.out.println(previousYear);
		System.out.println(LocalDate.ofYearDay(previousYear, dayOfMonth)+" Covid Alert");
		
		LocalDate  localDateTime3= LocalDate.parse("2022-01-30");
		System.out.println(localDateTime3);
		
		LocalDate minus=localDateTime3.minus(2, ChronoUnit.DAYS);
		System.out.println(minus);
		
		LocalDate  localDateTime4= localDateTime3.plusDays(5);
		System.out.println( localDateTime4);
		
		boolean before =LocalDate.parse("2022-01-30").isBefore(LocalDate.now().plus(3, ChronoUnit.DAYS));
		System.out.println(before);
		
		boolean after =LocalDate.parse("2022-01-30").isAfter(LocalDate.now().plus(3, ChronoUnit.DAYS));
		System.out.println(after);
	}
	

}
