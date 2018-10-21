@FunctionalInterface
interface Funct{ //SAM
	void m1();// default abstract, simple abstract method.
	
	default void  m2(){
		
	}
	static void m3(){
		
	}
	
}


public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Funct f=()->System.out.println("hi");
	f.m1();
	
	Runnable r=()->{
		for(int i=0;i<10;i++){
		System.out.println("child thread");	
		}
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++){
		 System.out.println("main thread");
	 }

	}
 }
