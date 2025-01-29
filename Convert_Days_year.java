package BasicOfJava;

public class Convert_Days_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		write a program to convert days into year, weeks and days
//		i/p :
//		373
//		o/p :
//		year : 1
//		month : 0
//		weeks : 1
//		days : 1

		int num = 373;
		int year = num / 365;
		System.out.println("year : " + year);
		int rem = num % 365;
		int month = rem / 30;
		System.out.println("month : " + month);
		int rem1 = rem % 30;
		int week = rem1 / 7;
		System.out.println("weeks : " + week);
		int rem2 = rem1 % 7;
		int days = rem2 % 7;
		System.out.println("Days : " + days);

	}

}
