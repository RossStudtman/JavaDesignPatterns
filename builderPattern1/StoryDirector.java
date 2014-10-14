package com.studtman.builderPattern1;

/**
 * Director.
 * 
 * Direct the customization of the complex object.
 * 
 * @author Ross Studtman
 *
 */
public class StoryDirector {

	public void putStoryTogether(StoryBuilder storyBuilder){
		storyBuilder.buildStoryCharacters();
		storyBuilder.buildStoryPlot();
		storyBuilder.buildStorySetting();
		storyBuilder.buildStoryTheme();
		storyBuilder.buildStoryPOV();
	}
}
