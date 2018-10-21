package DataStructures;
class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;
	public void insert(int data){
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null){
			head=node;
		}else{
			Node temp=head;
		    while(temp.next!=null){
		    	temp=temp.next;
		    }
		     temp.next=node;
		}
	}
	
	public void insertStart(int data){
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index,int data){
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0){
		   insertStart(data);	
		}else{
		Node temp=head;
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		}
	}
	
	public void deleteAt(int index){
		// no node creation;
		if(index==0){
			head=head.next;
		}else{		
		Node temp=head;
		Node del=null;
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		del=temp.next;	
		temp.next=del.next;
		}
		
		
	}
	
	public void show(){
		Node temp=head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
			
		}
	}
public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insertStart(1);
		l.insertAt(2, 100);
		l.deleteAt(2);
		l.show();

	}

}
