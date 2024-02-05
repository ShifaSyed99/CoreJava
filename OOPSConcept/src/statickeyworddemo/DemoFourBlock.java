package statickeyworddemo;

public class DemoFourBlock {
	
	int a;
	static String s;
	
	//static block is used to initialise static var only
	static
	{
		//a = 1; cant access since non static
		s = "Static Block";
	}
	
	static void print()
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		DemoFourBlock.print();
		
		System.out.println(s);
	
	}
}
