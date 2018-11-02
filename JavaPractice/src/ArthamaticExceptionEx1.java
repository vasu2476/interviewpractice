
public class ArthamaticExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		int m=10;
		try{
		System.out.println(m/n);
		System.out.println("in try");
		}catch(ArithmeticException e){
			System.out.println("arthamatic exception");
		}finally{
			System.out.println("in finally");
		}
	}

}
