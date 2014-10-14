package com.studtman.compositePattern;

import java.util.ArrayList;

/**
 * The Composite. 
 * 
 * @author Ross Studtman
 *
 */
public class Node extends SuperClass {
	
	/**
	 * In a root node this will store other Nodes.
	 * In secondary Nodes this will either store other Nodes
	 * or will store Leaf objects.
	 */
	ArrayList<SuperClass> leaves = new ArrayList<SuperClass>();
	
	// Name of this CompositeNode; A category or group name
	private String nodeName;
	
	// Constructor
	public Node(String nodeName){
		this.nodeName = nodeName;
	}
	
	/**
	 * Add CompositeNode or Leaf object to ArrayList.
	 * <p>This works because CompositeNode's & Leaf's are subclasses of SuperClass.
	 * It's polymorphism, baby!</p>	(non-Javadoc)
	 * @see com.studtman.compositePattern.SuperClass#add(com.studtman.compositePattern.SuperClass)
	 */
	@Override
	protected void add(SuperClass newLeaf){
		leaves.add(newLeaf);
	}
	
	// Remove CompositeNode or Leaf.
	@Override
	protected void remove(SuperClass oldLeaf){
		leaves.remove(oldLeaf);
	}
	
	// Get CompositeNode or Leaf
	protected SuperClass getLeaf(int index){
		return (SuperClass)leaves.get(index);
	}
	
	// Getter
	protected String getNodeName(){
		return nodeName;
	}

	/**
	 * At the CompositeNode level this method is mostly about
	 * being able to traverse the ArrayList and nested
	 * ArrayList(s). This same method in a Leaf object
	 * will perform what we want to the actual objects
	 * we are storing.
	 */
	@Override
	protected void displayNodeOrLeafInfo() {
		System.out.println("CompositeNode: " + getNodeName());
		
		for(SuperClass leaf : leaves){
			leaf.displayNodeOrLeafInfo();
		}
		
		System.out.println();
	}
	
}
