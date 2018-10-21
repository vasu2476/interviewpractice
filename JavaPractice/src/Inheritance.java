
public class Inheritance {

	static boolean flag=true;
	public static void main(String[] args) {
	
		Runnable odd=()->{
			for(int i=1;i<=10;)
				if(Inheritance.flag){
					System.out.println(Thread.currentThread().getName()+i);
					i+=2;
					Inheritance.flag=!Inheritance.flag;
					System.out.println("Inheritance.flag"+Inheritance.flag);
				}
		};
		Runnable even=()->{
			for(int i=2;i<=10;){
				if(!Inheritance.flag){
					System.out.println(Thread.currentThread().getName()+i);
					i+=2;
					Inheritance.flag=!Inheritance.flag;
					System.out.println("Inheritance.flag"+Inheritance.flag);
				}
			}
		};
		
		
		Thread t1=new Thread(odd,"odd");
		Thread t2=new Thread(even,"even");
		t1.start();
		t2.start();
		
		
	}

}
