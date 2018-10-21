package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class IncrementEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		Runnable r=()->{
			for(int i=0;i<10;i++){
				System.out.println(i);
			}
		};
		service.execute(r);
		Future<?> submit = service.submit(r);
		try {
			Object object = submit.get();
			System.out.println(object);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
