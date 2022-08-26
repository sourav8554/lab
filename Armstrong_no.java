package javaprogram2;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,digit;
		int n1=0;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter no : ");
		n=scan.nextInt();
		n1=n;
		while(n!=0) {
			digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}}

	}
	



	


