package week2;

public class Quiz {

	public static void main(String[] args) {
		
		String name = "Tommy";
		int age = 52;

		if (name == "Tommy") {
			System.out.println("Hi, Tommy!");
		} else if (age == 52) {
			System.out.println("52 years old.");
		}
		System.out.println("Out of conditional.");
		
		//
		
//		int numericGrade = 56;
//		char letterGrade = 'A';
//		
//		if (numericGrade >= 90) {
//		letterGrade = 'A';
//		} else if (numericGrade >= 80) {
//			letterGrade = 'B';
//		} else if (numericGrade >= 70) {
//			letterGrade = 'C';
//		} else if (numericGrade >= 60) {
//			letterGrade = 'D';
//		} else {
//			letterGrade = 'F';
//		}
//		
//		System.out.println("The letter Grade for a " + numericGrade + " is a " + letterGrade + ".");
		
		//
		int day = 6;
		int month = 4;
		
		boolean isSummer = month >= 6 && month <=8;
		boolean isWeekday = day < 6;
		
		if (isSummer || !isWeekday) {
			System.out.println("Definitely going to sleep in!");
		} else {
			System.out.println("Probably need to wake up at a decent time.");
			
		}
		
		//
		
		double moneyInWallet = 4.50;
		double costOfMilk = 1.99;
		
		if (moneyInWallet >= costOfMilk * 2) {
			System.out.println("Let's buy two gallons.");
		} else if (moneyInWallet >= costOfMilk) {
			System.out.println("Let's buy one gallon.");
		} else {
			System.out.println("Way too expensive!");
		}
		
		//
		
		for (int index = 0; index <= 99; index++) {
			if (!(index % 2 == 0)) {
				System.out.println(index);
			}
		}
	}
}
