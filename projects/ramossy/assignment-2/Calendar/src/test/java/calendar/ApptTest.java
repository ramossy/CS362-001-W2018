package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 
		 int [] recurringDays = new int[0];
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
		
		 assertNotNull(appt.toString());
		 assertNotNull(appt.compareTo(appt));
		 
		 appt.setRecurrence(recurringDays, 2, 0, 0);
		 appt.setStartHour(10);
		 appt.setStartDay(2);
		 appt.setStartMinute(20);
		 appt.setStartMonth(1);
		 appt.setStartYear(5);
		 
		 assertEquals("\t1/2/5 at 10:20am ,Birthday Party, This is my birthday party.\n", appt.toString());
		 
		 appt.setStartHour(30);
		 assertFalse(appt.getValid());
		 appt.setStartHour(3);
		 
		 appt.setStartDay(50);
		 assertFalse(appt.getValid());
		 appt.setStartDay(10);
		 appt.setStartMinute(-3);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(10);
		 appt.setStartMonth(10);
		
		 appt.setStartYear(-1);
		 assertTrue(appt.getValid()); 
		// appt.setStartHour(10));
		 //assertNotNull(appt.setStartMinute(20));
		 //assertNotNull(appt.setStartDay(20));
		 //assertNotNull(appt.setStartMonth(1));
		 //assertNotNull(appt.setStartYear(2019));
		 
		 String nullString = "";
		 appt.setTitle(nullString);
		 
		 appt.setRecurrence(recurringDays, 1, 0, 10);
		 assertNotNull(appt.getRecurNumber());
		 assertNotNull(appt.getRecurBy());
		 assertNotNull(appt.isRecurring());
		 assertNotNull(appt.getRecurIncrement());
		 
		// assertEquals("no", appt.getTitle());
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
	
}
