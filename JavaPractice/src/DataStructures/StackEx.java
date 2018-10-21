package DataStructures;



public class StackEx {

	int top=-1;
	int Stack[]=new int[5];
	
	void push(int data){
		if(isFull()){
			System.out.println("Stack is full");
		}else{
			Stack[++top]=data;
		}
	}
	
	int pop(){
		if(top==-1){
			//System.out.println("stack is under flow");
			return 0;
		}
		else{
			//System.out.println(Stack[top--]);
			return Stack[top--];
		}
	}
	int peek(){
		if(top==-1){
			return 0;
		}else{
			
			//System.out.println(Stack[top]);
			return Stack[top];
		}
	}
	
	public void traverse(){
		if(top==-1){
			System.out.println("stack over floow");
		}
		for(int i=0;i<=top;i++){
			System.out.println(Stack[i]);
		}
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		if(top==4){
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackEx stack=new StackEx();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.traverse();
		
		System.out.println("pop:"+stack.pop());
		stack.traverse();
		
		System.out.println("peek:"+stack.peek());
		stack.traverse();
		System.out.println("pop:"+stack.pop());
		System.out.println("pop:"+stack.pop());
		System.out.println("pop:"+stack.pop());
		
		stack.traverse();
		
	}

}
