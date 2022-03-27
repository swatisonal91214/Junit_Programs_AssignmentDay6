package com.bl.sqrt;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		double sqrtvalue;
		System.out.println("Welcome to Square root calculator!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a non negative number for the calculation!!");
		double c = sc.nextDouble();
		if(c<=0) {
			System.out.println("Wrong Input...!!!  Please enter a non negative number !!!");
		}else {
			sqrtvalue = Math.floor(sqrt(c));
			System.out.println("The SquareRoot value of " + c + " is "+ sqrtvalue);
		}

	}
	
	public static double sqrt(double c) {
		
		double sqrtvalue = 0;
		double t = c;
		double epsilon = 1e-15;
		
		do {
		t = ((c/t)+ t)/2;
		}
		while((Math.abs(t-(c/t)))>(epsilon*t)) ;
		sqrtvalue = t;
		return sqrtvalue;
		
	}

}
