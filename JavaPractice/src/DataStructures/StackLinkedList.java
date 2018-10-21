package DataStructures;

class Nodest{
	int data;
	Node next;
}

class LinkedListst{
	Node head;
	public void insertFirst(int data){
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public int deleteFirst(){
		Node temp=head;
		head=head.next;
		return temp.data;
	}
	
	public void traverse(){
		Node temp=head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	boolean isEmpty(){
		return (head==null);
	}
}
	
public class StackLinkedList {
	LinkedListst st=new LinkedListst();
	public void push(int data){
		st.insertFirst(data);
	}
	public void pop(){
		if(!st.isEmpty()){
			st.deleteFirst();
		}
	}
	
	public void display(){
		st.traverse();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackLinkedList sl =new StackLinkedList();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		
		sl.display();
		System.out.println("remove");
		sl.pop();
		System.out.println();
		sl.display();
		}

}
