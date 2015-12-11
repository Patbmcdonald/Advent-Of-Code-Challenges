package me.patrick.mcdonald.adventofcode.day11.rules.impl;

import me.patrick.mcdonald.adventofcode.day11.rules.AbstractRule;

/**
 * Passwords must contain at least two different, non-overlapping pairs of letters, like aa, bb, or zz.
 * 
 * @author Patrick McDonald - <pmcdonald@viapeople.com>
 *
 */
public class Rule3 extends AbstractRule<String> {
	
	private final int NUMBER_OF_COUNT = 2;
	
	@Override
	public String execute(String password) {
		
		int currentCount = 0;
		 for(int i = 0; i < password.length() - 1; i++) {
	            if(password.charAt(i) == password.charAt(i + 1)) {
	            	currentCount++; // currentCount;
	                i++; // move us one more
	            }
	            
	            /** We are 2 or more repated characters **/
	            if(currentCount >= NUMBER_OF_COUNT)
	            	return super.execute(password);
	        }

		
		 /** not Valid **/
		return null;
	}
}
