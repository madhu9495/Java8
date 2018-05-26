import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Java8TimeExample {

	public static void main(String[] args) {
		
		Java8TimeExample t =new Java8TimeExample();
		
	     t.difference_bt_twodates();

	}
	 public void difference_bt_twodates() {
		 LocalDate DateofJoin = LocalDate.of(2015, Month.NOVEMBER, 23);
		 LocalDate now = LocalDate.now();
		  
		 Period diff = Period.between(DateofJoin, now);
		  
		 System.out.printf("Difference is %d years, %d months and %d days old",
		                     diff.getYears(), diff.getMonths(), diff.getDays());
	 }
	
}
