interface Shape{
	
	public void show() ;
}
class Cube implements Shape{

	@Override
	public void show() {
		System.out.println("This is cube shape class");
		
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		Cube c1=new Cube();
		
		c1.show();

	}

}
