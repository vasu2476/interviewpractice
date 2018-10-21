package java8streams;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelSortExample {

	int div(int a, int b){
		int c=-1;
		try{
			c=a/b;
		}catch(Exception e){
			System.out.println("Exception");
			
		}finally{
			System.out.println("finally");
		}
		return 	c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	vla2[] va={new vla2(40),new vla2(200),new vla2(60)};
		
		//	Arrays.sort(va,va[0]);
		//	int index=Arrays.binarySearch(va,new vla2(40), va[0]);
			
			
		
		
	}
	
	class vla2 implements Comparator<vla2>{
		int dishsize;
		
		vla2(int a){
			dishsize=a;
		}

		@Override
		public int compare(vla2 o1, vla2 o2) {
			// TODO Auto-generated method stub
			return o2.dishsize-o1.dishsize;
		}
		
	}
	

}
