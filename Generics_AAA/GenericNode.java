/**
* author: Abdifatah Abdi
* In GenericNode class takes an argument of type T that is a generic data type.
* and based on that argument it creates a class that will create a Node of passed data type
*/

package Generics_AAA;

public class GenericNode<T> {
	
	//private String data;  //data that the object stores
	//private Node nextNode; //pointer to the nextNode that will be in LinkedList
	private T data; // data that the object stores
    private GenericNode<T> nextNode; // pointer to the nextNode that will be in LinkedList

	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode(){
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	
	
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param aNode
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	
	
	public GenericNode<T> getNextNode() {
        return nextNode;
    }// end getNextNode

}
