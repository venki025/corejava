package BasicProgram;
class operation{
	void addition(int a,int b, int c) {
		//System.out.println("addition of 3 number"+(a+b+c));
	}
	int divide(int a,int b) {
		return a-b;
	}
	int multiply(int a,int b) {
		return a*b;
		
	}
}

public class Operation2 {

public static void main(String[] args) {
		operation venki=new operation();
		 venki.divide(15,5);
		venki.multiply(10,5);
		 System.out.println("multiply"+venki.multiply(10,5));
		 System.out.println("divide"+ venki.divide(15,5));
		

	
	}

}
