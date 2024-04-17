import java.util.function.BiFunction;

public class Mr5 {

	public static void main(String[] args) {
	
		BiFunction<Integer,String,Student>b=Student::new;
		
	
		
		System.out.println(b.apply(101, "Rod Jhonson"));
	}

}
