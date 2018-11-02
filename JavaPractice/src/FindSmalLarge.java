
public class FindSmalLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={10,4,80,6,20};
		int large=Integer.MIN_VALUE;
		int small =Integer.MAX_VALUE;
		System.out.println("large:small"+large+":"+small);
		for(int i:arr){
			if(i>large){
				large=i;
			}if(i<small){
				small=i;
			}
		}
		System.out.println("large:"+large+"   small:"+small);
	}

}
