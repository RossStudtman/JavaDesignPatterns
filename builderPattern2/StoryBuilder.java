package com.studtman.builderPattern2;

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
public interface StoryBuilder {
	public Story getProduct();
	public void buildStoryCharacters();
	public void buildStorySetting();
	public void buildStoryPOV();
	public void buildStoryTheme();
	public void buildStoryPlot();
	
}
