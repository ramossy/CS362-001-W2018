package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	int startHour1, startDay1, startMinute1, startMonth1, startYear1;
	   
	/*
	 * public LinkedList<Appt> deleteAppt(LinkedList<Appt> appts, Appt appt) test 
	 */
	
	/*
	 * public LinkedList<CalDay> getApptRange(...) test 
	 */
	
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
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
		        GregorianCalendar farAway = new GregorianCalendar(thisYear, thisMonth, thisDay+10);
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
					 LinkedList<CalDay> calDays2 = new LinkedList<CalDay>();
				     LinkedList<Appt> listAppts = new LinkedList<Appt>();
				     Appt apptTemp = new Appt(1,
					          20,
					          2,
					          2,
					          2017,
					          "he",
					         "gs");
				     
				    
					for(int j = 0; j < 20; j++){
						 int startHour=ValuesGenerator.RandIntcal(random);
						 int startMinute=ValuesGenerator.RandIntcal(random);
						 int startDay=ValuesGenerator.RandIntcal(random);;
						 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
						 int startYear=ValuesGenerator.RandIntcal(random);
						 startHour1 = startHour; 
						 startMinute1 = startMinute; 
						 startDay1 = startDay;
						 startMonth1 = startMonth;
						 startYear1 = startYear;
						 
						 String title="Birthday Party";
						 String description="This is my birthday party.";
						 //Construct a new Appointment object with the initial data	 
						 Appt appt = new Appt(startHour,
						          startMinute ,
						          startDay+4 ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt appt2 = new Appt(startHour,
						          startMinute+1 ,
						          startDay+1 ,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt appt3 = new Appt(startHour,
						          startMinute,
						          startDay,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt appt4 = new Appt(startHour,
						          startMinute,
						          startDay+2,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt apptITR = new Appt(startHour,
						          startMinute ,
						          5,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt apptITR2 = new Appt(startHour,
						          startMinute ,
						          1,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 Appt apptITR3 = new Appt(startHour,
						          startMinute ,
						          10,
						          startMonth ,
						          startYear ,
						          title,
						         description);
						 apptTemp = appt;
						
						 if(j == 12){
							 listAppts.add(appt);
						 }
						 else{
							 listAppts.add(appt);
							 listAppts.add(appt2);
							 listAppts.add(appt3);
							 listAppts.add(appt4);
							 listAppts.add(apptITR);
							 listAppts.add(apptITR2);
							 listAppts.add(apptITR3);
							 calDays.addAppt(appt);
							 calDays.addAppt(appt2);
							 
						 }
						}
					//System.out.print("size: " + listAppts.size());
					calDays2 = timeTable.getApptRange(listAppts, today, tomorrow);
					timeTable.getApptRange(listAppts, today, farAway);
					 Appt appt5 = new Appt(startHour1,
					          startMinute1 ,
					          startDay1 ,
					          startMonth1 ,
					          startYear1 ,
					          "Birthday Party",
					          "This is my birthday party.");
					timeTable.deleteAppt(listAppts, appt5);
					timeTable.deleteAppt(listAppts, null);
					timeTable.deleteAppt(listAppts, apptTemp);
					timeTable.deleteAppt(null, null);
					timeTable.deleteAppt(null, appt5);
					
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
