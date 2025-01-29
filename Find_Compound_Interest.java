package BasicOfJava;

public class Find_Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WRITE A PROGRAM TO FIND COMPOUND INTEREST
		//WHERE A = AMOUNT (PRINCIPLE+INTEREST)
		//P = PRINCIPLE, R = RATE OF INTEREST, N = NUMBER OF TIMES INTEREST APPLIED PER TIME PERIOD,
		//T = NUMBER OF TIME PERIODS ELAPSED
		
		int p = 1000;
		double r =0.05;
		int n =12;
		int t=5;
		
		double  first = 1+r/n;
		int second = n*t;
		double CI = p*Math.pow(first, second);
		System.out.println(CI);
		
	}

}
