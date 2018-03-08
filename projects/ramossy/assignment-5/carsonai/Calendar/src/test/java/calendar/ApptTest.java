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
		 Appt appt2 = new Appt(startHour,
		          startMinute,
		          startDay,
		          startMonth,
		          startYear,
		          title,
		         description);
		 Appt appt3 = new Appt(startHour-1,
		          startMinute,
		          startDay,
		          startMonth,
		          startYear,
		          title,
		         description);
		 Appt appt4 = new Appt(startHour,
		          startMinute-2,
		          startDay,
		          startMonth,
		          startYear,
		          title,
		         description);
		 Appt appt5 = new Appt(startHour,
		          startMinute,
		          startDay-3,
		          startMonth,
		          startYear,
		          title,
		         description);
		 Appt appt6 = new Appt(startHour,
		          startMinute,
		          startDay,
		          startMonth+1,
		          startYear,
		          title,
		         description);
		 Appt appt7 = new Appt(startHour,
		          startMinute,
		          startDay,
		          startMonth,
		          startYear+1,
		          title,
		         description);
	// assertions
		 int com = appt.compareTo(appt2);
		 //assertNotEquals(42+60+30+2+400+36, com);
		 assertEquals(0, com);
		 
		 com = appt.compareTo(appt3);
		 assertEquals(1,com);
		 
		 com = appt.compareTo(appt4);
		 assertEquals(2,com);
		 
		 com = appt.compareTo(appt5);
		 assertEquals(3,com);
		 
		 com = appt6.compareTo(appt);
		 assertEquals(1, com);
		 
		 com = appt7.compareTo(appt);
		 assertEquals(1, com);
		 
		 
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
		 
		
		 appt.setStartMinute(-3);
		 assertFalse(appt.getValid());
		 
		 assertNull(appt.toString());
		 
		 
		 appt.setStartMinute(10);
		 
		 appt.setStartDay(50);
		 assertFalse(appt.getValid());
		 appt.setStartDay(10);
		 
		 appt.setStartYear(-1);
		 assertTrue(appt.getValid()); 
		 
		 appt.setRecurrence(recurringDays, 1, 0, 10);
		 assertNotNull(appt.getRecurNumber());
		 assertNotNull(appt.getRecurBy());
		 assertNotNull(appt.isRecurring());
		 assertNotNull(appt.getRecurIncrement());
		 
		 assertEquals(0, appt.getRecurIncrement());
		 assertEquals(1, appt.getRecurBy());
		 assertEquals(10, appt.getRecurNumber());
		 
		 appt.setRecurrence(recurringDays, 0, 2, -10);
		 
		 
		 appt.setRecurrence(recurringDays, -1, 2, 10);
		 
		 appt.setRecurrence(recurringDays, -1, 2, 0);
		 //assertNull(appt.isReccuring());
		 
		 String nullString = null;
		 appt.setTitle(nullString);
		 appt.setDescription(nullString);
		 
		 int badIntArray[] = null;
		 appt.setRecurrence(badIntArray, 1, 0, 10);
		// assertEquals("no", appt.getTitle());
		 
		 appt.setStartHour(0);
		 assertTrue(appt.getValid());
		 appt.setStartHour(23);
		 assertTrue(appt.getValid());
		 appt.setStartMinute(0);
		 assertTrue(appt.getValid());
		 appt.setStartMinute(59);
		 assertTrue(appt.getValid());
		 appt.setStartDay(1);
		 assertTrue(appt.getValid());
		 appt.setStartMonth(1);
		 assertTrue(appt.getValid());
		 appt.setStartMonth(12);
		 assertTrue(appt.getValid());
		 
		 appt.setStartDay(31);
		 assertTrue(appt.getValid());
		 
		// appt.setRecurrence(recurringDays, 1, 0, 0);
		 //boolean rec = appt.isReccuring();
		 //assertFalse(rec);
		 //appt.setRecurrence(recurringDays, 1, 0, 100);
		 //rec = appt.isReccuring();
		 //assertTrue(rec);
		// appt.setStartMonth(20);
		 
		 //com = appt.compareTo(appt2);
		 //assertEquals(1,com);
		 
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
	
}
