package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_int.demo();
		Stack_int.demo();
		Queue_Generic.demo();
		Stack_Generic.demo();
	}
}

/*
 * Output
 * 
*** The demo of int data type of Queue ***
Adding 1
Adding 2
Adding 3
Front element is: 1
Removing 1
Front element is: 2
Queue size is 2
Removing 2
Removing 3
Queue Is Empty
***    The end of the demo    ***


*** The demo of int data type of Stack ***
Inserting 1
Inserting 2
Removing 2
Removing 1
Inserting 2
Top element is: 2
Stack size is 1
Removing 2
Stack Is Empty
***    The end of the demo    ***


*** The demo of Generic T data type of Queue ***
Adding one
Adding two
Adding three
Front element is: one
Removing one
Front element is: two
Queue size is 2
Removing two
Removing three
Queue Is Empty
***    The end of the demo    ***


*** The demo of Generic T data type of Stack ***
Inserting one
Inserting two
Removing two
Removing one
Inserting three
Top element is: three
Stack size is 1
Removing three
Stack Is Empty
***    The end of the demo    ***

*/