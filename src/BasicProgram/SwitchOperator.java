package BasicProgram;

import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {
		char operator;
		   int number1, number2, result;
		   Scanner input = new Scanner(System.in);
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);
		    System.out.println("Operator==>"+operator);
		

		    // ask users to enter numbers
		    System.out.println("Enter first number");
		    number1 = input.nextInt();

		    System.out.println("Enter second number");
		    number2 = input.nextInt();

		    switch (operator) {

		      
		      case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

	}
	
	}
}	


