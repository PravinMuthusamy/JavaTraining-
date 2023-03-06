package exercise.Ex6;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class PredictDateAndTime{
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the speed");
			int speed = scan.nextInt();
			System.out.println("Enter the distance");
			int distance = scan.nextInt();
			new PrintTime(speed, distance);
	}
}
class PrintTime {
	static int speed, distance, dayDistance, totalDistance = 0;
	PrintTime(int s, int d) {
		speed = s;
		distance = d;
		dayDistance = speed*8;
		calculateTime();
	}
	void calculateTime() {
		int hour=LocalDateTime.now().getHour();
		LocalDate localDate=LocalDate.now();
		if((24-hour)<=8) {
			totalDistance=((24-hour))*speed;
			System.out.print(localDate);
			System.out.print("-Working Day ");
			System.out.println("Distance covered "+totalDistance);
			if(totalDistance >=distance) {
				System.out.println("Delivery Date:");
				System.out.println(localDate);
				System.out.println((float)(distance/speed)+" hrs");
			return;
			}
			localDate=localDate.plusDays(1);
		}
		if(dayDistance >=distance) {
			System.out.print(localDate+" ");
			System.out.println((float)(distance/speed)+" hrs");
			return;
		}
		while(totalDistance <=(distance-dayDistance)) {
			if(isLeave(localDate))  {
				System.out.print(localDate);
				System.out.print("-Leave ");
				System.out.println("Distance covered "+totalDistance);
			}
			else {
				System.out.print(localDate);
				System.out.print("-Working Day ");
				totalDistance+=dayDistance;
				System.out.println("Distance covered "+totalDistance);
			}
			
			localDate=localDate.plusDays(1);
		}
		float remainingTime;
		 if(totalDistance==distance) {
			remainingTime=8;
			localDate=localDate.minusDays(1);
		}else {
		remainingTime=((float)(distance-totalDistance)/(float)speed);
		remainingTime=(float)Math.floor(remainingTime * 100) / 100;
		}
		 if(isLeave(localDate))  {
				
				System.out.print(localDate);
				System.out.print("-Leave");
				System.out.println(" Distance covered "+totalDistance);
				localDate=localDate.plusDays(1);
			}
		System.out.println("Delivery Date:");
		System.out.println(localDate+" ");
		System.out.println(remainingTime+" hrs");
	}
	
	
	boolean isLeave(LocalDate localDate) {
		DayOfWeek day=localDate.getDayOfWeek();
		int dayOfWeek=day.getValue();
		int date=localDate.getDayOfMonth();
		Month months=localDate.getMonth();
		int month=months.getValue();
		if(dayOfWeek==7 || (month==1 && date==26)||(month==1 && date==1)|| month==8 &&date==15 || (dayOfWeek==6 && date>7 && date<=14)){
		
			return true;
		}
			return false;
	}
		
}