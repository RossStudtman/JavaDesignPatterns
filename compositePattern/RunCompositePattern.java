package com.studtman.compositePattern;


public class RunCompositePattern {

	
	public static void main(String[] args) {
		
		// Create category; the embedded ArrayList in this CompositeNode will hold other nodes
		SuperClass categories = new Node("Categories\n");	// has its own ArrayList
		
		// Create nodes; the embedded ArrayList in these Nodes will hold leaves.
		SuperClass cereal = new Node("Cereal");  	// has its own ArrayList
		SuperClass dairy = new Node("Dairy");		// has its own ArrayList
		
		// Add nodes to categories' ArrayList
		/*
		 * JVM dynamic binding is why the subclass' "add" method is invoked
		 * rather than the superclass' "add" method (which has no implementation
		 * in the SuperClass).
		 */
		categories.add(cereal);
		categories.add(dairy);
		
		// Create leaves and add to correct nodes' ArrayList
		Leaf leaf = new Leaf("Captain Crunch", 200);
		cereal.add(leaf);
		cereal.add(new Leaf("Cheerios", 55));
		cereal.add(new Leaf("Shredded Wheat", 110));
		
		dairy.add(new Leaf("Yogurt", 22));
		dairy.add(new Leaf("Cheese", 44));
		
		// Call the method that is common to both CompositeNode & Leaf objects. 
		// (Dynamic binding and recursion in action.)
		categories.displayNodeOrLeafInfo();		

	}

}


