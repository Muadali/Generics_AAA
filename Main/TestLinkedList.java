package Main;
import Generics_AAA.GenericLinkedList;
import Generics_AAA.GenericNode;
import Generics_AAA.LinkedList;
import Generics_AAA.Node;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		
		// Adding data to generic linkedlist
        // Creating object of GenericLinkedList of type Integer
        GenericLinkedList<Integer> integerList = new GenericLinkedList<Integer>();
        GenericNode<Integer> integerNode = new GenericNode<Integer>();
        integerNode.setData(12);
        integerList.addNode(integerNode);


        // Creating object of GenericLinkedList of type Integer
        GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
        GenericNode<Double> doubleNode = new GenericNode<Double>();
        doubleNode.setData(12.00);
        doubleList.addNode(doubleNode);

        // Creating object of GenericLinkedList of type Integer
        GenericLinkedList<String> stringList = new GenericLinkedList<String>();
        GenericNode<String> stringNode = new GenericNode<String>();
        stringNode.setData("My String data");
        stringList.addNode(stringNode);

	}//end main
	
	

}//end class



