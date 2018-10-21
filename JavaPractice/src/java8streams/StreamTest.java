package java8streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		List<String> myList=new ArrayList<>();
		myList.add("srinu");
		myList.add("welcome");
		myList.add("ksr");
		myList.add("abcd");
		myList.add("java");
		
		List<String> collect = myList.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		//every object 
		IntStream.range(1,10).skip(6).forEach(System.out::print);
		System.out.println(IntStream.range(1,10).skip(6).sum());
		
		Stream<String> bands=Files.lines(Paths.get("c:/CNXTHDASUP.LOG"));
		
		bands.parallel().filter(x->x.contains("7.196")).forEach(s->System.out.println(s));
		
		
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray)
		                .reduce("+", (a,b) -> a + b);
		System.out.println(result);
		
		
			}
	
	
	

}
