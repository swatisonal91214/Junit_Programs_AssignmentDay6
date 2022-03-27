package com.bl.monthlypayment;

public class MonthlyPaymentCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Monthly Pay calculator!!!");
		
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		double payment = monthlyPayment(P, Y, R);
		System.out.println("Monthly payments need to make over " + Y + " years to pay off a principal loan amount of Rupees " + P + " at a rate of " + R + "% is " + payment  );

	}

	
	public static double monthlyPayment(double P,double Y, double R) {
		
		double n = 12*Y;
		double r = R/(12*100);
		double payment =Math.floor( (P*r)/(1-(Math.pow((1+r),(-n)))));
		return payment;
	}
}
