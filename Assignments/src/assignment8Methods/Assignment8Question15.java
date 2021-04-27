package assignment8Methods;

import java.util.Scanner;

public class Assignment8Question15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current ID: ");
		int currentId=sc.nextInt();
		System.out.println("Enter Task ID: ");
		int taskId=sc.nextInt();
		
		System.out.println(validateTask(taskId,currentId));

	}

	
			public static boolean validateTask(int x, int y) {
				
				if (y==0)
					return false;
				if (y>0&&(x-y)<=1)
					return true;
				else 
					return false;
							
				
			}
	
}


/* We have a to do list app, every time a user adds a task - a few things needed to be checked.

It should not be empty. boolean parameter needs to be true
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7) 
so the next task id is 8 , it can't be 10.


for example:

validateTask(true,2,1)
returns true

validateTask(true,3,1)
returns false

validateTask(false,3,2)
returns false */