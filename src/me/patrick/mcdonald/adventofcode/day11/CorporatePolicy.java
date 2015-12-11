package me.patrick.mcdonald.adventofcode.day11;

import java.util.Scanner;

import me.patrick.mcdonald.adventofcode.AdventOfCode;
import me.patrick.mcdonald.adventofcode.day11.rules.RuleManager;
import me.patrick.mcdonald.adventofcode.day11.rules.impl.Rule1;
import me.patrick.mcdonald.adventofcode.day11.rules.impl.Rule2;
import me.patrick.mcdonald.adventofcode.day11.rules.impl.Rule3;

/**
 * Corporate Policy uses
 * 
 * Advent of Code
 * 
 * @author Patrick McDonald - <pmcdonald@viapeople.com>
 *
 */
public class CorporatePolicy extends AdventOfCode {

	/** Rule Manager to execute rules in order **/
	private RuleManager<String> _ruleManager;

	
	public CorporatePolicy(){
		startCounter();
		init();
	}
	
	/** init method **/
	public void init(){
		/** Rule Manager **/
		_ruleManager = new RuleManager<String>();
		
		/** Rules **/
		_ruleManager.addRule(new Rule1());
		_ruleManager.addRule(new Rule2());
		_ruleManager.addRule(new Rule3());
		
		run();
		
	}
	
	/**
	 * 
	 */
	public void run(){
		
		boolean isRunning = true;
		boolean isCalculating = true;
		Scanner scanner = new Scanner(System.in);
		
		while(isRunning){
			
			System.out.println("Please Enter a password to try");
			
			try {
				
				String currentString = scanner.next();
			
				if(currentString.length() != 8)
					throw new Exception("You must enter a password of 8 characters!");
				
				String currentPassword = currentString;
				
				while(isCalculating){
					
					/** We are a valid password **/
					if(validPassword(currentPassword))
						break;
					
					/** Next password **/
					currentPassword = getIncrementedString(currentPassword); // increment us 
				}

				if(currentPassword != null)
					System.out.println("A valid password = " + currentPassword);

			} catch(Exception e){
				System.out.println("[Invalid Option] " + e.getMessage());
				continue;
			}
		}
		
		scanner.close();
	}
	
	/**
	 * Is this a valid password?
	 * 
	 * @param password
	 * @return
	 */
	public boolean validPassword(String password){
		
		return _ruleManager.filterRequest(password) != null ? true : false;
	
		/**
		 * 
		 * 
			String validPassword = _ruleManager.filterRequest(password);
			if(validPassword != null)
				return true;
			else{
				System.out.println("invalid Pass " + password);
				return false;
			}
		**/
	}
	
	/**
	 * Incremented String
	 * 
	 * @param Password 
	 * @return
	 */
	public static String getIncrementedString(String password) {
		int length = password.length();
		char c = password.charAt(length - 1);

		 if(c == 'z')
		   return length > 1 ? getIncrementedString(password.substring(0, length - 1)) + 'a' : "aa";

		return (password.substring(0, length - 1) + (++c));
	}	   
	
	public static void main(String[]  args){
		new CorporatePolicy();
	}

}
