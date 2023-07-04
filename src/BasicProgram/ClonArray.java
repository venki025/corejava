package BasicProgram;

public class ClonArray {

	public static void main(String[] args) {
		int intArray[] = {0,1,2,3,4,5,6,7,8,9,};
		int cloneArray[] = intArray.clone();
		System.out.println(intArray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i]+" ");
		}
		
		// multi dimension /shalow copy memory address same 
		int b[][] = { { 1,2,3,4,5}, {6,7,8,9,10} };
		int cloneb[][] = b.clone();
		
		System.out.println(b == cloneb);
		// shallow copy is created following print statemet will print true
		System.out.println(b[0] == cloneb[0]);
		System.out.println(b[1] == cloneb[1]);
		
		for (int i =0; i< cloneb.length; i++) {
			System.out.println(cloneb[i] +"");
		}
		
		   

	}

}
