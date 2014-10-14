package com.studtman.compositePattern_Candy;

public class Client {

	public static void main(String[] args) {
		
		// Jar labels & Candy attribute (ie, how we're sorting the Candy).
		final boolean TASTY = true;
		final boolean ICKY = false;
		
		// Create the Jar that will hold all other Jars.
		Component bigJar = new Jar("Sorted Candies\n");		// has its own ArrayList
		
		// Create child Jars, embedded ArrayLists in these hold Leaf objects (Candy).
		Component tastyJar = new Jar("Tasty Candy");		// has its own ArrayList
		Component ickyJar = new Jar("Icky Candy");			// has its own ArrayList
		
		// Add child jars to parent jar.
		bigJar.addJarOrCandy(tastyJar);
		bigJar.addJarOrCandy(ickyJar);
		
		// Create Candy
		Candy snickers = new Candy("Snickers", TASTY);

		// Add candy to jar
		tastyJar.addJarOrCandy(snickers);

		// Add anonymous Candy to tastyJar
		tastyJar.addJarOrCandy(new Candy("Almond Joy", TASTY));
		tastyJar.addJarOrCandy(new Candy("Peanut M&Ms", TASTY));
		tastyJar.addJarOrCandy(new Candy("Heath Bar", TASTY));
		
		// Add anonymous Candy to ickyJar
		ickyJar.addJarOrCandy(new Candy("Black Licorice", ICKY));
		ickyJar.addJarOrCandy(new Candy("Tootsie Roll", ICKY));
		ickyJar.addJarOrCandy(new Candy("Jelly Beans", ICKY));
		
		// Call the method that is common to both Jar and Candy objects.
			// Dynamic binding and recursion in action.
		bigJar.commonMethod();

	}

}
