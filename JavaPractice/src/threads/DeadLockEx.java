package threads;


public class DeadLockEx {

	static Object lock1=new Object();
	static Object lock2=new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One t1=new One();
		Two t2=new Two();
		t1.start();
		t2.start();
	

	}
	
	private static class One extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock1){
				System.out.println("th1 holding lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("th1 waiting for lock 2");
			synchronized(lock2){
				System.out.println("th1 holding lock 1 & 2");
			}
		}
		
	}
	private static class Two extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(lock1){
				System.out.println("th2 holding lock2");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("th2 waiting for lock1");
			}
			synchronized(lock2){
				System.out.println("th2 holding lock 1&2");
			}
			
		}
		
		
	}


}
