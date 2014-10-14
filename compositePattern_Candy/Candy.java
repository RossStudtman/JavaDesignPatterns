package com.studtman.compositePattern_Candy;

/**
 * The Leaf of the Composite Pattern.
 * 
 * @author Ross Studtman
 *
 */
public class Candy implements Component {

	// Any fields you want
	private String candyName;
	private boolean delicious; 
	
	/**
	 * Make a Candy object.
	 * 
	 * @param name is name of Candy.
	 * @param tasty is a boolean that tells us whether we like the
	 * Candy or not.
	 */
	protected Candy(String name, boolean tasty){
		this.candyName = name;
		this.delicious = tasty;
	}

	@Override
	public void commonMethod() {
		if(isDelicious()){
			oops();
		}else{
			System.out.println(getCandyName() + " is delicious: " +isDelicious());
		}		
	}	
	
	/**
	 * Just a method to demonstrate some kind of functionality within a 
	 * leaf object. 
	 * 
	 * <p> The oops() method reports that the program ate a delicious Candy.</p>
	 */
	private void oops(){
		System.out.println("Oops! " +getCandyName() +" is delicious! I ate that one.");
	}
	
	
	///////////////////////////////////////////////////////////////////////////////	
	//// Getters & Setters													 ////
	///////////////////////////////////////////////////////////////////////////////	
	
	/**
	 * Obtain Candy's name.
	 * @return Candy's name.
	 */
	public String getCandyName() {
		return candyName;
	}

	/**
	 * Do we want to eat the Candy?
	 * @return <code>true</code> if we want to eat the Candy, else
	 * <code>false</code> if Candy is icky.
	 */
	public boolean isDelicious() {
		return delicious;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////	
	//// Methods required by interface. Consider using Abstract Class instead. ////
	///////////////////////////////////////////////////////////////////////////////
	
	/**
	 * If you do not want to see these empty "add" and "remove" methods then consider 
	 * making the Component an Abstract Class instead of an Interface. Then use empty
	 * methods inside the Abstract Class and only declare the "common method" used for
	 * recursion as abstract thus forcing all children to implement it.  
	 */
	@Override
	public void addJarOrCandy(Component jarOrLeaf) {
		// Do nothing in a Leaf.		
	}

	/**
	 * If you do not want to see these empty "add" and "remove" methods then consider 
	 * making the Component an Abstract Class instead of an Interface. Then use empty
	 * methods inside the Abstract Class and only declare the "common method" used for
	 * recursion as abstract thus forcing all children to implement it.  
	 */
	@Override
	public void removeJarOrCandy(Component jarOrLeaf) {
		// Do nothing in a Leaf.		
	}



}
