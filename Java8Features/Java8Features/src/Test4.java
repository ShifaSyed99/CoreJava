interface Greetings{
	public void msg();
}
public class Test4 {

	public static void main(String[] args) {
		
		Greetings g1=()->System.out.println("Good Afternoon!!!!");	
		
		g1.msg();

	}

}
