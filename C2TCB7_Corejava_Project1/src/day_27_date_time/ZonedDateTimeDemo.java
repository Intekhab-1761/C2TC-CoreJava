package day_27_date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {

		// Getting zone id
		// Click on ZoneId to check the list of ZoneId's
		ZoneId zoneid = ZoneId.of("Asia/Kolkata");

		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneid);
		System.out.println(zonedDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(2022, Month.JANUARY, 31, 8, 01);
		System.out.println(localDateTime1);

		//Setting offset
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime1, offset);
		System.out.println(offsetDateTime);

	}

}
