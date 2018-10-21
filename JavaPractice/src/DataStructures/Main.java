package DataStructures;

import java.util.Arrays;

public class Main{
	static int j=0;
	public static void main(String ar[]){
		
		int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };

		System.out.println(Arrays.toString(input));
		mergeSort(input);
		System.out.println("after sort");
		System.out.println(Arrays.toString(input));
	}

	private static void mergeSort(int[] input) {
		
		mergeSort(input,0,input.length-1);
		
	}

	private static void mergeSort(int[] input, int start, int end) {
		
//		System.out.println("start:"+start+"end:"+end);
		System.out.print(j++);
		
		int mid=(start+end)/2;
		System.out.println("      "+mid);
		if(start<end){
			mergeSort(input,start,mid);
			mergeSort(input,mid+1,end);
		}

		int i=0;
		int first=start;int last=mid+1;
		int temp[]=new int[end-start+1];
		while(first<= mid && last<=end ){
			temp[i++]=input[first]<input[last]?input[first++]:input[last++];
			//System.out.println(Arrays.toString(temp));
		}
		
		//System.out.println(Arrays.toString(temp));
		
		while(first<=mid){
			temp[i++]=input[first++];
		}
		while(last<=end){
			temp[i++]=input[last++];
		}
		System.out.println(Arrays.toString(temp));
		i=0;
		while(start<=end){
			input[start++]=temp[i++];
		}
	}
}

