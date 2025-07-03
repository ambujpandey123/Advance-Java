class Node{
	Node next;
	int data;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Linked_List {
     int size=0;
     Node head=null;
     
     void addFront(int data) {
    	 size++;
    	 Node newNode = new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    	 }
    	 newNode.next = head;
    	 head=newNode;
     }
     void addLast(int data) {
    	 size++;
    	 Node newNode = new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    	 }
    	 Node currentNode=head;
    	 while(currentNode.next != null) {
    		 currentNode=currentNode.next;
    	 }
    	 currentNode.next=newNode;
     }
     void addMiddle(int position,int data) {
    	 Node newNode = new Node(data);
    	 if(head==null) {
    		 return;
    	 }
    	 if(position==1) {
    		 addFront(data);
    		 return;
    	 }
    	 Node currentNode=head;
    	 int count=1;
    	 while(currentNode != null) {
    		 count++;
    		 if(count==position) {
    			 size++;
    			 Node temp = currentNode.next;
    			 currentNode.next=newNode;
    			 newNode.next=temp;
    			 return;
    		 }
    		 currentNode=currentNode.next;
    	 }
     }
     void printList() {
    	 if(head==null) {
    		  System.out.println("null");
    		 return;
    	 }
    	 Node currentNode=head;
    	 while(currentNode != null) {
    		 System.out.print(currentNode.data + " -> ");
    		 currentNode=currentNode.next;
    	 }
    	 System.out.println("null");
     }
     void removeFirst() {
    	 if(head==null)  return;
    	  head=head.next;
    	  size--;
     }
     void removeLast() {
    	 if(head==null)  return;
    	 Node current=head;
    	 while(current.next.next != null) {
    		 current=current.next;
    	 }
    	 current.next=null;
    	 size--;
     }
     void removeMiddle(int position){
    	 if(head==null)  return;
    	 if(position==1) {
    		 removeFirst();
    		 return;
    	 }
    	 Node currentNode = head;
    	 int count=1;
    	 while(currentNode.next != null) {
    		 count++;
    		 if(count==position) {
    			 size--;
    			 currentNode.next=currentNode.next.next;
    			 return;	 
    		 }
    		 currentNode = currentNode.next;					 
    	 }
     }
     
     void reverseIterate() {
    	 if(head==null || head.next==null) return;
    	 
    	 Node prevNode = head;
    	 Node currentNode = head.next;
    	 while(currentNode != null) {
    		 Node nextNode = currentNode.next;
    		 currentNode.next=prevNode;
    		 
    		 prevNode=currentNode;
    		 currentNode=nextNode;
    	 }
    	 head.next=null;
    	 head=prevNode;
     }
     Node reverseRecursive(Node head) {
    	 if(head==null || head.next==null) return head;
    	 Node newHead = reverseRecursive(head.next);
    	 head.next.next=head;
    	 head.next=null;
    	 
    	 return newHead;
     }
     
	public static void main(String[] args) {	 
		Linked_List ll = new Linked_List();
		ll.addLast(2);
		ll.addLast(4);
		ll.addFront(1);
		ll.addMiddle(3, 3);
		ll.printList();
		ll.head = ll.reverseRecursive(ll.head);
		ll.printList();
		System.out.println("LinkedList size: "+ll.size);
	}

}
