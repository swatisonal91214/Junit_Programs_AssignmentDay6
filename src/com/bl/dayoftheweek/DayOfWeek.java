package com.bl.dayoftheweek;

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Day Predictor Calender!!!");
		
		int y = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]);
		int result = dayoftheWeek(y,m,d);
		switch(result) {
			case 0: System.out.println("Day is Sunday!!");
		        	break;
			case 1: System.out.println("Day is Monday!!");
        			break;
			case 2: System.out.println("Day is Tuesday!!");
        			break;
			case 3: System.out.println("Day is Wednesday!!");
        			break;
			case 4: System.out.println("Day is Thursday!!");
        			break;
			case 5: System.out.println("Day is Friday!!");
        			break;
			case 6: System.out.println("Day is Saturday!!");
        			break;
			default:System.out.println("Input is not correct!!");
					break;
		}
	}
	
	public static int dayoftheWeek(int y, int m, int d) {
		int finalday = 0;
		int y0,x,m0,d0;
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year ");
		int y = sc.nextInt();								// When you want to take input from user instead of command line			
		System.out.println("Please enter the month ");
		int m = sc.nextInt();
		System.out.println("Please enter the day ");
		int d = sc.nextInt();*/
		
		y0 = y-(14-m)/12;
		x = (y0 +(y0/4)-(y0/100)+(y0/400));
		m0 = m+12*((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;
		finalday = d0;
		return finalday;
		
	}

}
