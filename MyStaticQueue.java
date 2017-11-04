
public class MyStaticQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
    private int[] items;
    private int numitems, maxitems;
    
	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------
	public MyStaticQueue(int m){
		items = new int[m];
		maxitems = m;
		numitems = 0;
		System.out.println("Array of length: " + items.length);
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStaticQueue is empty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		return numitems == 0;
/*
	    if (numitems == 0)
                return true;
	    return false;
	    */
    }
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStaticQueue: first
	//-------------------------------------------------------------------
	public int first(){
	    return items[0];
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyStaticQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		if (numitems < maxitems){
		    items[numitems] = element;
		    numitems++;
		    System.out.println("Element added, number of elements = " + numitems);
		    return;
	    }
		System.out.println("Queue full: Failed to add element");
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStaticQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
	    if (this.isEmpty()){
	    	System.out.println("Queue is empty: Nothing to remove");
	    	return;
	    }
	    
		for (int x = 0; x < maxitems - 1; x++){
	        items[x] = items [x+1];
	    }
	    items[maxitems - 1] = 0;
	    numitems--;
	    System.out.println("Element removed, new total:" +numitems);
	}
	
}
