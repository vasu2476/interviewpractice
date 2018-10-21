package DataStructures;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };	
		System.out.println("before Sort" + Arrays.toString(input));
		mergeSort(input);
		System.out.println("after sort"+Arrays.toString(input));
	}

	private static void mergeSort(int[] input) {

		mergeSort(input,0,input.length-1);
	}

	private static void mergeSort(int[] input, int start, int end) {
		
		int mid=(start+end)/2;
		if(start<end){
			mergeSort(input,start,mid);
			mergeSort(input,mid+1,end);
		}
		
		int i=0;
		int first=start;
		int last=mid+1;
		int temp[]=new int[end-start+1];
		
		while(first<=mid && last<=end){
			System.out.println(Arrays.toString(input));
			System.out.println("compare :"+input[first]+"<"+input[last]);
			temp[i++]= input[first]<input[last]? input[first++]:input[last++];
			System.out.println(i+"   "+Arrays.toString(temp)+" first: "+first+" last:"+last);
		}
		while(first<=mid){
			temp[i++]=input[first++];
		}
		while(last<=end){
			temp[i++]=input[last++];
		}
		i=0;
		while(start<=end){
			input[start++]=temp[i++];
		}
	}

}
