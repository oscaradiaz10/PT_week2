package week2;

public class Practice {
	
	public static void main(String[] args) {
		String firstName = "Oscar";
		String lastName = "Diaz";
			System.out.println(firstName + " " + lastName);
		//
		boolean isRaining = true;
		if(!isRaining){
		  System.out.println("It's not raining, so I can go for a walk.");
		} else {
		  System.out.println("It's raining, so I'll stay indoors.");
		}
		// 
		int age = 17;
	    boolean canGetDriversLicense;

	    if (age >= 16){
	        canGetDriversLicense = true;
	    } else {
	       canGetDriversLicense = false;
	    }

	    if (canGetDriversLicense){
	        System.out.println("You can get your driver's license!");
	    } else {
	        System.out.println("You are not legally old enough to drive!");
	    }
	    //
	    int number = 31;

	    if (number < 0) {
	        System.out.println("The number is negative.");
	    } else if (number < 10) {
	        System.out.println("The number is between 0 and 9.");
	    } else if (number < 20) {
	        System.out.println("The number is between 10 and 19.");
	    } else if (number < 30) {
	        System.out.println("The number is between 20 and 29.");
	    } else {
	        System.out.println("The number is greater than or equal to 30.");
	    }
	    //
	    double sundayTemp = 87.2;
	    double mondayTemp = 89.1;
	    double tuesdayTemp = 92.0;
	    
	    if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
            System.out.println("Sunday");   
        } else if (mondayTemp > sundayTemp && mondayTemp > tuesdayTemp) {
            System.out.println("Monday");
        } else {
            System.out.println("Tuesday");
        }
	    //
	    String dayOfWeek = "Tuesday";
	    switch (dayOfWeek) {
	        case "Monday":
	            System.out.println("It's Monday! Time to start the week.");
	            break;
	        case "Friday":
	            System.out.println("It's Friday! Time to celebrate the weekend.");
	            break;
	       case "Sunday":
	       case "Saturday":
	            System.out.println("It's the weekend. Enjoy!");
	            break;
	        default:
	            System.out.println("It's a weekday. Keep working hard!");
	    }
	    //
	    int numberOfPeople = 6;
	    System.out.println("What type of vehicle should we rent with " + numberOfPeople + " people?");

	    switch (numberOfPeople) {
	        case (1) :
	        case (2) :
	            System.out.println("A motorcycle, a convertible, or a sports car!");
	            break;
	        case (3) :
	        case (4) :       
	        case (5) :
	            System.out.println("A sedan might be a good choice.");
	            break;
	        case (6) :
	        case (7) :
	            System.out.println("An SUV or a minivan.");
	            break;
	        default:
	            System.out.println("A large van or maybe a bus?");
	    }
	    //
	    int monthNumber = 5;
	    
	    switch (monthNumber) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
           break;
        case 3: 
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid Month");
	    }
	    //
	    String month = "October";
	    
	    int days = -1;
	    
        switch( month.toLowerCase() ) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
            break;
            
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
            break;
            
            case "february":
                days = 28;
            break;
        }
        if (days == -1) {
            System.out.println("Invalid month");
        } else {
            System.out.println("Has " + days + " days");
        }
        //
        String day = "monday";
        
        switch( day ) {
        case "monday":
        case "Tuesday":
        case "WeDnEsDaY":
        case "thursday":
        case "Friday":
            System.out.println( day + " is a weekday.");
        break;
        case "Saturday":
        case "Sunday":
            System.out.println(day + " is a weekend day.");
        break;
        default:
            System.out.println("Invalid day!");
        }
        
        
        // // LOOPS
        // For Loop ( ++ adds one) ( += 2 will add 2) ( -- subtract one) 
        for (int i = 0; i < 5; i++) {
        	System.out.println("Iteration" + " " + i);
        }
        
        for (int i = 5; i >= 0; i--) {
        	System.out.println("Iteration" + " " + i);
        }
        
        //While Loop
        int i = 1;
        while (i < 4) {
        	System.out.println(i);
        	i++;
        }
        	System.out.println("Done!");	
        
        //Do-While
        int a = 0;
        
        do {
        	System.out.println("Iteration" + a);
        	a++;
        } while (a <= 5);
        
        //for-each
//        		int[] numbers = {1, 2, 3, 4, 5};
//        			for (int number : numbers) {
//        			System.out.println("Number: " + number);
//        		}
        
        //
//		        int counter = 0;
//		        for (int d = 1; d < 100; d += 2) {
//		            counter++;
//		            System.out.println(counter);
//		        }
        //
        int num = 1; 

        for (int d = 1; d <= 10; d++) {
            System.out.printf("%d x %d = %d%n", num, d, num * d);
        }
        
        //
        int userNumber = 98;
        if (userNumber >= 0 && userNumber <= 100) {
    	    int currentNumber = userNumber;
            while (currentNumber <= 100) {
                System.out.println(currentNumber);
                currentNumber++;
            }
    	} else {
    	    System.out.println("Your number was not between 1 and 100.");
    	}
        
        //
        int base = 2;
        int power = 2;
        int result = 1;
        for (int g = 1; g <= power; g++) {
            result *= base;
        }
        
        System.out.println("g" + " " +result);
        
        //
        int userNumber1 = 11;
        if (userNumber1 > 10 && userNumber1 <100) {
            do {
            	System.out.println(userNumber1);
                userNumber1--;
     	    } while (userNumber1 >= 10);
        } else {
        	System.out.println("Your number is not a value that is more than 10 and less than 100.");
        }
        
        
        //
        int x = 0;
        do{
            System.out.println("I will print!");
            x++;
        } while (x > 1);
        
        //
        int v = 0;
        int y = 0;
        for ( int z = 0; z < 5; z++ ) {
        	if (( ++v > 2 ) && ( ++y > 2 )) {
        		v++;
        	}
        }
        System.out.println( v + " " + y);
        
	}
}
