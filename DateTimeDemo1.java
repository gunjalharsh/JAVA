
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

 public class DateTimeDemo1{

//	@SuppressWarnings("unused")
 public static void main(String[] args) {
	
	LocalDate date=LocalDate.now();
	
	System.out.println("Current Systems Date is :"+date);
	LocalDate yesterday=date.minusDays(1);
	LocalDate tommarrow =yesterday.plusDays(2);
	
	System.out.println("Todays Date is :"+date);
	System.out.println("Yesterdays date is :"+yesterday);
	System.out.println("Tommarrows date is :"+tommarrow);
	
	LocalDate date1=LocalDate.of(2016, 9, 23);
	System.out.println(date1.isLeapYear());
	
	System.out.println("****************");
	
	
	LocalTime time=LocalTime.now();
	System.out.println("Time is : " +time);
	
	System.out.println("****************");
	
	
	LocalDateTime now=LocalDateTime.now();
	System.out.println("Before Formatting :" +now);
	DateTimeFormatter format =DateTimeFormatter.ofPattern(" E dd-MMMM-yyyy HH:MM:SS");
	String FormatDateTime =now.format(format);
	System.out.println("New Format is :" +FormatDateTime);
	
	System.out.println("Another Way");
	
	SimpleDateFormat date3=new SimpleDateFormat("M/dd/yyyy");
	System.out.println(date3.format(new java.util.Date()));
	
	System.out.println("****************");

	System.out.println("isValidYear Function");
	Month feb=Month.FEBRUARY;
	MonthDay feb29=MonthDay.of(feb, 29);

	System.out.println("Year is :" +feb29.isValidYear(2010));
	
	
	System.out.println("*********************");

	System.out.println("atDay Function");
	Year y =Year.of(2020);
	LocalDate date4=y.atDay(156);
	java.util.Date dt=Date.from(date4.atStartOfDay(ZoneId.systemDefault()).toInstant());
	SimpleDateFormat sdf2=new SimpleDateFormat("EEEE dd/MM/yyyy");
	//System.out.println("Date of 156 is :" +date4);
	System.out.println(sdf2.format(dt));
	
	
	System.out.println("*********************");
	
	java.util.Date dt1=Date.from(date4.atStartOfDay(ZoneId.systemDefault()).toInstant());
	SimpleDateFormat sdf3=new SimpleDateFormat("MMMM");
			
	
	System.out.println("Month of "+date4+" is "+ (sdf3.format(dt1)));
	

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

	
	


	

	}

}
