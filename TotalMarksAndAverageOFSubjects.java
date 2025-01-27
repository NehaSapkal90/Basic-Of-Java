package BasicOfJava;

public class TotalMarksAndAverageOFSubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WRITE A PROGRAM TO DISPLAY TOTAL MARKS AND AVERAGE OF SUBJECTS
		int mar = 52;
		int hindi = 46;
		int eng = 45;
		int math = 76;
		int chem = 73;
		int subcnt=5;
		int sum = mar+hindi+eng+math+chem;
		System.out.println("Total Marks : "+sum);
		float avg = sum/subcnt;
		System.out.println("Total avg : "+avg);
		
		

	}

}
