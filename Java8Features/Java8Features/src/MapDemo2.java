import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String>l1=Arrays.asList("python","java","aws","c","c++","Angular");
		
		List<String>l2=l1.stream()
				      .map(s->s)
				      .collect(Collectors.toList());
		System.out.println(l2);
		List<String>l3=l2.stream()
				        .filter(i->i.startsWith("c"))
				        .collect(Collectors.toList());
		
		System.out.println(l3);
		
		List<String>l4=l2.stream()
				       .sorted().collect(Collectors.toList());
		System.out.println(l4);
	}

}
