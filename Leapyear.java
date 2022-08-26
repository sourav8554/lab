package javaprogram2;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year;
	      System.out.println("Enter an Year : ");
	      Scanner scan = new Scanner(System.in);
	      year = scan.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("This year is a leap year");
	      else
	         System.out.println("This year is not a leap year");
	   }
	


	}


