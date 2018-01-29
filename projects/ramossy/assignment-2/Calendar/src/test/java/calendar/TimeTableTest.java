package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 Calendar rightnow = Calendar.getInstance();
	     //current month/year/date is today
	     int thisMonth = rightnow.get(Calendar.MONTH)+1;
		 int thisYear = rightnow.get(Calendar.YEAR);
		 int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
			
		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		 tomorrow.add(Calendar.DAY_OF_MONTH,1);
		 String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
		 String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

		 
		 
		 
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 Appt appt = new Appt(1,
                 30 ,
                 1 ,
                 1 ,
                 2018 ,
                 "Title",
                "This is the description");   
		 int recurDays[] = {2,3,4};
		 appt.setRecurrence(recurDays, 1, 1, 1000);
        listAppts.add(appt);
        
		
        Appt appt2 = new Appt(10,
                11 ,
                1 ,
                1 ,
                2018,
                "Different Title",
               "This is the different description");  
        listAppts.add(appt2);
        
        TimeTable tt = new TimeTable();
    	assertNotNull(tt);
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = tt.getApptRange(listAppts, today, tomorrow);
		assertNotNull(tt.getApptRange(listAppts, today, tomorrow));
		
		//int pv[] = {1,2};
		//tt.permute(listAppts, pv);
		
		 Appt badAppt = new Appt(50,
	                11 ,
	                1 ,
	                1 ,
	                2018,
	                "Different Title",
	               "This is the different description");  
		tt.deleteAppt(listAppts, appt);	
		tt.deleteAppt(listAppts, appt2);
		tt.deleteAppt(listAppts, badAppt);
		tt.deleteAppt(listAppts, appt);
		
		
		
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
