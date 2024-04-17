interface Calculation{
	public void findsquare(int no);
}
public class Test2 {

	public static void main(String[] args) {
		
		Calculation c1=(int no)->System.out.println(no*no);
		c1.findsquare(10);

	}

}
