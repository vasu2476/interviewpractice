package DataStructures;

public class Pattern {
	/*
*
**
***
****
*****
******
	 */
	public static void pattern1(){
		for(int i=0;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 * Perfect number
	 *  sum of factors of given number
	 */
	public static void perfectNum(int range){
		
		for(int j=2;j<=range;j++){
		int n=j;
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println(n+" is perfect number");
		}
		}
	}
	
	/*
	 * Fibonic serise
	 * 
	 * int a=0,b=1 c
	 * c=a+b; a=b; b=c;
	 */

	static void fibonic(int n){
		
		int a=0,b=1;
		int c=0;
		for(int i=0;i<=n;i++){
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
	
	
	static void palandrom(int num){
		
		// 525
		int temp=num;
		int sum=0;
		int r=0;
		while(temp>0){
			
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		System.out.println(sum);
		if(num==sum){
			System.out.println("palandrom number");
		}
	}
	
	static void factorial(int num){
		
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
			  count++;	
			}
			
			
		}
		if(count>0){
			System.out.println("not a primenumber");
		}else{
			System.out.println("prime number");
		}
	}
	/**
	 * Factorial or each digit sum is same number
	 * 145
	 * 
	 */
	static void strongNumber(int num){
		int temp=num;
		int r=0;
		int sum=0;
		int fact=0;
		while(num>0){
			r=num%10;
			fact=1;
			for(int i=r;i>1;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;

		}
				if(sum==temp){
			System.out.println("strong number"+sum);
		}else{
		//	System.out.println("not a strong number");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pattern1();
		//perfectNum(1000);
		//fibonic(10);
		//palandrom(525);
		
	//	factorial(7);
		strongNumber(147);
		for(int i=1;i<5000;i++){
			strongNumber(i);
		}
	}

}
