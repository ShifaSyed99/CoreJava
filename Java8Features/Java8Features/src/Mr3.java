import java.util.function.BiFunction;

class Op{
	
	public int add(int a1,int b1) {
		return a1+b1;
	}
	public int Sub(int a1,int b1) {
		return a1-b1;
	}
	public int mul(int a1,int b1) {
		return a1*b1;
	}
	public int div(int a1,int b1) {
		return a1/b1;
	}
}
public class Mr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,Integer>bb=new Op()::add;
		
		int result=bb.apply(10, 20);
		
		System.out.println("Addition:"+result);

		BiFunction<Integer,Integer,Integer>bb1=new Op()::Sub;
		
		int result1=bb.apply(30, 20);
		
		System.out.println("Substraction:"+result1);
		
		BiFunction<Integer,Integer,Integer>bb3=new Op()::mul;
		
		int result2=bb.apply(10, 20);
		
		System.out.println("multiplication:"+result2);
BiFunction<Integer,Integer,Integer>bb4=new Op()::div;
		
		int result3=bb.apply(10, 20);
		
		System.out.println("Division:"+result3);
	}

}
