package Jdbcpack;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class grade{
	private static final ZoneId zoneId = null;

	public static void main(String[] args) { 


		ZoneId zone2 = zoneId. of("America/New york");
		LocalTime now2 = LocalTime.now(zone2);
		LocalDate now3 = LocalDate.now(zone2);
		System.out.println("America");
		
		System.out.println(now2);
		
		System.out.println(now3);
		
		
		
		

	}

}