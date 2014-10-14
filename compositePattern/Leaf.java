package com.studtman.compositePattern;

/**
 * The Leaf.
 * 
 * The Leaf class is so named to demonstrate that it is a detail object belonging to a 
 * category of like objects. Leaf objects are stored in CompositeNode objects' ArrayList.
 * 
 * @author Ross Studtman
 *
 */
public class Leaf extends SuperClass{

	// Any fields you like
	private String leafName;
	private int someField;
	
	// constructor
	protected Leaf(String name, int data){
		this.leafName = name;
		this.someField = data;
	}
	
	/**
	 * This method is for accessing what you need
	 * from Leaf objects. It is important that this
	 * method have the same signature as the CompositeNode
	 * method that accesses the ArrayList that these
	 * leaves are stored in. This method is recursively
	 * called and in order for this pattern to work this
	 * method needs to perform looping in Nodes and then
	 * perform whatever we want down here in Leaf objects.
	 */
	@Override
	protected void displayNodeOrLeafInfo() {
		System.out.println("Leaf name: " + getLeafName() +", Other data: " +getSomeField());		
	}
	
	// Getters & Setters
	protected String getLeafName(){
		return leafName;
	}
	
	protected void setLeafName(String name){
		this.leafName = name;
	}
	
	protected int getSomeField(){
		return someField;
	}
	
	protected void setSomeField(int data){
		this.someField = data;
	}
	

}
