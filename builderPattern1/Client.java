package com.studtman.builderPattern1;

/**
 * Client.
 * 
 * 	The client needs to create a Concrete Builder & a Director.
 * 	The Concrete Builder (cast as its superclass) is passed to the 
 * 	Director for modification.
 * 
 * @author Ross Studtman
 *
 */
public class Client {

	public static void main(String[] args) {
		
		StoryBuilder firstScaryStory = new ScaryStoryBuilder();
		StoryBuilder secondScaryStory = new ScaryStoryBuilder();
		
		StoryDirector director = new StoryDirector();
		director.putStoryTogether(firstScaryStory);
		director.putStoryTogether(secondScaryStory);
		
		System.out.println(firstScaryStory.getStoryInfo());
		System.out.println();
		System.out.println(secondScaryStory.getStoryInfo());

	}

}