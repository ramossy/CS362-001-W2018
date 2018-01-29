package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar cal = new GregorianCalendar();
		 	boolean valid = true;
		 	int day = cal.get(cal.DAY_OF_MONTH); 
		 	int month = cal.get(cal.MONTH);
		 	int year = cal.get(cal.YEAR);
		 	CalDay calendarDay = new CalDay(cal);
		 	Appt appt = new Appt(20,10 ,1 ,11 ,2018 , "MECOP Interview", "Let's gooooooo");
		 	calendarDay.addAppt(appt);
			Appt appt2 = new Appt(20,9 ,1 ,11 ,2018 , "MECOP Interview", "Let's gooooooo");
			calendarDay.addAppt(appt2);
			Appt appt3 = new Appt(20,11 ,1 ,11 ,2018 , "MECOP Interview", "Let's gooooooo");
			calendarDay.addAppt(appt3);
			
		 	//assertions 
		 	assertEquals(3, calendarDay.getSizeAppts());
		 	assertTrue(calendarDay.isValid());
		 	assertEquals(day, calendarDay.getDay());
		 	assertEquals(month, calendarDay.getMonth());
		 	assertEquals(year, calendarDay.getYear());
		 	
		 	assertNotNull(calendarDay.toString());
		 	assertNotNull(calendarDay.getAppts());
		 	assertNotNull(calendarDay.iterator());
		 	
		 	
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 	CalDay calendarDayInvalid = new CalDay();
		 	assertEquals(false, calendarDayInvalid.isValid());
		 	assertNull(calendarDayInvalid.iterator());
	 }
//add more unit tests as you needed	
}
