package calendar;


import org.junit.Test;


import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Random;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;






/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	/*
	 * Need to test public void addAppt(Appt appt)
	 */
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test()
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
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
		
			for (int i = 0; i < NUM_TESTS; i++) {
				
				
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   //appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						  // appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}		
						
						 
						 
							
							
				}
			
			  TimeTable timeTable=new TimeTable();
		        //Create a linked list of calendar days to return
		        //LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		        	
			  		CalDay calDays = new CalDay(today);
					//calDays = new LinkedList<CalDay>();
				     LinkedList<Appt> listAppts = new LinkedList<Appt>();
					
					for(int j = 0; j < 10; j++){
						 int startHour=ValuesGenerator.RandIntcal(random);
						 int startMinute=ValuesGenerator.RandIntcal(random);
						 int startDay=ValuesGenerator.RandIntcal(random);;
						 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
						 int startYear=ValuesGenerator.RandIntcal(random);
						 String title="Birthday Party";
						 String description="This is my birthday party.";
						 //Construct a new Appointment object with the initial data	 
						 Appt appt = new Appt(startHour,
						          startMinute ,
						          startDay ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt appt2 = new Appt(startHour,
						          startMinute+1 ,
						          startDay ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						
						 if(j == 12){
							 listAppts.add(appt);
						 }
						 else{
							 listAppts.add(appt);
							 listAppts.add(appt2);
							 calDays.addAppt(appt);
							 calDays.addAppt(appt2);
							 
						 }
						}
					//System.out.print("size: " + listAppts.size());
					//calDays = timeTable.getApptRange(listAppts, today, tomorrow);
					//System.out.print("hey");
					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			       
			}

		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
		 
	 }


	
}
