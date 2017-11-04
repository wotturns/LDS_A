
/**
* The main class of our project.<br>. 
*/
public class MyMain {

	//-------------------------------------
	//	testMyQueue 
	//-------------------------------------	
	/** 
	* This function test the MyStaticQueue static implementation.<br>
	*/
	public static void testMyQueue() {
		
		//-------------------------------------
		//	1. We create myStaticQueue 
		//-------------------------------------
		MyStaticQueue m = new MyStaticQueue(3);  

		//-------------------------------------
		//	2. isEmpty 
		//-------------------------------------
		System.out.println("Is it empty: " + m.isEmpty()); //--> The current length is 0 as myStaticQueue is created initially empty
				
		//-------------------------------------
		//	3. Add three elements 
		//-------------------------------------
		m.add(3); //--> m : [3]
		m.add(4);	//--> m : [3, 4]	
		m.add(5); //--> m : [3, 4, 5]
		m.add(6); //--> Fails, as myStaticQueue is already full
		
		//-------------------------------------
		//	4. Get the first item in myStaticQueue and make myStaticQueue  
		//-------------------------------------	
		System.out.println("First item = " + m.first()); //--> Returns 3
		m.remove();
		System.out.println("First item = " + m.first()); //--> Returns 4
		
		//-------------------------------------
		//	5. Remove two elements and fail to remove another one
		//-------------------------------------			
		m.remove(); //--> m : [5]
		m.remove(); //--> m : []
		m.remove(); //--> Fails, myStaticQueue is already empty
	}
	
	//-------------------------------------
	//	main 
	//-------------------------------------		
	/**
	 * Main Method:<br> 
	 * Calls to the function testMyQueue to test MyStaticQueue and its implementation.<br>
	 * @param args: We will run the program parameter free, so do not worry about it. 
	 */	
	public static void main(String[] args) {
		//1. We call to the function testMyQueue
		testMyQueue();
	}

}
