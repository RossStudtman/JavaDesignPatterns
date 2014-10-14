package com.studtman.compositePattern_Candy;

import java.util.ArrayList;

/**
 * The Composite of the Composite Pattern.
 * 
 * @author Ross Studtman
 *
 */
public class Jar implements Component{

	/**
	 * In the "root Jar" this holds other Jars.
	 * In childJars this can hold Jars or Candies.
	 */
	ArrayList<Component> stuffInsideAJar = new ArrayList<Component>();
	
	/**
	 * When we put masking tape on one of grandma's jars and use a permanent 
	 * marker to label what goes in the jar, that's what this name is, the
	 * label on a jar.
	 */
	private String nameOfJar;
	
	/**
	 * Construct a Jar.
	 * 
	 * @param jarName is the label on the Jar.
	 */
	public Jar(String jarName){
		this.nameOfJar = jarName;
	}
	
	/**
	 * Here, in a Jar object, commonMethod should iterate through this
	 * object's collection ("stuffInsideAJar") and recursively find
	 * leaves within the collection.
	 */
	@Override
	public void commonMethod() {
		// Print the label on the Jar.
		System.out.println("Jar label: " + getJarName());
		
		// Iterate over this object's collection.
		for(Component couldBeAJar_couldBeALeaf : stuffInsideAJar){
			
			
			// Recursively call the common method; JVM dynamic binding at work.
				// If a Jar: will iterate through that Jar's ArrayList.
				// If a Candy: will do whatever we have implemented for this method in a Candy object.
			couldBeAJar_couldBeALeaf.commonMethod();
		}		
		
		// After the contents of each jar is printed, output a new line
		System.out.println();
	}

	/**
	 * Add Composite (Jar) or Leaf (Candy) to this object's ArrayList.
	 */
	public void addJarOrCandy(Component jarOrLeaf) {
		stuffInsideAJar.add(jarOrLeaf);		
	}

	/**
	 * Remove Composite (Jar) or Leaf (Candy) from this object's ArrayList.
	 */
	public void removeJarOrCandy(Component jarOrLeaf) {
		stuffInsideAJar.remove(jarOrLeaf);		
	}

	// Getters & Setters
	
	/**
	 * Obtain the label on the Jar.
	 * 
	 * @return a String representing the label of a Jar.
	 */
	protected String getJarName(){
		return nameOfJar;
	}
}
