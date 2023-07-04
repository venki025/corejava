package BasicProgram;

public class ReverseWhile {

	public static void main(String[] args) {
		 //Reverse the number--->123---321
		 int rev = 0;
		 int num = 123;
		 while(num!=0) {
			 int r = num%10;
			 rev=rev*10+r;
			 num=num/10;
		 }
		 System.out.println("reverse the num:"+rev);

	}

}
