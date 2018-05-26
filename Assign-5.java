import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Java8TimeExample {

	public static void main(String[] args) {
		
		Java8TimeExample t =new Java8TimeExample();
		
		t.testAdjusters();

	}
	
	public void testAdjusters() {
	      //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);	  


	      //get the second sunday of next month
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth().plus(1), 1);
	      System.out.println("firstInYear: " + firstInYear);	
	      
	      LocalDate secondSunday = firstInYear.with(
	         TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(
	         TemporalAdjusters.next(DayOfWeek.SUNDAY));
	      System.out.println("Second sunday on : " + secondSunday);	   
	   }	

}
