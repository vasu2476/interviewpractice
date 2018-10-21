package DataStructures;

public class QueeEx {

	int front=0;
	int rear=0;
	int capasity=5;
	int Queue[]=new int[capasity];
	
	void insert(int data){
		if(rear==capasity){
			System.out.println("queue is full");
		}else{
			
			Queue[rear]=data;
			rear++;
		}
	}
	void delete(){
		if(rear==front){
			System.out.println("Queue is empty");
		}else{
			
			System.out.println("Deleted element:"+Queue[front]);
			for(int i=0;i<rear-1;i++){
				Queue[i]=Queue[i+1];
			}
			rear--;
		}
	}
	void traverse(){
		if(rear==front){
			System.out.println("Queue is empty");
		}else{
			for(int i=front;i<rear;i++){
				System.out.println(Queue[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueeEx queue=new QueeEx();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.traverse();
		queue.delete();
		System.out.println("after delete");
		queue.traverse();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.delete();
		queue.traverse();
	}

}
