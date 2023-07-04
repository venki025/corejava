package BasicProgram;

public enum EnumEx {
	Winter,Summer(1), Monsoon;
, EnumExample	private int index;
	
	EnumEx(int i) {
	// TODO Auto-generated constructor stub
}
	private void EnumExample(int index) {
		// TODO Auto-generated constructor stub
		this.index=index;
	}
	public static void main(String[] args) {
		System.out.println("EnumExample.Monsoon.index");
		

}
