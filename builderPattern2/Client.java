package com.studtman.builderPattern2;

import java.util.Arrays;

/**
 * Client.
 * 
 *  The client needs to create a Concrete Builder & a Director.
 * 	The Concrete Builder (cast as its superclass) is passed to the 
 * 	Director's constructor, the ConcreteBuilder having a Story object
 * 	composition. The director "directs" modifies the Story object.
 * 
 * @author Ross Studtman
 *
 */
public class Client {

	public static void main(String[] args) {
		 
		StoryBuilder scaryStory = new ScaryStoryBuilder();
		
		StoryDirector director = new StoryDirector(scaryStory);
		
		director.putStoryTogether();
		
		Story firstScaryStory = director.getStory();
		
		System.out.println("Story complete");
		
		System.out.println("Story type: " + firstScaryStory.getStoryType());
		System.out.println("Story characters: " + Arrays.toString(firstScaryStory.getStoryCharacters()));
		System.out.println("Story setting: " +firstScaryStory.getStorySetting());
		System.out.println("Story POV: " + firstScaryStory.getStoryPOV());
		System.out.println("Story theme: " + firstScaryStory.getStoryTheme());
		System.out.println("Story plot: \n" + firstScaryStory.getStoryPlot());

	}

}
