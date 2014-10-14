package com.studtman.strategyPattern;
/**
 * <h1> 
 * The basic idea: classes encapsulating algorithms. </br></h1>
 * <p>
 * Related "behaviors" (like different modes of flying) that an object
 * (like a duck) might have are encapsulated in classes that share an interface that describes a method common
 * to the related behaviors. Now a class that models one of those related behaviors can be created and assigned
 * to an instance variable of the interface's type, i.e., <b>the behavior is compositionally added to the object</b>.
 * Dynamically changing the behavior is as simple as assigning a different class to the instance variable.
 *  </p>
 *  
 * <p>Followed this tutorial (but changed the code):</p>
 * <p>https://www.youtube.com/watch?v=owss5KuioFs&index=8&list=PLGLfVvz_LVvSuz6NuHAzpM52qKM6bPlCV</p>
 * 	<ul>
 * 		<li>"The ability to dynamically change algorithms used by objects at runtime."</li>
 * 		<li>"Classes can be used to encapsulate algorithms."</li>
 * 		<li>"Replacing conditionals (if-then; switch) with polymorphism."</li>
 * 	</ul>
 * 		
 * </p>
 * <p>A great tutorial using SimUDuck: http://itewbm.tistory.com/29</p>

 */
public class StrategyPattern {

	public static void main(String[] args) {

		SuperClass subclassA = new SubclassA(5, 5);
		SuperClass subclassB = new SubclassB(9, 9);
		
		System.out.println("subclassA says, \"" +subclassA.getAlgorithmInfo() +"\", result: " +subclassA.getAlgorithmResult());
		System.out.println("subclassB says, \"" +subclassB.getAlgorithmInfo() +"\", result: " +subclassB.getAlgorithmResult());
		
		System.out.println("\nDynamically change algorithms:\n");
		
		// dynamically change the algorithm the classes use.
		subclassA.setAlgorithm(new MultiplyNumbers());
		subclassB.setAlgorithm(new MultiplyNumbers());
		
		System.out.println("subclassA says, \"" +subclassA.getAlgorithmInfo() +"\", result: " +subclassA.getAlgorithmResult());
		System.out.println("subclassB says, \"" +subclassB.getAlgorithmInfo() +"\", result: " +subclassB.getAlgorithmResult());
	}

}

////////	ALGORITHMS ENCAPSULATED IN CLASSES //////////
/*
* 	Original tutorial used Pay interface and classes:
* 		NoBonus, GetBonus, Bonus20Percent
* 		...each implementing the Pay interface.
*/
interface Algorithm{
	int performAlgorithm(int first, int second);
	String getInfo();
}

/*
 * This wasn't part of the original tutorial. I got to thinking "what if I want to hold some instance data" inside
 * the modeled behavior (ie, class with algorithm)? So I made a superclass to the algorithm classes. 
 * 		A tiny hitch: at first I forgot to add the getInfo() method to the Interface forgetting that clients can only see
 * 		methods that are available in the Interface. 
 */
abstract class AlgorithmSuperClass{
	private String info;
	
	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo(){
		return info;
	}
}

// First algorithm
class AddNumbers extends AlgorithmSuperClass implements Algorithm{
	
	public AddNumbers(){
		setInfo("I add numbers.");
	}

	@Override
	public int performAlgorithm(int first, int second) {
		return first + second;
	}	
}

// Second algorithm
class MultiplyNumbers extends AlgorithmSuperClass implements Algorithm{	

	public MultiplyNumbers() {
		setInfo("I multiply numbers.");
	}

	@Override
	public int performAlgorithm(int first, int second) {
		return first * second;
	}	
}

// ...and any number of other algorithms you could want.
// ...Switching algorithms at runtime is painless.


/////////	OBJECTS. Original tutorial used Employee, Salesman, Secretary. //////////
/*
 * SuperClass
 */
class SuperClass{
	String info = "I do math.";
	int number1 = 0;
	int number2 = 0;
	
	// Interface type holding a class that encapsulates the desired algorithm.
	Algorithm algorithm = new AddNumbers();

	public SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public SuperClass(int number1, int number2, Algorithm algorithm){
		this.number1 = number1;
		this.number2 = number2;
		this.algorithm = algorithm;
	}
	
	// Able to dynamically change algorithms applied to object at runtime.
	public void setAlgorithm(Algorithm newAlgorithmType){
		this.algorithm = newAlgorithmType;
	}
	
	public int getAlgorithmResult(){
		return algorithm.performAlgorithm(number1, number2);
	}	
	
	public String getAlgorithmInfo(){
		return algorithm.getInfo();
	}
}

/*
 * Subclass A
 */
class SubclassA extends SuperClass{

	public SubclassA(int number1, int number2) {
		super(number1, number2);
	}

	public SubclassA(int number1, int number2, Algorithm algorithm) {
		super(number1, number2, algorithm);
	}	
}

/*
 * Sublcass B
 */
class SubclassB extends SuperClass{
	
	public SubclassB(int number1, int number2) {
		super(number1, number2);
	}

	public SubclassB(int number1, int number2, Algorithm algorithm) {
		super(number1, number2, algorithm);
	}
}
