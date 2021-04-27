package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question16 {

	public static void main(String[] args) {

		
		System.out.println(simpleRoomBook(false,2,1,2018));
		
/*simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false*/		
		System.out.println(simpleRoomBook(true,2,1,2018));
		System.out.println(simpleRoomBook(true,7,2,2018));
	}

	private static boolean simpleRoomBook(boolean available, int month, int day, int year) {
			if (available==true && year==2018) {
				if (month==7 && day<=8)
					return false;
				else
					return true;
			}
			else 
				return false;
		
	}	
							
				
		

	}

	
	







/* To book a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false */