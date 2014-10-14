package com.studtman.compositePattern;

/**
 * The Component.
 * 
 * @author Ross Studtman
 *
 */
public abstract class SuperClass {
	/**
	 * Adds a new leaf or node to the "tree".
	 * @param newLeafOrNode can be either a leaf or node, both
	 * will have the SuperClass as a super type.
	 */
	protected void add(SuperClass newLeafOrNode){}
	
	/**
	 * Removes a leaf or node from the "tree".
	 * @param oldLeafOrNode
	 */
	protected void remove(SuperClass oldLeafOrNode){}
	
//	protected SuperClass getLeafOrNode(int indexInList){
//		return null;
//	}
	
	protected abstract void displayNodeOrLeafInfo();	
}
