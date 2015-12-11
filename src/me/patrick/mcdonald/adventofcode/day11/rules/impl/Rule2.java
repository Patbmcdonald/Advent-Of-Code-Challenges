package me.patrick.mcdonald.adventofcode.day11.rules.impl;

import me.patrick.mcdonald.adventofcode.day11.rules.AbstractRule;

/**
 * Passwords may not contain the letters i, o, or l, as these letters can be mistaken for other characters and are therefore confusing.
 * 
 * @author Patrick McDonald - <pmcdonald@viapeople.com>
 *
 */
public class Rule2 extends AbstractRule<String> {
	
	private final String BAD_CHARACTERS = "i l o";
	
	@Override
	public String execute(String password) {
		
		/** We contain a bad character, we failed this rule **/
		if(password.contains(BAD_CHARACTERS))
			return null;
		
		/** We do not contain any bad characters, continue to the next rule **/
		return super.execute(password);

	}
}
