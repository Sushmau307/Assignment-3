import java.util.*;
import java.time.*;


public class Date {

	public static void getDayMonthYear(String date)
	{
		LocalDate currentDate=LocalDate.parse(date);
		
		int day=currentDate.getDayOfMonth();
		
		Month month=currentDate.getMonth();
		
		int year=currentDate.getYear();
		
		System.out.println("Day : "+day);
		System.out.println("Month : "+month);
		System.out.println("Year : "+year);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String date="2021-10-12";
  
  getDayMonthYear(date);
	}

}
