package com.studtman.builderPattern2;


/**
 * Concrete Builder.
 * 
 *  This is the concrete implementation of the Builder template. This class
 * 	MUST contain the modifications we expect all Story objects to have done
 * 	to them (as defined in the Interface or Abstract Class).
 * 
 * 	NOTE: ScaryStoryBuilder is not a subclass of Story. Rather, it is the
 * 	modification and customization of a Story object into a ScaryStory; but
 * 	ScaryStory is NOT a type.
 * 
 * 	Said another way: This whole program only builds Story objects. 
 * 	Each "Concrete Builder" simply modifies the Story object to a
 * 	different set of specifications.
 * 
 * 	The Concrete Builder clearly needs a reference to the Story object
 * 	being modified. The code below implements an Interface so the Story
 * 	object needs to be constructed here. 
 * 
 * @author Ross Studtman
 *
 */
public class ScaryStoryBuilder implements StoryBuilder {
	
	private Story story;
	
	public ScaryStoryBuilder(){
		this.story = new Story();
		
		// Obtain only the java Class name, set as Story's type
		String[] storyType = this.getClass().toString().split("\\.");		
		story.setStoryType(storyType[storyType.length -1]);		
	}

	@Override
	public Story getProduct() {
		return story;
	}

	@Override
	public void buildStoryCharacters() {
		
		// These items could be stored in a Map, Protag string : protag characterization string
//		getProtagonist();
//		getProtagonistCharacterization();
//		getAntagonist();
//		getAntagonistCharacterization();
		
		story.setStoryCharacters(new String[]{"Protagonist: YoungKid", "Antagonist: EvilClown"});		
	}

	@Override
	public void buildStorySetting() {
		
//		getPlace();
//		getTime();
//		getWeather();
//		getMood();
//		getSocialAtmospher();
		
		story.setStorySetting("Springfield, Missouri");		
	}

	@Override
	public void buildStoryPOV() {
		
		String[] pov = new String[]{"First Person", "Second Person", "Third Person Omniscient Subjective", "Third Person Omniscient Limited Subjective", "Third Person Omniscient Objective"};
		
		String choice = pov[(int)(Math.random() * pov.length)];
		
		story.setStoryPOV(choice);		
	}

	@Override
	public void buildStoryTheme() {
		
		String[] themes = new String[]{"Sexual Desires have consequences", "You need friends", "Maybe you don't need friends", "Fear is a mind killer", "Betraying your moral code is bad"};
		
		String choice = themes[(int)(Math.random() * themes.length)];
		
		story.setStoryTheme(choice);
		
	}

	@Override
	public void buildStoryPlot() {
		
		StringBuilder plot = new StringBuilder();
		
		// Probably each of these plot methods deserves to be in the Builder Interface but will do it this way for now.		
		plot.append("\tExposition: " + getExposition() 					+"\n" );
		plot.append("\tInciting Incident: " + getIncitingIncident() 	+"\n" );
		plot.append("\tRising Action: " + getRisingAction() 			+"\n" );
		plot.append("\tConflict: " + getConflict() 						+"\n" );	
		plot.append("\tClimax: " + getClimax() 							+"\n" );
		plot.append("\tFalling Action: " + getFallingAction() 			+"\n" );
		plot.append("\tResolution: " + getResolution() 					+"\n" );
		
		story.setStoryPlot(plot.toString());		
	}
	
	/**
	 * Introduce main characters & story
	 */
	private String getExposition(){
		return "Timmy smiles warmly as his mom tucks him into bed.";
	}
	
	/**
	 * That moment where conflict begins.
	 */
	private String getIncitingIncident(){
		return "Out went the lights, then a giggle was heard from under the bed.";
	}
	
	/**
	 * Build up of events to climax.
	 */
	private String getRisingAction(){
		return "The giggles get louder, there's movement from beneath the bed. A voice, \"Timmy, float with me!\"";
	}
	
	private String getConflict() {
		return "Timmy, the terror rising with each giggle and grumph from beneath the bed, can't decide if it is better to run for the door or lie still as a corpse.";		
	}
	
	/**
	 * Protagonist's big decision.
	 */
	private String getClimax(){
		return "Timmy in a moment of wild courage bursts from his bed; his bedding trips him up; he flops to the floor; something grabs him...";
	}

	/**
	 * Dark night of the soul. Things couldn't get worse. The moment before resolution.
	 */
	private String getFallingAction(){
		return "Timmy accidentally looks back, sees the overly large, yellow glowing eyes surrounded by clown paint; he kicks wildly to free himself...";
	}

	/**
	 * The mystery is solved. Protagonist changed; world changed; new world entered.
	 */
	private String getResolution() {
		return "Timmy yells for his mom, feels a well-placed kick hit its mark and frees himself! The door to his room bursts open and his mom is there clutching a bat, she leaps in swingng like Babe Ruth...";		
	}

}
