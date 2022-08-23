package javaprogram2;

import java.util.Scanner;

public class Posative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        n = s.nextInt();
	        if(n > 0)
	        {
	            System.out.println("The  number  is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The number is Negative");
	        }
	        else
	        {
	            System.out.println("The number is 0 ");
	        }
	    }
	

	}


