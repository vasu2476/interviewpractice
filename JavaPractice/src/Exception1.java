
class ThrowException extends Exception{
	ThrowException(String msg){
		super(msg);
	}
}

public class Exception1 {

	void disp()throws ThrowException{
		System.out.println("hello");
		throw new ThrowException("exception");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exception1 e=new Exception1();
		try {
			e.disp();
			System.out.println("after exception method");
		} catch (ThrowException e1) {
			// TODO Auto-generated catch block
			System.out.println("in chatch");
			e1.printStackTrace();
		}finally{
			System.out.println("in finally");
		}
		
		System.out.println("after finally");
	}

}
