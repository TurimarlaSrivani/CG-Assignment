package strings;

import java.time.LocalDate;
import java.time.Period;

public class AcceptDate {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate date1=LocalDate.of(1999, 01, 01);
		LocalDate date2=LocalDate.of(2020, 01, 19);
		Period timeInterval=date1.until(date2);
		Period timeInterval1=date1.until(date);
		System.out.println(timeInterval.getYears()+"Years");
		System.out.println(timeInterval.getMonths()+"Months");
		
		System.out.println(timeInterval1.getYears()+"Years");
		System.out.println(timeInterval1.getMonths()+"Months");

		
		System.out.println(timeInterval1.getDays()+"Days");


	}

}
