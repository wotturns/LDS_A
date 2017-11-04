
public class MyDynamicQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;

	//-------------------------------------------------------------------
	// Basic Operation --> Construct MyDynamicQueue
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyDynamicQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		return head==null;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyDynamicQueue: first
	//-------------------------------------------------------------------
	public int first(){
		//returns the info from the first node
		if (!this.isEmpty()){
			return head.getInfo();
		}
		System.out.println("Queue is empty");
		return -1;
	}


	public MyNode last(){
		//method to return the last node in the queue
	    MyNode n = head;
		while (n.getNext()!=null) {
			n = n.getNext();
		}
        return n;
	}


	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyDynamicQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		if (isEmpty()){
			head  = new MyNode(element, null);
			System.out.println("Added first element (" + head.getInfo() +")");
		}
		else{
			this.last().setNext( new MyNode(element, null));
			System.out.println("Added new element (" + this.last().getInfo()+")");
		}

	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyDynamicQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		if(!isEmpty()) {
			System.out.println("Removing " + head.getInfo());
			head = head.getNext();
			return;
		}
		System.out.println("Queue already empty");
	}
	
}
