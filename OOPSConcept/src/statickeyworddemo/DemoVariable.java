package statickeyworddemo;
//static keyword with variable name

/*when any var name is non static and we try to access that var in main method we will get error
 * there4 we have to use static keyword with var name*/

public class DemoVariable {

	static float per = 85.4f;
	
	public static void main(String[] args) {
		 
		//DemoVariable d = new DemoVariable(); create object if not using static keyword with var
		//System.out.println(d.per);
		
		System.out.println(per);
	}

}
