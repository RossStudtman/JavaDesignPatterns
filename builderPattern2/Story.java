package com.studtman.builderPattern2;

/**
 * Product.
 * 
 * The Product, the complex object being built.
 * 
 * @author Ross Studtman
 *
 */
public class Story {
	// Attributes all stories have
	private String storyType;
	private String[] storyCharacters;
	private String storySetting;
	private String storyPOV;
	private String storyTheme;
	private String storyPlot;
	
	
	// Getters & Setters
	public String getStoryType() {
		return storyType;
	}
	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	public String[] getStoryCharacters() {
		return storyCharacters;
	}
	public void setStoryCharacters(String[] storyCharacters) {
		this.storyCharacters = storyCharacters;
	}
	public String getStorySetting() {
		return storySetting;
	}
	public void setStorySetting(String storySetting) {
		this.storySetting = storySetting;
	}
	public String getStoryPlot() {
		return storyPlot;
	}
	public void setStoryPlot(String storyPlot) {
		this.storyPlot = storyPlot;
	}
	public String getStoryTheme() {
		return storyTheme;
	}
	public void setStoryTheme(String storyTheme) {
		this.storyTheme = storyTheme;
	}
	public String getStoryPOV() {
		return storyPOV;
	}
	public void setStoryPOV(String storyPOV) {
		this.storyPOV = storyPOV;
	}	
	
}
