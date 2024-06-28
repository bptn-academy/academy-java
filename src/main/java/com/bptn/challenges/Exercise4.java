package com.bptn.challenges;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to find the number of days in a month. 
		//February 2016 has 29 days 
		Scanner input = new Scanner(System.in);
		System.out.println("Input a month number: ");
		int month = input.nextInt();
		System.out.println("Input a month year: ");
		int year = input.nextInt();
		String monthName= " ";
		int daysInMonth = 0;	
		//30 days has sept,apr,jun, nov.all the rest are 31 except feb leap year//           
		//if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

		//System.out.println(monthName + " " + year + " has " + daysInMonth + " days");
		switch (month) {
		case 1:
			 monthName = "January";
			 daysInMonth  = 31;
			break;
		case 2:
			monthName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				 daysInMonth  = 29;
			} else {
				 daysInMonth  = 28;
			}
						
			break;
		case 3:
			monthName = "March";
			 daysInMonth  = 31;			
			break;
		case 4:
			monthName = "April";
			 daysInMonth  = 30;			
			break;
		case 5:
			monthName = "May";
			 daysInMonth  = 31;			
			break;
		case 6:
			monthName = "June";
			 daysInMonth  = 30;			
			break;
		case 7:
			monthName = "July";
			 daysInMonth  = 31;			
			break;
		case 8:
			monthName = "August";
			 daysInMonth  = 31;			
			break;
		case 9:
			monthName = "September";
			 daysInMonth  = 30;			
			break;
		case 10:
			monthName = "October";
			 daysInMonth  = 31;			
			break;
		case 11:
			monthName = "November";
			 daysInMonth  = 30;			
			break;
		case 12:
			monthName = "December";
			 daysInMonth  = 31;			
			break;
		//default:
			//monthName = "This month does not exist so";
			 //daysInMonth  = 0;	
			//System.out.println("Input the correct month");
		} 
		System.out.println(monthName + " " + year + " has " + daysInMonth + " days");

	}

}
