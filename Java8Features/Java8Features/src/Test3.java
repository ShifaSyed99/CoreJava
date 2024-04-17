interface calci
{
	public void calsq(int x);
}
class A implements calci{

	@Override
	public void calsq(int x) {
		System.out.println(x*x);
		
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A a1=new A();
  a1.calsq(10);
	}

}
