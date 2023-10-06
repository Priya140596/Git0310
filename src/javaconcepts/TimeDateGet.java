package javaconcepts;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDateGet {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();	
		LocalDate now = LocalDate.now();
		System.out.println("LocalDate: "+now);
		
		LocalTime now2 = LocalTime.now();
		System.out.println("LocalTime: "+now2);
		
		LocalDateTime now3 = LocalDateTime.now();
		System.out.println("LocalDateTime: "+now3);

		Instant instant = Clock.systemUTC().instant();
		System.out.println("Clock Instant: "+instant);
		
		//Date d1=new Date();
		Date d2=new Date();
		System.out.println("date: "+d2);
		
		SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		System.out.println("simpledateformat-date: "+sd.format(d2));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
		System.out.println("DateTimeFormatter-LocalDateTime: "+dtf.format(now3));
	}

}
