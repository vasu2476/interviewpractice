import java.util.Arrays;


public class fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=i;
		}
		Arrays.fill(arr,1,4,9);
	
for(int i=0;i<5;i++){
	System.out.println(arr[i]);
}
}
}
