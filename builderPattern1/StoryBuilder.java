package com.studtman.builderPattern1;

/**
 * Builder.
 * 
 * 	Template for building Story objects.
 * 	Specifications for which type of Story to construct are given in the Concrete Builder classes.
 *  
 *  Customization of the Story object, via the Concrete Builder, is what creates the different
 *  "types" of Story objects (quotes because they are all of one type: Story).
 * 
 * @author Ross Studtman
 *
 */
public abstract class StoryBuilder {
	
	/*
	 * Which is best:
	 * 		[ ] have the Story object automatically built like below.
	 * 		or,
	 * 		[ ] have a "makeStory()" method that instantiates a Story object
	 * 			and assigns to an instance field?
	 * 		or,
	 * 		[ ] have default constructor instantiate a new Story object and
	 * 			assign to an instance field?
	 * 
	 * 	I have seen the first two and surmise the third.
	 * StackOverflow research: 
	 * http://stackoverflow.com/questions/24551/best-practice-initialize-class-fields-in-constructor-or-at-declaration
	 * 		Summary: if the constructor doesn't modify the field in any way then use assignment at declaration.
	 * 		That is, the below code is fine.
	 * 
	 * Additionally: if you know the value of the variable at declaration time and it wont be changing
	 * then consider making it a final or even final static field. 
	 * 		Note: a final static variable cannot change which object to which it refers
	 * 		but the object to which it refers **can** modify its instance fields. 
	 * 
	 * 		To demonstrate this I added "final static" to the story declaration and it runs fine.
	 */
	protected final static Story story = new Story();
	
	protected String getStoryInfo(){
		return story.toString();
	}
	
	public abstract Story getStory();
	
	public abstract void buildStoryCharacters();
	public abstract void buildStorySetting();
	public abstract void buildStoryPOV();
	public abstract void buildStoryTheme();
	public abstract void buildStoryPlot();
}
