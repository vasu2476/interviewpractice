package java8streams;

import java.io.*;
import java.util.*;



public class test {

	
	public static int fibonacci(int number){ 
		if(number == 1 || number == 2)
		{ return 1;
		}
		//System.out.println(fibonacci(number-1) + fibonacci(number -2));
		return fibonacci(number-1) + fibonacci(number -2); //tail recursion }
	}

	public static void permutation(String input){ permutation("", input); }

	private static void permutation(String perm, String word)
	{ if (word.isEmpty())
	{ System.err.println(perm + word); } 
	else { 
		for (int i = 0; i <word.length(); i++) {
		permutation(perm + word.charAt(i), word.substring(0, i) 
				+ word.substring(i + 1, word.length()));
		}
	}
	}

	
	static String palandrom(String st){
		String rev="";
		for(int i=st.length()-1;i>=0;i--){
			rev=rev+st.charAt(i);
		}
		return rev;
	}
	
	
    public static void main(String[] args) 
    {

    //	fibonacci(2);
    	/*for(int i=1;i<=2;i++){
    		System.out.print(fibonacci(i)+" ");
    	}*/
    	
    //	permutation("ABC");
    	System.out.println(Math.sqrt(6));
    	System.out.println(palandrom("money"));
    	
    	List old=new ArrayList();
    	old.add(1);
    	old.add(2);
    	old.add(3);
    	old.add(null);
    	old.add(4);
    	old.remove(2);
    	//old.remove(new Integer(4));
    	
    	Iterator i=old.iterator();
    	while(i.hasNext()){
    		System.out.println(i.next());
    		
    	}
    	/*
    System.out.println("actual values:");	
    	for(Object i : old){
    		System.out.println(i);
    	}
      System.out.println("After removing duplicates:");
        List newar=new ArrayList();
    	for(Object i : old){
    		if(newar.contains(i)){
    			continue;
    		}else{
    			//System.out.println(i);
    			newar.add(i);
    		}
    	}
    	System.out.println(newar);*/
        

    	
    }
}