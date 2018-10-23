package ch4;

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {
		//ints
		int Sunday;
		int Monday;
		int Tuesday;
		int Wednesday;
		int Thursday;
		int Friday;
		int Saturday;
		int today = 0;
		int elapsed = 0;
		int future=(elapsed+today)%7;
		
		Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter Today's day: ");
		today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		elapsed = input.nextInt();
		if (today == 0){
			 System.out.println("today is sunday");
		}
			 else if (today == 1){
				 System.out.println("today is Monday");
			 }
				 else if (today == 2){
					 System.out.println("today is Tuesday");
				 }
				 else if (today == 3){
						 System.out.println("today is Wednesday");
					 } 
				 else if (today == 4){
							 System.out.println("today is Thursday");
						 } 
				 else if (today == 5){
								 System.out.println("today is Friday");
							 } 
				 else if (today == 6){
									 System.out.println("today is Saturday");
									 }
								 else {
									 System.out.println("Error");
								 }
							if (future == 0) {
								System.out.println("future day is sunday");
							}
							else if (future == 1) {
								System.out.println("future day is monday");
							}
								else if (future == 2) {
									System.out.println("future day is tuesday");
								}
									else if (future == 3) {
										System.out.println("future day is wednesday");
									}
										else if (future == 4) {
											System.out.println("future day is thursday");
										}
											else if (future == 5) {
												System.out.println("future day is friday");
											}
												else if (future == 6) {
													System.out.println("future day is saturday");
												}
												else {
													System.out.println("Error");
												}  
							
		
								 
								
								 
								 
		

	}

	
		
	


}

			 
