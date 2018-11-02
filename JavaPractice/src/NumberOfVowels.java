import java.util.Scanner;


public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
	    for(char c:str.toCharArray()){
	    	switch(c){
	    	case 'a':
	    	case 'e':
	    	case 'i':
	    	case 'o':
	    	case 'u':
	    		count++;	    		
	    	}
	    	
	    }
	    System.out.println(count);
		
	}

}
