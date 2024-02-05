package statickeyworddemo;

class Details
{
	static String name;
	static int rollno;
	
	/*institute name for all the learners are common so we can declare institute name as static*/
	static String insname = "Edubridge";
	
	/*if we want to access non static inside main method than we have to declare it as static*/
	public static void print()
	{
		System.out.println(name+" "+rollno+" "+insname);
	}
}

public class DemoTwo {

	public static void main(String[] args) {
		
		Details.name = "ABC";
		Details.rollno = 101;
		Details.print();

		Details.name = "XYZ";
		Details.rollno = 102;
		Details.print();

	}

}
