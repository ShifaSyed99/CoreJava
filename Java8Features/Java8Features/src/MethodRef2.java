import java.util.function.BiFunction;

class ArithmaticOp{
	static int add(int i,int j) {
		return i+j;
	}
}
class ArithmaticSub{
	public int sub(int a,int b) {
		return  a-b;
	}
}
public class MethodRef2 {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer>b1=ArithmaticOp::add;
		
		int x=b1.apply(12, 10);
		System.out.println(x);
		BiFunction<Integer,Integer,Integer>b2=new ArithmaticSub()::sub;
		
		int result=b2.apply(3, 2);
		System.out.println(result);

	}

}
