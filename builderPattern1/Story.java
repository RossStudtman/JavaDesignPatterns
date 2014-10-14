package com.studtman.builderPattern1;

import java.util.Arrays;

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
	public String getStoryPOV() {
		return storyPOV;
	}
	public void setStoryPOV(String storyPOV) {
		this.storyPOV = storyPOV;
	}
	public String getStoryTheme() {
		return storyTheme;
	}
	public void setStoryTheme(String storyTheme) {
		this.storyTheme = storyTheme;
	}
	public String getStoryPlot() {
		return storyPlot;
	}
	public void setStoryPlot(String storyPlot) {
		this.storyPlot = storyPlot;
	}
	
	public String toString(){
		
		StringBuilder info = new StringBuilder();
		
		info.append("Story Complete\n");
		
		// Obtain only the java Class name
		String regex = "\\.";
		String[] split = (getStoryType()).split(regex);		
		String storyType = split[split.length -1];
		
		info.append("Story type: " + storyType +"\n");
		info.append("Story characters: " + Arrays.toString(getStoryCharacters()) +"\n");
		info.append("Story setting: " +getStorySetting() +"\n");
		info.append("Story POV: " + getStoryPOV() +"\n");
		info.append("Story theme: " + getStoryTheme() +"\n");
		info.append("Story plot: \n" + getStoryPlot() +"\n");

		return info.toString();
	}
	
	
}
