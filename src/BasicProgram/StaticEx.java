package BasicProgram;
class Student{
	 public static int fee;
	 public static String name="Venki";
}	 
	 public class StaticEx {

	public static void main(String[] args) {
		Student.fee=5000;
		System.out.println("fee:"+Student.fee);
		//Student.name="Lovely";
		System.out.println("Name :"+Student.name);
		

	}

}
