package com.studtman.compositePattern_Candy;

/**
 * The Component of a Composite Pattern.
 * 
 * This Interface should contain the method common to composites & leaves
 * so that this method can be recursively called.
 * 
 * <p>Restated for this program: The Component interface contains a method
 * that is common to both Jars and Candies so that when this method is
 * recursively called it can perform iteration on Jars and can do whatever
 * we want to do with Candies.</p>
 * 
 * <p>A better name if this wasn't a tutorial might be "CandyCategories"</p>
 * 
 * <p>The methods with JarInterface were removed from here because I did not
 * want Candy to be forced to implement empty methods. Hence this interface 
 * now extends JarInterface</p>
 * 
 * @author Ross Studtman
 *
 */
public interface Component{

	/**
	 * The method common to Jar (Composite) and Leaf (Candy) objects that can be
	 * recursively called.
	 */
	public void commonMethod();
	
	/**
	 * Since we will be casting both Jars and Candy objects as this interface type
	 * then we will only be able to call methods that are within this interface.
	 * 
	 * <p>This method is to add either Jar or Candy to the collection used by Jar.java;
	 * which is an ArrayList for this tutorial</p>
	 * 
	 * @param jarOrLeaf is a Jar or Leaf object.
	 */
	public void addJarOrCandy(Component jarOrLeaf);
	
	/**
	 * Since we will be casting both Jars and Candy objects as this interface type
	 * then we will only be able to call methods that are within this interface.
	 * 
	 * <p>This method is to remove either a Jar or a Candy from the collection used by Jar.java
	 * to store Jar and Candy objects; which is an ArrayList for this tutorial</p>
	 * 
	 *  @param jarOrLeaf is a Jar or Leaf object.
	 */
	public void removeJarOrCandy(Component jarOrLeaf);

}
