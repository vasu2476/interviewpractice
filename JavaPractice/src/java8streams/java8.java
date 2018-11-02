package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> asList = Arrays.asList("10","20","30","1","3","32");
		List<Integer> list = asList.stream().map(s->Integer.parseInt(s)).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
