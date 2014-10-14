package com.studtman.builderPattern2;

/**
 * Director.
 * 
 * 	Directs the customization of the complex object.
 * 
 * @author Ross Studtman
 *
 */
public class StoryDirector {
	
	// Concrete Builder cast as Builder.
	private StoryBuilder storyBuilder;
	
	// Constructor receives Concrete Builder (that is cast as Builder).
	public StoryDirector(StoryBuilder sb){
		storyBuilder = sb;
	}
	
	// Direct the putting together/customization/modification of the Story object.
	public void putStoryTogether(){
		storyBuilder.buildStoryCharacters();
		storyBuilder.buildStoryPlot();
		storyBuilder.buildStorySetting();
		storyBuilder.buildStoryTheme();
		storyBuilder.buildStoryPOV();
	}
	
	// Return Concrete Builder (that is cast as Builder).
	public Story getStory(){
		return storyBuilder.getProduct();
	}
}
