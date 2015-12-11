package me.patrick.mcdonald.adventofcode.day11.rules.impl;

import me.patrick.mcdonald.adventofcode.day11.rules.AbstractRule;

/**
 * Passwords must include one increasing straight of at least three letters
 * 
 * @author Patrick McDonald - <pmcdonald@viapeople.com>
 *
 */
public class Rule1 extends AbstractRule<String> {
	
	private final int AMOUNT_OF_LETTERS = 3;
	
	@Override
	public String execute(String password) {
		
		 for(int i = 0;i < password.length() - AMOUNT_OF_LETTERS; i++) {
			 
	            int count = 0;
	            
	            for(int j = 0; j < AMOUNT_OF_LETTERS; j++) {
	                if(password.charAt(i + j) == (password.charAt(i) + j))
	                    count ++;
	            }
	            
	            /** We are a valid Password, continue to next rule **/
	            if(count == AMOUNT_OF_LETTERS) 
	            	return super.execute(password);
	        }

		
		 /** not Valid **/
		return null;
	}
}
