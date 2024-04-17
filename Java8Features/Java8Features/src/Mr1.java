import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mr1 {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(100,10,25,63);
		
		List<Integer>l2=l1.stream().map(x->x)
				.collect(Collectors.toList());
		
		System.out.println(l1);

	}

}
