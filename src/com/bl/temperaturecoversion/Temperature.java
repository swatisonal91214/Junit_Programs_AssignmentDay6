package com.bl.temperaturecoversion;

import java.util.Scanner;

public class Temperature {
	
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Temperature Conversion Program!!");
	System.out.println();
	System.out.println("Please select the conversion type you want to do!!");
	System.out.println("1. Celsius to Farenhite    2. Farenhite to celsius");
	double choice = sc.nextDouble();
	double temperaure_result = temperatureConversion(choice);
	System.out.println(temperaure_result);
	sc.close();
	
}
 
 public static double temperatureConversion(double choice) {
	 Scanner sc = new Scanner(System.in);
	 double celsius, farenhite, converted_temperature=0;
	 
	 if(choice == 1) {
		 System.out.println("This is Celsius to Farenhite convertor!!");
		 System.out.println("Enter the temperature in celsius");
		 
	     celsius = sc.nextDouble();
	     System.out.print("The converted temperature from Celsius to Farenhite is : \t");
		 farenhite =((celsius*(1.8))+32);
		 converted_temperature = farenhite;
		 
		 
	 }else if(choice == 2) {
		 System.out.println("This is Farenhite to Celsius convertor!!");
		 System.out.println("Enter the temperature in Farenhite");
		 
		 farenhite  = sc.nextDouble();
		 System.out.print("The converted temperature from Farenhite to Celsius is :  \t" );
		 celsius = ((farenhite-32)*(0.55));
		 converted_temperature = celsius;
	 }else {
		 System.out.println("Please enter  the correct choice!!");
	 }
	 sc.close();
	 return converted_temperature;
	 
	 
 }
}
