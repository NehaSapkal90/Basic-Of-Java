package BasicOfJava;

public class swapTwoVariable {

	public static void main(String[] args) {
		
		int num1= 5;
		int num2=6;
		
		System.out.println("Before swap"+"\n"+"num1 : "+num1+"\n"+"num2 : "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1= num1-num2;
		
		System.out.println("After swap"+"\n"+"num1 : "+num1+"\n"+"num2 : "+num2); 

	}

}
